/**
 * 
 */
package com.OrangeHRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.OrangesHRM.pages.LoginPage;

/**
 * @author Devendra kumar
 * 
 */
public class BaseClass {

	public static WebDriver driver;
	public LoginPage loginPage;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumConcept/Driver/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		loginPage=new LoginPage();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

