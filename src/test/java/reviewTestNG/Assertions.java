package reviewTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

    }

    @Test
    public void Task1(){
        WebElement userNameField=driver.findElement(By.xpath("//input[@id='userName']"));
        userNameField.sendKeys("Kellie");
        WebElement submitButton=driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();

        WebElement result=driver.findElement(By.xpath("//p[@id='name']"));
        String actualText=result.getText();
        System.out.println(actualText);

        String expectedText="Name:Kellies";
        //Assert.assertEquals(actualText,expectedText);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualText,expectedText);

        WebElement emailResult=driver.findElement(By.id("userEmail-label"));
        String actualEmailText=emailResult.getText();
        String expectedEmailText="Email";
        softAssert.assertEquals(actualEmailText,expectedEmailText);

                softAssert.assertAll();


    }

}
