package com.cases;

import com.page.loginPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class loginCase {
    WebDriver driver;
    loginPages objLogin;


    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.travelio.com/");
    }

    @Test
    public void invalidLogin() {
        objLogin = new loginPages(driver);
        objLogin.verifyModalContent();
        objLogin.ClickLogin();
        objLogin.inputEmail("ratna2ats@gmail.com");
        objLogin.inputPassword("abc123");
        objLogin.ClickModalLogin();
        objLogin.verifyErrorMessage();
    }

}
