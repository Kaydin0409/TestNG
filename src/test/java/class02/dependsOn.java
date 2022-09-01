package class02;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void login(){

        System.out.println("I have logged in successfully");
        System.out.println(0/0); //fails this test case
    }

    @Test(dependsOnMethods = "login")  //if method login fails, then this test will be skipped.
    public void verificationOfDashboardPage(){

        System.out.println("I am on dashboard page");

    }


}
