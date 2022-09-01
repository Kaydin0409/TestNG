package class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hardAssertions {

    //navigate to syntaxhrms
    //we need to write a test case to verify the wrong credentials give error message (invalid credentials)
    //quite the browser

    WebDriver driver;
    //navigate to syntax website (have the precondition)
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test(groups = "smoke")
    public void verifyInvalidCredentialsError(){
            WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("WeatherMay");
            WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
            password.sendKeys("abcdefgh");
            WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginButton.click();

            WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
            String errorText=errorMessage.getText();
            System.out.println(errorText);

            String expectedMessage="Invalid credentials";
            Assert.assertEquals(errorText,expectedMessage);

           /* if(errorText.equals("Invalid credentials")){
                System.out.println("Test case has passed");
            }else{
                System.out.println("Test case has failed");
            }*/

        //DO NOT use if condition because it will show test passed even though in actuality the logic failed

            userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
            boolean displayed=userName.isDisplayed();

            Assert.assertTrue(displayed);

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }


}
