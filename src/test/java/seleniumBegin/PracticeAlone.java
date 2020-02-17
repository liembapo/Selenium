package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

import java.awt.*;
import java.awt.image.Kernel;
import java.util.List;

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

        WebElement element = driver.findElement(By.linkText("Beranda"));
        String a = element.getAttribute("href");
        System.out.println(a);

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list);
//        SeleniumUtils.pause(3);
//
//        WebElement putComment =driver.findElement(By.xpath("//*[@title='Apa yang Anda pikirkan, Robert?']"));
//        putComment.click();
//        putComment.sendKeys("lorem ipsum is dummy sentence that's moving around the world");
//
//        driver.findElement(By.xpath("//*[@class ='_88hu']")).click();
    }
}
