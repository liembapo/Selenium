package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.amazonPages.AmazonLandingPage;
import utilities.DriverSingleton;

public class AmazonTests {

    @Test
    public void signInLinkHoverTest(){
        //1. find/ open the page

        DriverSingleton.getDriver().get("https://www.amazon.com");
        //2. create the object of Page class to reach web elements
        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();

        //3. create the object of Actions class, and pass the driver instance into the constructor.
        Actions actions = new Actions(DriverSingleton.getDriver());
        //4. we will move to the link using actions instance and method.
        actions.moveToElement(amazonLandingPage.signInLink).perform();

        

    }
}
