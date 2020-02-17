package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmai")).click();

        String expectedResult = "Gmail";
        boolean check = driver.getTitle().contains(expectedResult);

        if(check)System.out.println("pass");
        else System.out.println("fail");

        driver.navigate().back();
        String expectedResult1 = "Google";
        boolean check1 = driver.getTitle().equals(expectedResult1);

        if(check1)System.out.println("pass");
        else System.out.println("fail");


        driver.navigate().forward();
        String expectedResult2 = "Gmail";
        boolean check2 = driver.getTitle().contains(expectedResult2);

        if(check2)System.out.println("pass");
        else System.out.println("fail");



    }
}
