package com.readablereports;
//10. WAP a script which generate interactive and readable reports for the test.
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReadableReportsDemo {

	@Test
	public void loginTest() {
		System.out.println("Login Page");
		//start reporters
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/ReadableReports1.html");
		//create Extnts and attach reporter
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		//create a toggle for the given test adds all log events under
		ExtentTest logger= extent.createTest("LoginTest");
		//info (details)
		logger.log(Status.INFO, "Login Page");
		logger.log(Status.PASS, "Tital verified");
		extent.flush();
		ExtentTest logger2= extent.createTest("LogoffTest");
		logger2.log(Status.FAIL, "Tital verified");
		extent.flush();
	}

}
