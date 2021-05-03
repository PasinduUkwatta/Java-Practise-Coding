package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest3 {

    @Test
    public void test1(){
        System.out.println(" Test 1!!");
    }

    @Test
    public void test2(){
        System.out.println(" Test 2!!");
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
