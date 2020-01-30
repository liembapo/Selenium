package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VytrackUtils;

public class CreateCalendat {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtils.login(driver,"storemanager85","UserUser123");

        VytrackUtils.navigateToModule(driver,"Activities","Calendar Events");
        if(driver.findElement(By.linkText("Create Calendar Event")).isDisplayed()) System.out.println("Pass");
        else System.out.println("Failed");

    }
}
