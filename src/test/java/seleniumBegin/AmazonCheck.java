package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AmazonCheck {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement input = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox"));
        input.sendKeys("spoon");
        Thread.sleep(1000);


//        List<String> listTen = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {                                            FIRST WAY
//            String a = "issDiv"+i;
//            listTen.add(driver.findElement(By.id(a)).getAttribute("data-keyword"));
//        }

        WebElement takeAllElements = driver.findElement(By.cssSelector("#nav-flyout-searchAjax"));
        List <WebElement> list = takeAllElements.findElements(By.xpath("//*[@class= 's-suggestion']"));

        int count =0;

        for (WebElement takeOne : list){
            String check = takeOne.getAttribute("data-keyword");
            System.out.println(check);
            if(check.startsWith("spoon")) count++;
            else System.out.println(check);
        }


        System.out.println();
        if(count==10) System.out.println("Verification passed");
        else System.out.println("Verification failed");

    }
}
