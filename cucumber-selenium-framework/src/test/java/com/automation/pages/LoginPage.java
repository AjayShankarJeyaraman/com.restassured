package com.automation.pages;

import com.automation.config.ConfigManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    
    private final ConfigManager configManager;
    
    // WebElement locators
    @FindBy(id = "email")
    private WebElement usernameField;
    
    @FindBy(id = "password")
    private WebElement passwordField;
    
    @FindBy(xpath = "//*[text()='Login']")
    private WebElement loginButton;
    
    @FindBy(xpath = "//div[contains(@class, 'dashboard') or contains(@class, 'home')]")
    private WebElement dashboardElement;
    
    @FindBy(xpath = "//div[contains(@class, 'error') or contains(@class, 'alert')]")
    private WebElement errorMessage;
    
    public LoginPage() {
        super();
        this.configManager = ConfigManager.getInstance();
    }
    
    public void navigateToLoginPage() {
        navigateTo(configManager.getBaseUrl());
    }
    
    public void enterUsername(String username) {
        enterText(usernameField, username);
    }
    
    public void enterPassword(String password) {
        enterText(passwordField, password);
    }
    
    public void clickLoginButton() {
        clickElement(loginButton);
    }
    
    public boolean isDashboardDisplayed() {
        return isElementDisplayed(dashboardElement);
    }
    
    public String getErrorMessage() {
        try {
            return getElementText(errorMessage);
        } catch (Exception e) {
            return "No error message found";
        }
    }
}

