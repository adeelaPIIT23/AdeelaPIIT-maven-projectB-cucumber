package com.Cucumber_Framework_Bootcamp_Q2_Tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LogoutSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is logged in")
    public void user_is_logged_in() {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        WebElement usernameField = driver.findElement(By.id("input-email"));
        WebElement passwordField = driver.findElement(By.id("input-password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

        usernameField.sendKeys("testuser");
        passwordField.sendKeys("testpass");
        loginButton.click();

        // Ensure login was successful
        WebElement accountLink = driver.findElement(By.linkText("My Account"));
        assertTrue(accountLink.isDisplayed());
    }

    @When("User clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
        logoutLink.click();
    }

    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() {
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        assertTrue(loginLink.isDisplayed());
        driver.quit();
    }
}
