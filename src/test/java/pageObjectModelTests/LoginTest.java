package pageObjectModelTests;

import org.testng.annotations.Test;
import pages.vytrack_pages.VytrackLoginPage;
import utilities.Configur;
import utilities.DriverSingleton;

public class LoginTest {

    @Test
    public void positiveLoginScenario(){
        String username = Configur.getProperty("storeManagerUserName");
        String password = Configur.getProperty("storeManagerPassword");


        DriverSingleton.getDriver().get("https://qa2.vytrack.com/user/login");
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.userNameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
    }
}
