package com.google.helpers;

import junit.framework.Assert;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SeleniumPageHelper {

	public void assertTitle(WebDriver driver) throws Exception {
		try {
			Assert.assertEquals("Selenium - Web Browser Automation", driver.getTitle());

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
