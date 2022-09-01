package class02;

import org.testng.annotations.Test;

public class Priority {
    //normally tests are executed alphabetically
    //execute alphabetical and then by priority if both are present (default priority is 0)
    //or just sort by priority 1,2,3,4

    @Test(groups = "smoke")
    public void FirstTest(){
        System.out.println("hello! 1st test");

    }
    @Test
    public void SecondTest(){

        System.out.println("hello! 2nd test");
    }

    @Test(priority = 2)
    public void ThridTest(){

        System.out.println("hello! 3rd test");
    }

    @Test(priority=1)
    public void FourthTest(){
        System.out.println("hello! 4th test");
    }

}
