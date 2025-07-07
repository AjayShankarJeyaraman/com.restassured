package Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   //Email Registration
    @FindBy(xpath = "//*[text()='Register']")
    WebElement registerBtn;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "//*[text()='Send OTP']")
    WebElement submitEmailBtn;

    public void clickButton(String text) {
        emailField.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void submitEmail() {
        submitEmailBtn.click();
    }

    // Step 2: OTP Verification
    @FindBy(id = "otpField")
    WebElement otpField;

    @FindBy(xpath="//*[text()='Submit']")
    WebElement verifyOtpBtn;

    public void enterOtp(String otp) {
        otpField.sendKeys(otp);
        verifyOtpBtn.click();
        
    }

    public void verifyOtpPageDisplayed() {

        
    }

    // Step 3: User Details
    @FindBy(id = "fullName")
    WebElement fullName;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "continueBtn")
    WebElement continueBtn;

    public void enterFullName(String name) {
        fullName.sendKeys(name);
    }

    public void enterUsername(String uname) {
        username.sendKeys(uname);
    }

    public void enterPasswordAndConfirm(String pwd) {
        password.sendKeys(pwd);
        confirmPassword.sendKeys(pwd);
    }

    public void clickContinue() {
        continueBtn.click();
    }
}
