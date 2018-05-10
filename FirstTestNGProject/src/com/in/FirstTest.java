package com.in;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTest {
	
	 WebDriver driver ; 
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String driverPath = "C:\\geckodriver.exe";
  @Test
  public void f() {
	  
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.firefox.marionette", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	 
	    
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
