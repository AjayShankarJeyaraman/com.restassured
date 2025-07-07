package com.automation.steps;

import com.automation.config.ConfigManager;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginSteps {
    private final LoginPage loginPage;
    private final ConfigManager configManager;
    private static final Logger logger = LogManager.getLogger(LoginSteps.class);

    public LoginSteps() {
        this.loginPage = new LoginPage();
        this.configManager = ConfigManager.getInstance();
    }

    @Given("User navigates to wejha application")
    public void user_navigates_to_wejha_application() {
        logger.info("Navigating to Wejha application");
        loginPage.navigateToLoginPage();
        logger.info("Current URL: " + loginPage.getCurrentUrl());
        logger.info("Page Title: " + loginPage.getPageTitle());
    }

    @When("User enters login username {string} and password {string}")
    public void user_enters_login_username_and_password(String username, String password) {
        logger.info("Entering username: " + username);
        loginPage.enterUsername(username);
        
        logger.info("Entering password: " + password.replaceAll(".", "*"));
        loginPage.enterPassword(password);
    }

    @And("User clicks the Login button")
    public void user_clicks_the_login_button() {
        logger.info("Clicking login button");
        loginPage.clickLoginButton();
    }

    @Then("User should reach the Dashboard page")
    public void user_should_reach_the_dashboard_page() {
        logger.info("Verifying dashboard page is displayed");
        
        // Wait a moment for page to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        boolean isDashboardDisplayed = loginPage.isDashboardDisplayed();
        logger.info("Dashboard displayed: " + isDashboardDisplayed);
        
        // Additional verification - check if URL changed from login page
        String currentUrl = loginPage.getCurrentUrl();
        logger.info("Current URL after login: " + currentUrl);
        
        // Assert that either dashboard is displayed or URL has changed (indicating successful navigation)
        Assertions.assertTrue(
            isDashboardDisplayed || !currentUrl.contains("login"),
            "User should be redirected to dashboard page after successful login"
        );
    }
    
    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        logger.info("Verifying error message is displayed");
        String errorMessage = loginPage.getErrorMessage();
        logger.info("Error message: " + errorMessage);
        
        Assertions.assertNotEquals("No error message found", errorMessage, 
            "Error message should be displayed for invalid credentials");
    }
}
