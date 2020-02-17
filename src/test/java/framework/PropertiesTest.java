package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Configur;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

public class PropertiesTest {
    @Test
    public void test1() throws IOException {

//    1. Create the path of the file
        String path = "testtest.properties";
//	2. Properties object
        Properties propert = new Properties();

//	3. Open this file using FileInputStream.

        FileInputStream file = new FileInputStream(path);
//	4. Load the properties file into the properties object

        propert.load(file );

//   5. Read the values using getProperty method.
        System.out.println("name");
        System.out.println("username");
        System.out.println("password");

    }

    @Test
    public void testWIthUtil(){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(Configur.getProperty("vytrackUrl"));



    }

}
