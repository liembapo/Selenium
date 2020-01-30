package seleniumBegin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates the connection between
        // driver and selenium. AND sets up the driver

        WebDriver driver = new ChromeDriver(); // instantiating the ChromeDriver instance
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButton.isDisplayed()) System.out.println("delete button is displayed");
        else System.out.println("delete button is not displayed");
        deleteButton.click();
        try {
            boolean check = deleteButton.isDisplayed();
            if (check) System.out.println("delete button still displaying, verification failed");
        } catch (StaleElementReferenceException e) {
            System.out.println("delete button is not displaying, verification Pass");
        }

//        if (homeLink.isDisplayed()) {
//            System.out.println("Verification HOME link Passed!");
//        }else System.out.println("verification HOME link is Failed");
//
//        if (headerForgotPassword.isDisplayed()) {
//            System.out.println("Verification header forgot password Passed!");
//        }else System.out.println("Verification header forgot password Failed!");
//
//        if (emailText.isDisplayed()) {
//            System.out.println("Verification email text Passed!");
//        }else System.out.println("Verification email text Failed!");
//
//        if (inputBox.isDisplayed()) {
//            System.out.println("Verification input box Passed!");
//        }else System.out.println("Verification input box Failed!");
//
//        if (retrievePassword.isDisplayed()) {
//            System.out.println("Verification retrieve password Passed!");
//        }else System.out.println("Verification retrieve password Failed!");
//
//        if (cybertekSchool.isDisplayed()) {
//            System.out.println("Verification \"Powered by Cybertek School\" text ,Passed!");
//        } else {
//            System.out.println("Verification \"Powered by Cybertek School\" text ,Failed!");
//        }
    }
}
