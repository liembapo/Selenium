package seleniumBegin;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Homework1 {
            public static void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://practice.cybertekschool.com/forgot_password");
                WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
                WebElement headerForgotPassword = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
                WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
                WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
                WebElement retrievePassword = driver.findElement(By.xpath("//button[@class='radius']"));
                WebElement cybertekSchool = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
                try{
                    boolean check1 = homeLink.isDisplayed();
                    if(check1) System.out.println("Home link is displayed");
                    boolean check2 = headerForgotPassword.isDisplayed();
                    if(check2) System.out.println("Header \"forgot password \" is displayed");
                    boolean check3 = emailText.isDisplayed();
                    if(check3) System.out.println("Email text is displayed");
                    boolean check4 = inputBox.isDisplayed();
                    if(check4) System.out.println("input box is displayed");
                    boolean check5 = retrievePassword.isDisplayed();
                    if(check5) System.out.println( "retrieve password button is displayed");
                    boolean check6 = cybertekSchool.isDisplayed();
                    if(check6) System.out.println(" \"Powered by Cybertek\" is displayed ");
                }catch (StaleElementReferenceException e ){
                    System.out.println("Home link is not displayed");
                }
            }

        }

