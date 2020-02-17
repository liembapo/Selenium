package pages.practice_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverSingleton;

public class DynamicLoading2Page {

    public DynamicLoading2Page(){

        PageFactory.initElements(DriverSingleton.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id= 'start']/button")
    public WebElement startButton;

    @FindBy(xpath = "//*[@id='finish']/h4")
    public WebElement helloWorldText;
}
