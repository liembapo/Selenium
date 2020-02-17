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
import utilities.SeleniumUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebOrderPractice {
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

    @Test
    public void realTest() throws InterruptedException {
        SmartBearUtility.loginToSmartBear(driver);

        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        SeleniumUtils.pause(2);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));

        for (int i = 0; i < checkboxes.size(); i++) {

            Assert.assertFalse(checkboxes.get(i).isSelected());
        }
        WebElement deleteSelectedButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectedButton.click();
        WebElement emptyOrderListMessage = driver.findElement(By.id("ctl00_MainContent_orderMessage"));
        Assert.assertTrue(emptyOrderListMessage.isDisplayed(), "Empty order list message is NOT displayed.");


    }
}
