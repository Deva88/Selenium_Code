package com.ExtanceReport;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class LoginTest {

	@Test
	public void login() {
		ExtentReports extent= new ExtentReports(); 
		ExtentHtmlReporter spark= new ExtentHtmlReporter();
	}
}
