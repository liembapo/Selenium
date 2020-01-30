package vytrack;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;

public class LogCallTest {
    public static void main(String[] args) {
        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";

        String tabLocatorXPath = "//span[contains(text(),'Activities') and @class = 'title title-level-1']";
        String moduleLocatorXPath = "//span[.= 'Calls']";

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);

        SeleniumUtils.pause(2);
        driver.findElement(By.xpath(tabLocatorXPath)).click();
        SeleniumUtils.pause(2);
        driver.findElement(By.xpath(moduleLocatorXPath)).click();
        SeleniumUtils.pause(2);

        if(driver.findElement(By.linkText("Log Call")).isDisplayed()) System.out.println("Pass");
        else System.out.println("Failed");




    }
}
