package pageObjectModelTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.smartbear_Pages.LoginPage;
import seleniumBegin.SmartBearUtility;
import utilities.Configur;
import utilities.DriverSingleton;

public class SmartBearLoginTest {

    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void loadUrl(){
        DriverSingleton.getDriver().get(Configur.getProperty("smartbearUrl"));
    }


    @Test
    public void wrongUsername(){

//        DriverSingleton.getDriver().get(Configur.getProperty("smartbearUrl"));

        loginPage.userNameInput.sendKeys(Configur.getProperty("wrongUsername"));
        loginPage.passwordInput.sendKeys(Configur.getProperty("storeManagerPassword"));
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"it doesnt show any message/ no message");

    }

    @Test
    public void noUsername(){
//        DriverSingleton.getDriver().get(Configur.getProperty("smartbearUrl"));

        loginPage.userNameInput.sendKeys("");
        loginPage.passwordInput.sendKeys(Configur.getProperty("storeManagerPassword"));
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"it doesnt show any message/ no message");
    }

    @Test
    public void wrongPassword(){
//        DriverSingleton.getDriver().get(Configur.getProperty("smartbearUrl"));

        loginPage.userNameInput.sendKeys("storeManagerUserName");
        loginPage.passwordInput.sendKeys(Configur.getProperty("wrongPassword"));
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"it doesnt show any message/ no message");
    }

    @Test
    public void noPassword(){
//        DriverSingleton.getDriver().get(Configur.getProperty("smartbearUrl"));

        loginPage.userNameInput.sendKeys("storeManagerUserName");
        loginPage.passwordInput.sendKeys("");
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"it doesnt show any message/ no message");
    }

}
