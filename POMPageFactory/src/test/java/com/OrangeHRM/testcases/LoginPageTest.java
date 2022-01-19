package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangesHRM.pages.HomePage;
import com.OrangesHRM.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	
	@Test(priority = 1)
	public void verifyLogo() {
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority = 2)
	public void loginTest() {
		homePage=loginPage.login("admin", "admin123");
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}
}
