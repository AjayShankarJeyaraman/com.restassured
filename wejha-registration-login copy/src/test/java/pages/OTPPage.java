package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPage {

    WebDriver driver;
    public String retrievedOtp = "123456"; // Placeholder — actual OTP should be fetched dynamically

    public OTPPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "otp")
    private WebElement otpField;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitOtpBtn;

    public void fetchOtpFromGmail() {
        // Placeholder for Gmail OTP logic (JavaMail API)
        // Set retrievedOtp = fetched value
    }

    public void enterOtp(String otp) {
        otpField.clear();
        otpField.sendKeys(otp);
    }

    public void clickSubmit() {
        submitOtpBtn.click();
    }
}
