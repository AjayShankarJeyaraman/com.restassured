package pages;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class FacilityPage {
    WebDriver driver;

    public FacilityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//*[text()='Facility Management']") private WebElement facilityManagementMenu;
    @FindBy(xpath = "(//*[text()='Facilities'])[1]") private WebElement facilitiesSubMenu;
    @FindBy(xpath = "//*[text()='New Facility']") private WebElement newFacilityButton;
    @FindBy(xpath = "//*[@class='file-upload-session']") private WebElement facilityImageUpload;
    @FindBy(id = "name") private WebElement facilityNameField;
    @FindBy(id = "store_id") private WebElement facilityIdField;
    @FindBy(id = "description") private WebElement facilityDescriptionField;
    @FindBy(id = "controllable-time-zone-demo") private WebElement timeZoneDropdown;
    @FindBy(id = "controllable-country-demo") private WebElement countryDropdown;
    @FindBy(id = "controllable-state-demo") private WebElement stateDropdown;
    @FindBy(id = "controllable-city-demo") private WebElement cityDropdown;
    @FindBy(id = "area") private WebElement area;  // already defined
    @FindBy(id = "pincode") private WebElement pincodeField;
    @FindBy(id = "latitude") private WebElement latitudeField;
    @FindBy(id = "longitude") private WebElement longitudeField;
    @FindBy(id = "zone") private WebElement zoneField;
    @FindBy(id = "//*[text()='Create']") private WebElement createFacilityButton;

    // Actions
    public void navigateToFacilities() {
        facilityManagementMenu.click();
        facilitiesSubMenu.click();
    }

    public void clickNewFacility() {
        newFacilityButton.click();
    }

    public void uploadFacilityImage(String filePath) {
        facilityImageUpload.sendKeys(filePath);
    }

    public void enterFacilityName(String name) {
        facilityNameField.sendKeys(name);
    }

    public void enterFacilityId(String id) {
        facilityIdField.sendKeys(id);
    }

    public void enterDescription(String description) {
        facilityDescriptionField.sendKeys(description);
    }

    public void selectLocation(String timezone, String country, String state, String city) {
        new Select(timeZoneDropdown).selectByVisibleText(timezone);
        new Select(countryDropdown).selectByVisibleText(country);
        new Select(stateDropdown).selectByVisibleText(state);
        new Select(cityDropdown).selectByVisibleText(city);
    }

    
    public void enterLocationDetails(String pincode, String lat, String lon, String zone, String areaName) {
        pincodeField.sendKeys(pincode);
        latitudeField.sendKeys(lat);
        longitudeField.sendKeys(lon);
        zoneField.sendKeys(zone);
        area.sendKeys(areaName);  
    }

    public void clickCreateFacility() {
        createFacilityButton.click();
    }
}
