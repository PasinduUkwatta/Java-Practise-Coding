package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestNGTest2 {
    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @BeforeMethod
    //PRE CONDITIONS
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    //POST CONDITIONS
    public void afterMethod(){
        System.out.println("After Method");
    }
}
