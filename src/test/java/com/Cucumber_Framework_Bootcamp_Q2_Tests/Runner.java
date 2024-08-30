package com.Cucumber_Framework_Bootcamp_Q2_Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Path to feature files
    glue = "com.Cucumber_Framework_Bootcamp_Q2_Tests", // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"} // Configure reporting plugins
)
public class Runner extends AbstractTestNGCucumberTests {
    // No need for setup and teardown methods here
}
