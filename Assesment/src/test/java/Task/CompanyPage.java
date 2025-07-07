package Task;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class CompanyPage {
    WebDriver driver;

    public CompanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "companyName")
    WebElement companyName;

    @FindBy(id = "regNumber")
    WebElement regNumber;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "companyEmail")
    WebElement companyEmail;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "pincode")
    WebElement pincode;

    @FindBy(id = "totalDevices")
    WebElement totalDevices;

    @FindBy(id = "submitBtn")
    WebElement submitBtn;

    @FindBy(id = "successMessage")
    WebElement successMessage;

    public void verifyCompanyPageDisplayed() {
        if (!companyName.isDisplayed()) {
            throw new AssertionError("Company page is not displayed");
        }
    }

    public void enterCompanyName(String name) {
        companyName.sendKeys(name);
    }

    public void enterRegistrationNumber(String regNo) {
        regNumber.sendKeys(regNo);
    }

    public void enterPhoneNumber(String ph) {
        phone.sendKeys(ph);
    }

    public void enterCompanyEmail(String email) {
        companyEmail.sendKeys(email);
    }

    public void enterAddress(String addr) {
        address.sendKeys(addr);
    }

    public void selectCountry(String countryVal) {
        new Select(country).selectByVisibleText(countryVal);
    }

    public void selectState(String stateVal) {
        new Select(state).selectByVisibleText(stateVal);
    }

    public void selectCity(String cityVal) {
        new Select(city).selectByVisibleText(cityVal);
    }

    public void enterPincode(String pin) {
        pincode.sendKeys(pin);
    }

    public void enterTotalDevices(String count) {
        totalDevices.sendKeys(count);
    }

    public void clickSubmit() {
        submitBtn.click();
    }

    public void verifySuccessMessage(String expected) {
        String actual = successMessage.getText();
        if (!actual.equals(expected)) {
            throw new AssertionError("Expected: " + expected + ", but got: " + actual);
        }
    }
}
