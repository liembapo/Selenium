package seleniumBegin;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Year;

public class TaskOneTwothree2 {
    public static  void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();

        TaskOneTwoThree1.loginToSmartBear(driver);

        driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();

        WebElement family = driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct"));
        family.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[2]")).click();

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(Keys.BACK_SPACE + "2");

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();

        Faker faker = new Faker();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("60613");

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList\"]/tbody/tr/td[1]")).click();

        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("1234123412341234");
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("10/24");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

        String check = driver.findElement(By.xpath("//strong")).getText();

        String ecpected = "New order has been successfully added.";

        if(check.equals(ecpected)) System.out.println("It shows");
        else System.out.println("it doesn's show");





    }
}
