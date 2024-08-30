package com.Cucumber_Framework_Bootcamp_Q2_Tests;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    WebDriver driver;

    By myAccountLink = By.linkText("My Account");
    By registerLink = By.linkText("Register");
    By firstNameField = By.cssSelector("input#input-firstname");
    By lastNameField = By.cssSelector("input#input-lastname");
    By emailField = By.cssSelector("input#input-email");
    By telephoneField = By.cssSelector("input#input-telephone");
    By passwordField = By.cssSelector("input#input-password");
    By confirmPasswordField = By.cssSelector("input#input-confirm");
    By agreeCheckbox = By.cssSelector("input[name = agree]");
    By continueButton = By.cssSelector("input.btn.btn-primary");


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }

    
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Given("User is on the Tutorials Ninja home page")
    public void user_is_on_the_Tutorials_ninja_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        System.out.println("This is where the issue lies");
    }

    @When("User navigates to the Registration page")
    public void user_navigates_to_the_registration_page() {
        driver.findElement(myAccountLink).click();
        driver.findElement(registerLink).click();
    }

    @When("User enters first name as {string}")
    public void user_enters_first_name_as(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    @When("User enters last name as {string}")
    public void user_enters_last_name_as(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    @When("User enters email as {string}")
    public void user_enters_email_as(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    @When("User enters telephone as {string}")
    public void user_enters_telephone_as(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    @When("User confirms the password as {string}")
    public void user_confirms_the_password_as(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    @When("User agrees to the terms and conditions")
    public void user_agrees_to_the_terms_and_conditions() {
        driver.findElement(agreeCheckbox).click();
    }

    @Then("User clicks on the Continue button")
    public void user_clicks_on_the_continue_button() {
        driver.findElement(continueButton).click();
    }

    @Then("Registration should be successful")
    public void registration_should_be_successful() {
        // You can add verification steps here, such as checking for a success message.
    }
} */


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class RegisterSteps {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        driver.get("http://tutorialsninja.com/demo/");
    }

    @When("User navigates to the Registration page")
    public void user_navigates_to_the_registration_page() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
    }

    @When("User enters first name as {string}")
    public void user_enters_first_name_as(String firstName) {
        WebElement firstNameField = driver.findElement(By.id("input-firstname"));
        firstNameField.sendKeys(firstName);
    }

    @When("User enters last name as {string}")
    public void user_enters_last_name_as(String lastName) {
        WebElement lastNameField = driver.findElement(By.id("input-lastname"));
        lastNameField.sendKeys(lastName);
    }

    @When("User enters email as {string}")
    public void user_enters_email_as(String email) {
        WebElement emailField = driver.findElement(By.id("input-email"));
        emailField.sendKeys(email);
    }

    @When("User enters telephone as {string}")
    public void user_enters_telephone_as(String telephone) {
        WebElement telephoneField = driver.findElement(By.id("input-telephone"));
        telephoneField.sendKeys(telephone);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        WebElement passwordField = driver.findElement(By.id("input-password"));
        passwordField.sendKeys(password);
    }

    @When("User confirms the password as {string}")
    public void user_confirms_the_password_as(String password) {
        WebElement confirmPasswordField = driver.findElement(By.id("input-confirm"));
        confirmPasswordField.sendKeys(password);
    }

    @When("User agrees to the terms and conditions")
    public void user_agrees_to_the_terms_and_conditions() {
        WebElement agreeCheckbox = driver.findElement(By.name("agree"));
        agreeCheckbox.click();
    }

    @When("User clicks on the Continue button")
    public void user_clicks_on_the_continue_button() {
        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();
    }

    @Then("Registration should be successful")
    public void registration_should_be_successful() {
        WebElement successMessage = driver.findElement(By.cssSelector(".alert-success"));
        assertTrue(successMessage.isDisplayed());
        driver.quit();
    }
}

