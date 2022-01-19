package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

	public String baseUrl="http://demo.guru99.com/test/newtours/";
	String driverPath ="A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void verifyHomePage() {
		System.out.println("Launching chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle ="Welcom";
		String actualTitle = driver.getTitle();
		System.out.println(" Title : "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test(priority=2)
	public void verifyHomePage1() {
		driver.get(baseUrl);
		String expectedTitle ="Welcom";
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(" Current Url : "+actualCurrentUrl);
		Assert.assertEquals(actualCurrentUrl, expectedTitle);	
	}
	
}
