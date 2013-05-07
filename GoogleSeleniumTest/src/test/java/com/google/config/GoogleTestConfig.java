package com.google.config;

import java.io.IOException;
import java.util.Properties;

public class GoogleTestConfig {

	private static GoogleTestConfig instance = new GoogleTestConfig();
	
	private Properties properties = new Properties();
	
	private GoogleTestConfig() {
		try {
			properties.load(GoogleTestConfig.class.getResourceAsStream("/google.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Method returns the instance of the GoogleTestConfig class.
	public static GoogleTestConfig getInstance() {
		return instance;
	}
	
	
	/* Method returns the target website's URL from the "google.properties" document. 
	 * @ com.google.baseUrl - placeholder for the target website URL.  
	*/
	public String getBaseUrl() {
		return properties.getProperty("com.google.baseUrl");
	}
	
	/* Method returns the target website's URL from the "google.properties" document. 
	 * @ com.google.searchTerm - placeholder for the search term desired.  
	*/
	public String getSearchTerm() {
		return properties.getProperty("com.google.searchTerm");
	}
	
	
	
	
}
