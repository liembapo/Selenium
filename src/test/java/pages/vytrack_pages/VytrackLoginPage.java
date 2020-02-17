package pages.vytrack_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverSingleton;

public class VytrackLoginPage {



    public VytrackLoginPage(){
        PageFactory.initElements(DriverSingleton.getDriver(),this);


    }

    @FindBy(id = "prependedInput")
    public WebElement userNameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement submitButton;


}
