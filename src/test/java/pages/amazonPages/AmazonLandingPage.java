package pages.amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverSingleton;

public class AmazonLandingPage {

    public AmazonLandingPage (){
        PageFactory.initElements(DriverSingleton.getDriver(),this);
    }

    @FindBy(id ="nav-link-accountList")
    public WebElement signInLink;



}
