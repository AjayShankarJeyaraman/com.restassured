package Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginUsername")
    WebElement loginUsername;

    @FindBy(id = "loginPassword")
    WebElement loginPassword;

    @FindBy(id = "loginBtn")
    WebElement loginBtn;

    @FindBy(id = "dashboard")
    WebElement dashboard;

    public void login(String username, String password) {
        loginUsername.sendKeys(username);
        loginPassword.sendKeys(password);
        loginBtn.click();
    }

    public void verifyDashboardLoaded() {
        if (!dashboard.isDisplayed()) {
            throw new AssertionError("Dashboard is not displayed");
        }
    }
}

