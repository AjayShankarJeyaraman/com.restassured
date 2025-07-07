package com.automation.steps;

import com.automation.config.ConfigManager;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {
    private final LoginPage loginPage;
    private final ConfigManager configManager;

    public LoginSteps() {
        this.loginPage = new LoginPage();
        this.configManager = ConfigManager.getInstance();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        loginPage.enterUsername(configManager.getProperty("valid.username"));
        loginPage.enterPassword(configManager.getProperty("valid.password"));
    }

    @When("I enter invalid username and password")
    public void iEnterInvalidUsernameAndPassword() {
        loginPage.enterUsername("invalid@example.com");
        loginPage.enterPassword("invalidpassword");
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        Assertions.assertTrue(loginPage.isLoggedIn());
    }

    @And("I should see the dashboard")
    public void iShouldSeeTheDashboard() {
        Assertions.assertTrue(loginPage.isDashboardDisplayed());
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Assertions.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @And("I should remain on the login page")
    public void iShouldRemainOnTheLoginPage() {
        Assertions.assertTrue(loginPage.isLoginPageDisplayed());
    }
} 