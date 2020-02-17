package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static seleniumBegin.SmartBearUtility.*;

public class VerifyOrder {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginToSmartBear(driver);


        verifyOrder(driver,"Paul Brown");

        printNamesAndCities(driver);

    }
}
