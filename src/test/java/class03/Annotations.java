package class03;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @Test
    public void aTest(){
        System.out.println("I am aTest");
    }

    @Test
    public void bTest(){
        System.out.println("I am a bTest");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }
}
