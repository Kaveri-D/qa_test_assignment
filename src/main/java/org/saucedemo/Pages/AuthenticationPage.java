package org.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends BaseClass {
    static WebElement emailId;
    static WebElement pwd;
    static WebElement loginButton;

    public  void enteremailId() {
        emailId = driver.findElement(By.id("user-name"));
        emailId.sendKeys("standard_user");
    }
    public  void enterpwd() {
        pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce)");
    }

    public  void ClickOnLogin() {
        loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

    }



}
