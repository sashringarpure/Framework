package com.fanatics.seed;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.post;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.containsString;
import org.junit.Assert;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

public class RestAssured {

	public String validateWindowTitleUsingGet(String title,String url) {
		Response response = expect().body("title",equalTo(title)).when().get(url);
		return response.getBody().asString();
	}
	
	public void validateWindowTitleUsingAuthenticationAndGet(String user,String pass, String title, String url) {
		expect().body("title",equalTo(title)).given().auth().basic(user, pass).when().get(url);
	}
	
	public void validateWindowTitleUsingPost(String title,String url) {
		expect().body("title",equalTo(title)).when().post(url);
	}
	
	public void validateWindowTitleUsingAuthenticationAndPost(String user,String pass, String title, String url) {
		expect().body("title",equalTo(title)).given().auth().basic(user, pass).when().post(url);
	}
	
	public void validateStatusCodeUsingGet(String url, int code) {
		get(url).then().statusCode(code);
	}
	
	public void validateStatusCodeUsingAuthenticationAndGet(String user, String pass, String url, int code) {
		given().auth().basic(user, pass).when().get(url).then().statusCode(code);
	}
	
	public void validateStatusCodeUsingPost(String url, int code) {
		post(url).then().statusCode(code);
	}
	
	public void validateStatusCodeUsingAuthenticationAndPost(String user, String pass, String url, int code) {
		given().auth().basic(user, pass).when().post(url).then().statusCode(code);
	}
	
	public void validateItemUsingGet(String url, String tagName, String expectedValue) {
		get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndGet(String user, String pass, String url, String tagName, String expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingGet(String url, String tagName, int expectedValue) {
		get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndGet(String user, String pass, String url, String tagName, int expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingGet(String url, String tagName, float expectedValue) {
		get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndGet(String user, String pass, String url, String tagName, float expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingPost(String url, String tagName, String expectedValue) {
		post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndPost(String user, String pass, String url, String tagName, String expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingPost(String url, String tagName, int expectedValue) {
		post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndPost(String user, String pass, String url, String tagName, int expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingPost(String url, String tagName, float expectedValue) {
		post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateItemUsingAuthenticationAndPost(String user, String pass, String url, String tagName, float expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,equalTo(expectedValue));
	}
	
	public void validateListUsingGet(String url, String tagName, String expectedValue) {
		get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndGet(String user, String pass, String url, String tagName, String expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingGet(String url, String tagName, int expectedValue) {
		get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndGet(String user, String pass, String url, String tagName, int expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingGet(String url, String tagName, float expectedValue) {
		get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndGet(String user, String pass, String url, String tagName, float expectedValue) {
		given().auth().basic(user, pass).when().get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingPost(String url, String tagName, String expectedValue) {
		get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndPost(String user, String pass, String url, String tagName, String expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingPost(String url, String tagName, int expectedValue) {
		get(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndPost(String user, String pass, String url, String tagName, int expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingPost(String url, String tagName, float expectedValue) {
		post(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateListUsingAuthenticationAndPost(String user, String pass, String url, String tagName, float expectedValue) {
		given().auth().basic(user, pass).when().post(url).then().assertThat().body(tagName,hasItems(expectedValue));
	}
	
	public void validateResponseContainsStringWithOneInputParamUsingPost(String key1, String value1, String url, String expectedResponseString) {
		given().
				param(key1,value1).
		when().
				post(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithOneInputParamUsingAuthenticationAndPost(String username, String password, String key1, String value1, String url, String expectedResponseString) {
		given().
				auth().
				basic(username,password).
				param(key1,value1).
		when().
				post(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithOneInputParamUsingGet(String key1, String value1, String url, String expectedResponseString) {
		given().
				param(key1,value1).
		when().
				get(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithOneInputParamUsingAuthenticationAndGet(String username, String password, String key1, String value1, String url, String expectedResponseString) {
		given().
				auth().
				basic(username,password).
				param(key1,value1).
		when().
				get(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithTwoInputParamUsingPost(String key1, String value1, String key2, String value2, String url, String expectedResponseString) {
		given().
				param(key1,value1).
				param(key2,value2).
		when().
				post(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithTwoInputParamUsingGet(String key1, String value1, String key2, String value2, String url, String expectedResponseString) {
		given().
				param(key1,value1).
				param(key2,value2).
		when().
				get(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public void validateResponseContainsStringWithThreeInputParamUsingPost(String key1, String value1, String key2, String value2, String key3, String value3, String url, String expectedResponseString) {
		given().
				param(key1,value1).
				param(key2,value2).
				param(key3,value3).
		when().
				post(url).
		then().
				body(containsString(expectedResponseString));
	}
	
	public String validateResponseContainsStringWithThreeInputParamUsingGet(String key1, String value1, String key2, String value2, String key3, String value3, String url, String expectedResponseString) {
		ValidatableResponse response = given().
				param(key1,value1).
				param(key2,value2).
				param(key3,value3).
		when().
				get(url).
		then().
				body(containsString(expectedResponseString));
		return response.toString();
	}
	
	public String JSONResponseUsingGet(String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().body(requestBody).contentType("application/json").when().get(url);
		return response.getBody().asString();
	}
	
	public String XMLResponseUsingGet(String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().body(requestBody).contentType("application/xml").when().get(url);
		return response.getBody().asString();
	}
	
	public String XMLResponseUsingPost(String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().body(requestBody).contentType("application/xml").when().post(url);
		return response.getBody().asString();
	}
	
	public String XMLResponseUsingAuthenticationAndGet(String user, String pass, String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().auth().basic(user, pass).body(requestBody).contentType("application/xml").when().get(url);
		return response.getBody().asString();
	}
	
	public String XMLResponseUsingAuthenticationAndPost(String user, String pass, String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().auth().basic(user, pass).body(requestBody).contentType("application/xml").when().post(url);
		return response.getBody().asString();
	}
	
	public String JSONResponseUsingAuthenticationAndGet(String user,String pass, String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().auth().basic(user, pass).body(requestBody).contentType("application/json").when().get(url);
		return response.getBody().asString();
	}
	
	public String JSONResponseUsingPost(String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().body(requestBody).contentType("application/json").when().post(url);
		return response.getBody().asString();
	}
	
	public String JSONResponseUsingAuthenticationAndPost(String user,String pass, String url, int code, String requestBody) {
		Response response = expect().statusCode(code).given().auth().basic(user, pass).body(requestBody).contentType("application/json").when().post(url);
		return response.getBody().asString();
	}

	public void PostRequestUsingJson(String url, String payload, String param, String value) {
		Response res = given().contentType("application/json").body(payload).when().post(url);
		Assert.assertEquals(new JsonPath(res.asString()).get(param).toString(), value);
		//Assert.assertEquals(new JsonPath(given().contentType("application/json").body(payload).when().post(url).toString()).get(param).toString(), value);
	}
}
