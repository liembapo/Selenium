package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.hover_pages.HoverPage;
import utilities.DriverSingleton;
import utilities.SeleniumUtils;

public class CybertekHoverPageTest {

    @Test
    public void hoverPageTest(){

        DriverSingleton.getDriver().get("http://practice.cybertekschool.com/hovers");

        Actions actions = new Actions(DriverSingleton.getDriver());
        HoverPage hoverPage = new HoverPage();

        actions.moveToElement(hoverPage.pic1).perform();
        Assert.assertTrue(hoverPage.floatingNamePic1.isDisplayed(),"its doesn't show floating name");

        SeleniumUtils.pause(2);
        actions.moveToElement(hoverPage.pic2).perform();
        Assert.assertTrue(hoverPage.floatingNamePic2.isDisplayed(),"its doesn't show floating name");

        SeleniumUtils.pause(2);
        actions.moveToElement(hoverPage.pic3).perform();
        Assert.assertTrue(hoverPage.floatingNamePic3.isDisplayed(),"its doesn't show floating name");




    }
}