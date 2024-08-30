package com.Cucumber_Framework_Bootcamp_Q2_Tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class SearchProductSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        driver.get("http://tutorialsninja.com/demo/");
    }

    @When("User searches for {string}")
    public void user_searches_for(String productName) {
        WebElement searchBox = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.cssSelector(".btn-lg"));

        searchBox.sendKeys(productName);
        searchButton.click();
    }

    @Then("User should see results for {string}")
    public void user_should_see_results_for(String productName) {
        WebElement result = driver.findElement(By.xpath("//h4/a[text()='" + productName + "']"));
        assertTrue(result.isDisplayed());
        driver.quit();
    }
}
