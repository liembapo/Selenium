package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orange {
    public static void main(String[] args) {
        // Search
        //1. Open browser OF HRM
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://etsy.com
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        //3. Enter any search term
        // we need to locate search box using xpath
        WebElement orangeUserName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        orangeUserName.sendKeys("Admin");
        //WebElement manageInterestCollectionOnTheLeft
        //4. Click search button
        WebElement etsySearchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        etsySearchButton.click();
        //5. Verify title contains the search term
        //USE XPATH TO LOCATORS TO LOCATE WEBELEMENTS
        String actualTitle = driver.getTitle();
        String expectedInTitle = "Wooden spoon";
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
        driver.findElement(By.xpath("//button[@value='Search"));
    }
}
