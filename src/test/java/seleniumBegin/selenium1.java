package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
                                                 // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.get("https://www.google.com");
        driver.get("https://www.youtube.com");

    }
}
