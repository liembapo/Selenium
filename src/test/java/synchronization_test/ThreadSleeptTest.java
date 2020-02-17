package synchronization_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading2Page;
import utilities.DriverSingleton;

public class ThreadSleeptTest {

    @Test
    public void threadSleep()   {
        //1. getting the home page
        DriverSingleton.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        //2. creating object to be able to reach page class 'webelement
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();
        //3. clicking the start button using the object we create
        dynamicLoading2Page.startButton.click();
        //4. verify if the "hello world word is appear"

        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(),"doesn't show anything");

    }

}
