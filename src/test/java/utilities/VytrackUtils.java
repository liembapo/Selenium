package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VytrackUtils {

    public static void login (WebDriver driver,String username ,String password){
        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        driver.findElement(By.id(usernameLocatorID)).sendKeys(username);
        driver.findElement(By.id(passwordLocatorID)).sendKeys(password + Keys.ENTER);
    }

    public static void navigateToModule(WebDriver driver,String tab , String module ) {

        String tabLocatorXPath = "//span[contains(text(),'" + tab + "') and @class = 'title title-level-1']";
        String moduleLocatorXPath = "//span[.= '"+module+"']";

        SeleniumUtils.pause(2);
        driver.findElement(By.xpath(tabLocatorXPath)).click();
        SeleniumUtils.pause(2);
        driver.findElement(By.xpath(moduleLocatorXPath)).click();
        SeleniumUtils.pause(2);
    }
}
