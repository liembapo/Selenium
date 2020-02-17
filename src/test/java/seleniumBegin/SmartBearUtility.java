package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearUtility {
    public static void main(String[] args) {
               WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginToSmartBear(driver);

////        WebElement takeAllElement = driver.findElements(By.className("SampleTable"));
//        List<WebElement> elements = driver.findElements(By.xpath("//body//a"));
//
//        System.out.printf("there are %s links on this page\n",elements.size());
//
//        for(WebElement element : elements  ){
//            System.out.println(element.getText());
//        }

        verifyOrder(driver,"Paul Brown");



    }

    public static void loginToSmartBear(WebDriver driver){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

    }
    public static void verifyOrder(WebDriver driver , String name  ){

       List <WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        for (WebElement list : allNames) {
            if(list.getText().equals(name)) System.out.println("order verification is PASSED");return;
        }
        System.out.println(name + " doesn't exist on the list , verification FAILED");

    }

    public static void printNamesAndCities(WebDriver driver ){
        List <WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
        List <WebElement> allCities = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[7]"));

        for (int i = 0; i < allCities.size()   ; i++) {
            System.out.println(allNames.get(i).getText() + " ----> " +allCities.get(i).getText());
        }

    }
}
