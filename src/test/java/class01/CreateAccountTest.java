package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest {

//    goto fb.com
//    make sure create account text is there

    @Test
    public void createAccountText() {

        //seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://fb.com");
        String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();

        if (text.equals("Create new account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

        }
    }

}
