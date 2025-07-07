package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.FacilityPage;

import java.net.MalformedURLException;
import java.net.URL;

public class FacilitySteps {

    private WebDriver driver;
    private FacilityPage facilityPage;

    @Given("User is on the facility page")
    public void user_is_on_the_facility_page() {
        // Implementation of this step is not provided in the original file or the new file
    }

    @When("User clicks the {string} button")
    public void user_clicks_the_facilities_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Facilities")) {
            facilityPage.navigateToFacilityCreation();
        } else if (buttonName.equalsIgnoreCase("New Facility")) {
            facilityPage.newfacilitybutton();
        } else if (buttonName.equalsIgnoreCase("Create Facility")) {
            facilityPage.clickCreateFacility();
        }
    }

    @Then("User should be redirected to the facility creation page")
    public void user_should_be_redirected_to_the_facility_creation_page() {
        // Implementation of this step is not provided in the original file or the new file
    }
} 