package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class loginPages {
    WebDriver driver;
    By CloseModal = By.xpath("//*[@id='tpmModal']/div/div/div/i");
    By loginbutton = By.id("loginBtn");
    By fieldEmail = By.id("login-email");
    By fieldPassword = By.id("login-password");
    By errorMessage = By.xpath("//div[text()='Email atau password salah']");
    By modalLogin = By.id("login-modal-btn");

    public loginPages(WebDriver driver){

        this.driver=driver;
    }

    public void verifyModalContent(){
        driver.findElement(CloseModal).click();

    }
    public void ClickLogin(){
        driver.findElement(loginbutton).click();
    }
    public void inputEmail(String email){
        driver.findElement(fieldEmail).sendKeys(email);
    }

    public void inputPassword(String password){
        driver.findElement(fieldPassword).sendKeys(password);
    }

    public void verifyErrorMessage(){
        String getError = driver.findElement(errorMessage).getText().trim();
        assertEquals("Email atau password salah", getError);

    }
    public void ClickModalLogin(){
        driver.findElement(modalLogin).click();
    }

}
