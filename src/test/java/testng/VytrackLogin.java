package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.DriverSingleton;

public class VytrackLogin {


    @Test
    public void loginTest(){

        DriverSingleton.getDriver().get("https://qa2.vytrack.com/user/login");
        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        DriverSingleton.getDriver().findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
        DriverSingleton.getDriver().findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);
    }
}
