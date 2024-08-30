package com.Cucumber_Framework_Bootcamp_Q2_Tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("input-email"));
        WebElement passwordField = driver.findElement(By.id("input-password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        WebElement accountLink = driver.findElement(By.linkText("My Account"));
        assertTrue(accountLink.isDisplayed());
        driver.quit();
    }
}
