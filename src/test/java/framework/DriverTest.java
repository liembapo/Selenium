package framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSingleton;

public class DriverTest {

    @Test
    public void test(){
        DriverSingleton.getDriver().get("https://www.amazon.com/ref=nav_logo");
    }
}
