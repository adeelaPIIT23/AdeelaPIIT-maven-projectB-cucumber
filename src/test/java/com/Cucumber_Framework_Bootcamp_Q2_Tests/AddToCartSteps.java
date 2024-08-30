package com.Cucumber_Framework_Bootcamp_Q2_Tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class AddToCartSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the product page for {string}")
    public void user_is_on_the_product_page_for(String productName) {
        driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=123"); // Update product_id as needed
    }

    @When("User adds the product to the cart")
    public void user_adds_the_product_to_the_cart() {
        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();
    }

    @Then("The product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
        WebElement cartMessage = driver.findElement(By.cssSelector(".alert-success"));
        assertTrue(cartMessage.isDisplayed());
        driver.quit();
    }
}
