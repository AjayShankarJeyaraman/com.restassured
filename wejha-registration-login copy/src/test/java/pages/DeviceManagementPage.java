package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeviceManagementPage {
    WebDriver driver;

    public DeviceManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//*[text()='Device Management']") private WebElement deviceManagementMenu;
    @FindBy(xpath = "(//*[text()='Signage Devices'])[1]") private WebElement signageDeviceButton;
    @FindBy(xpath = "//*[text()='New Device Signage']") private WebElement newDeviceButton;
    @FindBy(xpath ="(//*[@type='text'])[1]") private WebElement facilityDropdown;
    @FindBy(xpath = "(//*[@type='text'])[2]") private WebElement deviceNameField;
    @FindBy(xpath = "(//*[@type='text'])[3]") private WebElement deviceIdField;
    @FindBy(xpath = "//*[text()='Create']") private WebElement createButton;

    // Actions
    public void navigateToDeviceManagement() {
        deviceManagementMenu.click();
    }

    public void clickSignageDevice() {
        signageDeviceButton.click();
    }

    public void clickNewSignageDevice() {
        newDeviceButton.click();
    }

    public void selectFacility(String facilityName) {
        new Select(facilityDropdown).selectByVisibleText(facilityName);
    }

    public void enterDeviceName(String name) {
        deviceNameField.sendKeys(name);
    }

    public void enterDeviceId(String id) {
        deviceIdField.sendKeys(id);
    }

    public void clickCreateButton() {
        createButton.click();
    }
}
