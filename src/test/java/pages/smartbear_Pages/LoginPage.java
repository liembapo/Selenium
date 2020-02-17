package pages.smartbear_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverSingleton;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(DriverSingleton.getDriver(),this);
    }


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy (id = "ctl00_MainContent_status")
    public WebElement errorMessage;
}
