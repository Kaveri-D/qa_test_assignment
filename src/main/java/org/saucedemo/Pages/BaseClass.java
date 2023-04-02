package org.saucedemo.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.saucedemo.Utils.Utils;

public class BaseClass {


    static WebElement emailId;
    static WebElement pwd;
    static WebElement loginButton;
    public static WebDriver driver;
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        System.out.println( "browser opened");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://www.google.com");
        System.out.println( "site  opened");
        //driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //Utils.waitForPageLoad(30);

    }


    public void closeBrowser() {

        driver.close();
        driver.quit();


    }
    }
