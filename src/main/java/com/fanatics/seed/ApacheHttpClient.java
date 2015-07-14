package com.fanatics.seed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.util.EntityUtils;

public class ApacheHttpClient {

	private HttpClient httpClient;
	private HttpGet getRequest;
	private HttpResponse response;
	private HttpPost postRequest;
	private StringEntity payload;
	private BufferedReader br;
	private HttpEntity entity;
	private CredentialsProvider cp;
	private UsernamePasswordCredentials upc;
	
	public ApacheHttpClient(String url) {
		httpClient = HttpClientBuilder.create().build();
		getRequest = new HttpGet(url);
		postRequest = new HttpPost(url);
	}
	
	public ApacheHttpClient(String url, String input, String user, String pwd) {
		cp = new BasicCredentialsProvider();
		upc = new UsernamePasswordCredentials(user,pwd);
		cp.setCredentials(AuthScope.ANY, upc);
		httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(cp).build();
		getRequest = new HttpGet(url);
		postRequest = new HttpPost(url);
	}
	
	public void addHeaderToGetRequest(String key, String value) {
		getRequest.addHeader(key, value);
	}
	
	public void addHeaderToPostRequest(String key, String value) {
		postRequest.addHeader(key, value);
	}
	
	public boolean executeGetRequest() {
		boolean flag = true;
		try {
			this.response = this.httpClient.execute(this.getRequest);
		}  catch (ClientProtocolException cpe) {
			flag = false;
		} catch (IOException ioe) {
			flag = false;
		}
		return flag;
	}
	
	public boolean executePostRequest() {
		boolean flag = true;
		try {
			this.response = this.httpClient.execute(this.postRequest);
		}  catch (ClientProtocolException cpe) {
			flag = false;
		} catch (IOException ioe) {
			flag = false;
		}
		return flag;
	}
	
	public void shutdownHttpClientConnection() {
		this.httpClient.getConnectionManager().shutdown();
	}
	
	public boolean setStringEntity(String input) {
		boolean flag = true;
		try {
			this.payload = new StringEntity(input);
		} catch (UnsupportedEncodingException uee) {
			flag = false;
		}
		return flag;
	}
	
	public void setContentTypeJson() {
		this.payload.setContentType("application/json");
	}
	
	public void setContentTypeXML() {
		this.payload.setContentType("application/xml");
	}
	
	public void setEntityForPostRequest() {
		this.postRequest.setEntity(this.payload);
	}
	
	public BufferedReader getContentFromBufferedReader() {
		try {
			this.br = new BufferedReader(new InputStreamReader((this.response.getEntity().getContent())));
		} catch (IOException ioe) {
			this.br = null;
		}
		return br;
	}
	
	public String getContentFromEntity() {
		String result;
		this.entity = this.response.getEntity();
		try {
			result = EntityUtils.toString(entity);
		} catch (IOException e) {
			result = "Exception";
		}
		return result;
	}

}
