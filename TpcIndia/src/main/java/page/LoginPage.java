package page;

import com.bridgelabz.tpcindia.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

    @FindBy (xpath = "//a[normalize-space()='Login']")
    WebElement logIn;

    @FindBy(xpath = "//button[normalize-space()='SIGN IN']")
    WebElement signIn;

    @FindBy(xpath = "//button[text() = 'SEARCH']")
    WebElement search;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setTpcIndia() {
        logIn.click();
        signIn.click();
//        search.click();
    }
}