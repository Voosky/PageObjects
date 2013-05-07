package com.google.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.config.GoogleTestConfig;

public class SearchEngineHelper {

	GoogleTestConfig config = GoogleTestConfig.getInstance();
	
	@FindBy(id = "fehl")
	private WebElement switcher;
	
	@FindBy(name = "q")
	private WebElement searchBox;
	
	@FindBy(id = "gbqfb")
	private WebElement searchButton;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	private WebElement link;
	
	public void getAddress (WebDriver driver) throws Exception {
		driver.get(config.getBaseUrl());
	}
	
	public void searchFor(WebDriver driver) throws Exception {
		switcher.click();
		searchBox.sendKeys(config.getSearchTerm());
		searchButton.click();
	}
	
	public SeleniumPageHelper clickLink(WebDriver driver) throws Exception {
		link.click();
		return new SeleniumPageHelper();
	}
}
