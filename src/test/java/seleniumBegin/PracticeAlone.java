package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;

public class PracticeAlone {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("liembapo@yahoo.co.id");
        driver.findElement(By.id("pass")).sendKeys("limancipto");

        driver.findElement(By.id("loginbutton")).click();

        driver.findElement(By.linkText("Beranda")).click();
        Thread.sleep(5000);

    }
}
