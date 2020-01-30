package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class CreateCalendarDropDownTests {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        VytrackUtils.login(driver,"storemanager85","UserUser123");

        String createCalendarBtnLocatorCss = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a";
        String saveAndCloseBtnLocatorXPath = "//div/button[contains(text(), 'Save and Close']";
        String dropDownBtnLocatorXPath = "//*[@id=\"oro_calendar_event_form-uid-5e3246887e5d6\"]/div[1]/div/div/div[2]/div[1]/div[1]/div/a";  // can do //a/span[@class = 'caret'  too
        String saveAndCloseTabBtnLocatorXpath = "//li/button[contains(text(),'Save and Close')]";
        String saveAndNewTabBtnLocatorXpath = "//li/button[contains(text(),'Save and New')]";
        String saveTabBtnLocatorXpath ="(//li/button[contains(text(),'Save')])[3]";

        VytrackUtils.navigateToModule(driver,"Activities","Calendar Events");

        driver.findElement(By.xpath(createCalendarBtnLocatorCss)).click();

        driver.findElement(By.xpath(dropDownBtnLocatorXPath)).click();

        SeleniumUtils.pause(2);

        if(driver.findElement(By.xpath(saveAndCloseTabBtnLocatorXpath)).isDisplayed()) System.out.println("Pass");
        else System.out.println("Failed");




    }
}
