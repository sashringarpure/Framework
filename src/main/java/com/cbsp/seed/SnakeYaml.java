package com.cbsp.seed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class SnakeYaml {
	
	private Yaml yaml;
	
	public SnakeYaml() {
		this.yaml = new Yaml();
	}
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,String> readSimpleYamlFile(String filePath) throws FileNotFoundException {
		return (Map<String,String>) this.yaml.load(new FileInputStream(new File(filePath)));
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String, Map<String,String>> readOneNestedLayerYamlFile(String filePath) throws FileNotFoundException {
		return (Map<String,Map<String,String>>) this.yaml.load(new FileInputStream(new File(filePath)));
	}
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,Map<String,Map<String,String>>> readTwoNestedLayersYamlFile(String filePath) throws FileNotFoundException {
		return (Map<String,Map<String,Map<String,String>>>) this.yaml.load(new FileInputStream(new File(filePath)));
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,String> readQAEnvYamlFile(String filePath) throws FileNotFoundException {
		return this.readSimpleYamlFile(filePath);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,String> readPartnerUrlYamlFile(String filePath) throws FileNotFoundException {
		return this.readSimpleYamlFile(filePath);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,Map<String,Map<String,String>>> readProductInfoFile(String filePath) throws FileNotFoundException {
		return this.readTwoNestedLayersYamlFile(filePath);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	private Map<String,Map<String,Map<String,String>>> readDomElementsFile(String filePath) throws FileNotFoundException {
		return this.readTwoNestedLayersYamlFile(filePath);
	}
	
	/**
	 * 
	 * @param filePath
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 */
	public String getQAEnvFromYamlFile(String filePath, String key) throws FileNotFoundException {
		return this.readQAEnvYamlFile(filePath).get(key);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	public ArrayList<String> getPartnerUrlFromYamlFile(String filePath) throws FileNotFoundException {
		ArrayList<String> partnerURL = new ArrayList<String>();
		Map<String,String> values = this.readPartnerUrlYamlFile(filePath);
		for (String key: values.keySet()) {
			partnerURL.add(values.get(key));
		}
		return partnerURL;
	}
	
	/**
	 * 
	 * @param filePath
	 * @param key
	 * @param env
	 * @return
	 * @throws FileNotFoundException
	 */
	public String getProductInfoFromYamlFile(String filePath, String env, String partnerId, String key) throws FileNotFoundException {
		Map<String,String> subSubValues = null;
		Map<String,Map<String,String>> subvalues = null;
		Map<String,Map<String,Map<String,String>>> values = this.readProductInfoFile(filePath);
		for (String environment : values.keySet()) {
			if ( environment.equals(env)) {
				subvalues = values.get(environment);
			}
		}
		for (String partner : subvalues.keySet()) {
			if ( partner.equals(partnerId)) {
				subSubValues = subvalues.get(partner);
			}
		}
		return subSubValues.get(key);
	}
	
	public Map<String, String> getDomElementsFromYamlFile(String filePath, String env, String partnerId) throws FileNotFoundException {
		Map<String,String> subSubValues = null;
		Map<String,Map<String,String>> subvalues = null;
		Map<String,Map<String,Map<String,String>>> values = this.readDomElementsFile(filePath);
		for (String environment : values.keySet()) {
			if (environment.equals(env)) {
				subvalues = values.get(environment);
			}
		}
		for (String partner : subvalues.keySet()) {
			if ( partner.equals(partnerId)) {
				subSubValues = subvalues.get(partner);
			}
		}
		return subSubValues;
	}
	
	public Map<String,String> getShippingAddresses(String filePath) throws FileNotFoundException {
		return this.readSimpleYamlFile(filePath);
	}
	
	/*
	 * for (String key : values.keySet()) {
			Map<String, String> subValues = values.get(key);
			System.out.println(key);
 
			for (String subValueKey : subValues.keySet()) {
				System.out.println(String.format("\t%s = %s",
						subValueKey, subValues.get(subValueKey)));
			}
		}
	 */

}
