package com.automation.pages;

import com.automation.config.ConfigManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private final ConfigManager configManager;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(className = "error-message")
    private WebElement errorMessage;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(className = "forgot-password")
    private WebElement forgotPasswordLink;

    @FindBy(className = "remember-me")
    private WebElement rememberMeCheckbox;

    @FindBy(className = "welcome-message")
    private WebElement welcomeMessage;

    public LoginPage() {
        super();
        this.configManager = ConfigManager.getInstance();
    }

    public void navigateToLoginPage() {
        driver.get(configManager.getBaseUrl() + "/login");
        waitForPageLoad();
    }

    public void enterUsername(String username) {
        sendKeys(usernameInput, username);
    }

    public void enterPassword(String password) {
        sendKeys(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public void loginWithValidCredentials() {
        login(
            configManager.getProperty("valid.username"),
            configManager.getProperty("valid.password")
        );
    }

    public boolean isLoggedIn() {
        return isElementDisplayed(dashboard);
    }

    public boolean isDashboardDisplayed() {
        return isElementDisplayed(dashboard);
    }

    public boolean isErrorMessageDisplayed() {
        return isElementDisplayed(errorMessage);
    }

    public boolean isLoginPageDisplayed() {
        return isElementDisplayed(usernameInput) && isElementDisplayed(passwordInput);
    }

    public void clickForgotPassword() {
        click(forgotPasswordLink);
    }

    public void toggleRememberMe() {
        click(rememberMeCheckbox);
    }

    public String getWelcomeMessage() {
        return getText(welcomeMessage);
    }

    public String getErrorMessage() {
        return getText(errorMessage);
    }

    public void clearLoginForm() {
        usernameInput.clear();
        passwordInput.clear();
    }
} 