package pages.hover_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverSingleton;

public class HoverPage {
    public HoverPage(){
        PageFactory.initElements(DriverSingleton.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='content']/div/div[1]/img")
    public WebElement pic1;
    @FindBy(xpath = "//*[@id='content']/div/div[2]/img")
    public WebElement pic2;
    @FindBy(xpath = "//*[@id='content']/div/div[3]/img")
    public WebElement pic3;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/div/h5")
    public WebElement floatingNamePic1;
    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/h5")
    public WebElement floatingNamePic2;
    @FindBy(xpath = "//*[@id='content']/div/div[3]/div/h5")
    public WebElement floatingNamePic3;
}
