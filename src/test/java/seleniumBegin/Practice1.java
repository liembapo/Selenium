package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/");



        WebElement javaTutor = driver.findElement(By.linkText("Java Tutorial"));
        javaTutor.click();
//        Thread.sleep(1000);
//        driver.navigate().back();

//        driver.findElement(By.linkText("Selenium Tutorial")).click();
//        Thread.sleep(500);
//        driver.navigate().back();
    }
}
