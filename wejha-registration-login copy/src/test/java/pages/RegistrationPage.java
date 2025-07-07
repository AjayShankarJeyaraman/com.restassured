package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //Register Button 
    
    @FindBy(xpath = "//*[text()='Register']")
    private WebElement registerBtn;

    @FindBy(xpath = "//*[text()='Send OTP']")
    private WebElement sendOtpBtn;

    // Personal details
    @FindBy(id = "user_full_name")
    private WebElement fullNameField;
    
    @FindBy(id = "user_name")
    private WebElement UserName1;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "re_password")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//*[text()='Continue']")
    private WebElement continuePersonalBtn;

    // Company details
    @FindBy(id = "company_name")
    private WebElement companyNameField;

    @FindBy(id = "tax_id")
    private WebElement registrationNumberField;

    @FindBy(id = "phone_number")
    private WebElement phoneField;

    @FindBy(id = "company_email")
    private WebElement companyEmailField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "//*[@id='controllable-country-demo'] ")
    private WebElement countryDropdown;

    @FindBy(xpath = "//*[@id='controllable-state-demo'] ")
    private WebElement stateDropdown;

    @FindBy(xpath = "//*[@id='controllable-city-demo']")
    private WebElement cityDropdown;

    @FindBy(id = "pincode")
    private WebElement pincodeField;

    @FindBy(xpath = "//*[@id='controllable-count'] ")
    private WebElement employeeCountDropdown;

    @FindBy(xpath = "//*[text()='Submit'] ")
    private WebElement submitCompanyBtn;
    

    public void clickRegister() {
        registerBtn.click();
    }

    public void clickSendOtp() {
        sendOtpBtn.click();
    }


    public void verifyCreateAccountPage() {
        // Assert logic or validation to confirm you're on the correct page
    }

    public void enterFullName(String name) {
        fullNameField.sendKeys(name);
    }
    
    public void enterUserName1(String username) {
        UserName1.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickContinuePersonal() {
        continuePersonalBtn.click();
    }

    public void enterCompanyDetails(String name, String regNo, String phone, String email, String address) {
        companyNameField.sendKeys(name);
        registrationNumberField.sendKeys(regNo);
        phoneField.sendKeys(phone);
        companyEmailField.sendKeys(email);
        addressField.sendKeys(address);
    }

    public void selectCountry(String country) {
        countryDropdown.sendKeys(country);
    }

    public void selectState(String state) {
        stateDropdown.sendKeys(state);
    }

    public void selectCity(String city) {
        cityDropdown.sendKeys(city);
    }

    public void enterPincode(String pincode) {
        pincodeField.sendKeys(pincode);
    }

    public void selectEmployeeCount(String count) {
        employeeCountDropdown.sendKeys(count);
    }

    public void clickSubmitCompany() {
        submitCompanyBtn.click();
    }

    public void verifyAccountCreated() {
        // Add validation logic for pop-up or confirmation text
    }
}
