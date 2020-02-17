package testng;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
        @Test
        public void test2(){
            System.out.println("this is first test...");
        }

        @Test
    public void test1(){
            System.out.println("this is second test...");
            Assert.assertEquals("failOne","failOne","expected word is \"failOne\" ");
        }
    @BeforeTest
    public void BeforeMethod()    {
        System.out.println("print once every before test method runs");
    }

        @BeforeClass
    public void BeforeClass(){
            System.out.println("print once only before all method");
        }



}
