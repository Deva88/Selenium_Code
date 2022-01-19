package com.draganddrop;
//9.  WAP to Drag and Drop and WAP how to run multiple testcases in selenium(Test suite)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest {				
	WebDriver driver;			

	@Test()		
	public void DragnDropTest()					
	{		
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumConcept/Driver/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");					
		WebElement From=driver.findElement(By.xpath("//*[@id='credit1']/a"));			
		WebElement To=driver.findElement(By.xpath("//*[@id='loan']/li"));					
		//Using Action class for drag and drop.		
		Actions act=new Actions(driver);					
		//Dragged and dropped.		
		act.dragAndDrop(From, To).build().perform();		
	}		
}
