package org.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.saucedemo.Pages.AuthenticationPage;



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefination {
   public static WebDriver driver;
  AuthenticationPage authenticationPage = new AuthenticationPage();

    @Given("I am on homepage")
    public void i_am_on_homepage() throws InterruptedException {
      System.out.println(" At home page step def");
      WebDriverManager.firefoxdriver().setup();
      driver= new FirefoxDriver();
      System.out.println( "browser opened");

      driver.get("https://www.saucedemo.com/");

      driver.manage().window().maximize();

    }

    @When("I login using correct credentials")
    public void i_login_using_correct_credentials() {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should login successfylly")
    public void i_should_login_successfylly() {


    }

    @Then("I search for highest price item")
    public void i_search_for_highest_price_item() {
      // Getting the list of price
      List<WebElement> pricelist = driver.findElements(By.cssSelector("[class='inventory_item_price']"));
      List<Float> prices1 = new ArrayList<Float>();
      for(WebElement e : pricelist)
      {
        prices1.add(Float.valueOf(e.getText().replace("$","").trim()));

      }
      System.out.println(prices1);
      System.out.println("Trim list" + prices1);
      float maxfloat = (float) Collections.max(prices1);
      System.out.println("Max value is: "+ maxfloat);
      WebElement addToCart= driver.findElement(By.xpath("//div[text()='"+maxfloat+"']/following::button[1]"));
      addToCart.click();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }


    @Then("I add item to the basket")
    public void i_add_item_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
      System.out.println(" Test");

    }

}
