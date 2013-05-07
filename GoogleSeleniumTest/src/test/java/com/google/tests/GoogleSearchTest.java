package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.helpers.SearchEngineHelper;
import com.google.helpers.SeleniumPageHelper;

public class GoogleSearchTest {
	
	WebDriver driver;
	
  @BeforeMethod
  public void setUp() {
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
  @Test(enabled=true ,groups={"functional"})
  public void searchTest() throws Exception {
	  
	  SearchEngineHelper search = PageFactory.initElements(driver, SearchEngineHelper.class);

	  search.getAddress(driver);
	  Thread.sleep(1000);
	  search.searchFor(driver);
	  Thread.sleep(2000);
	  
	  SeleniumPageHelper selenium = search.clickLink(driver);
	  
	  Thread.sleep(2000);
	  selenium.assertTitle(driver);
  }

}
