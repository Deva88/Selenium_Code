package com.makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumConcept/Driver/Chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.makemytrip.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]")).click();
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/main[1]/div[9]/span[1]")).click();	
			
			driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();
			driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ' ]/div/input")).sendKeys("Mumbai");			
			Thread.sleep(2000);
			List<WebElement> dynamicList= driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']")); 
			for(int i=0; i<dynamicList.size(); i++)
			{
				String text=dynamicList.get(i).getText();
				System.out.println("Text is " +text);
				if(text.contains("Mumbai"));
				{
					dynamicList.get(i).click();
					break;
				}
			}
			driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
			driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Banglore");
	 }
}

