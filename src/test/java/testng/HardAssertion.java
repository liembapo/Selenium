package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {
    @Test
    public void test1(){
        System.out.println("test1 is starting...");
        Assert.assertEquals(1,4);
        System.out.println("test1 middle");
        Assert.assertTrue(false);
        System.out.println("test1 ending...");
    }

    @Test
    public void test2(){
        System.out.println("test2 is starting...");

    }

    @Test
    public void test3(){
        SoftAssert soft = new SoftAssert();

        System.out.println("test 3 is starting...");
        soft.assertEquals(1,4);

        System.out.println("test 3 is middle...");

        soft.assertTrue(false);
        System.out.println("test 3 is ending...");
        soft.assertAll();
    }
}
