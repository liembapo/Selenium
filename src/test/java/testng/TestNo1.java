package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumBegin.SmartBearUtility;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNo1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.out.println("setUp begin...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

  @Test(priority = 2)
    public void realTest() throws InterruptedException {
        SmartBearUtility.loginToSmartBear(driver);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl03_OrderSelector\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]")).click();

        List <WebElement>   lists = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));

        for ( WebElement list: lists   ) {
            System.out.println(list.getText());
            Assert.assertNotEquals(list.getText(), "Mark Smith");
        }
    }

}
