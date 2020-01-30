package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import javax.lang.model.element.Element;
import java.sql.DriverPropertyInfo;

public class PracticeGuhan {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("wooden spoon" + Keys.ENTER);




    }
}
