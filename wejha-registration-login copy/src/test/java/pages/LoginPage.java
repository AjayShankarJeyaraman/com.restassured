package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
    @FindBy(id = "email")
    private WebElement emailField;

   

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[text()='Login'] ")
    private WebElement loginBtn;
    
   


    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

   
    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public void verifySuccessfulLogin() {
        // Add assert/check to verify successful login
    }
}
