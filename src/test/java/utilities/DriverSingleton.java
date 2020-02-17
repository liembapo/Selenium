package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private  static WebDriver driver;
    private DriverSingleton(){}



    public static WebDriver getDriver(){


        if(driver == null){
            switch (Configur.getProperty("browser")){
                case  "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS );
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){

        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
