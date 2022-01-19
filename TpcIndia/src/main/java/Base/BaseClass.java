package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class BaseClass{

    public static WebDriver driver;

    @BeforeTest
    public static void setup() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (IOException e) {
            System.out.println("Internet is not connected");
            e.printStackTrace ();
        }
        System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumConcept/Driver/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tpcindia.com/");
    }
}