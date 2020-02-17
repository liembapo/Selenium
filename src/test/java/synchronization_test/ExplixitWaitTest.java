package synchronization_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading1Page;
import utilities.DriverSingleton;

public class ExplixitWaitTest {


    @Test
    public void waitForInputBoxTest(){
        //1.get the page
        DriverSingleton.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        //2.create object to use WebElement
        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
        //3. click to start button
        dynamicLoading1Page.startButton.click();
        //4. we try to send key
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.userNameInput));

        dynamicLoading1Page.userNameInput.sendKeys("ThomasReagan");
    }
}
