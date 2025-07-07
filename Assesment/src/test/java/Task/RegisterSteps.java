package Task;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Task.RegisterPage;
import Task.CompanyPage;
import Task.LoginPage;
import Task.Hooks; // Ensure Hooks class is available and sets 'driver'

 // Ensure this utility is created to fetch OTP

public class RegisterSteps {

    WebDriver driver;
    RegisterPage registerPage;
    CompanyPage companyPage;
    LoginPage loginPage;

    public RegisterSteps() {
        this.driver = Hooks.driver;
        this.registerPage = PageFactory.initElements(driver, RegisterPage.class);
        this.companyPage = PageFactory.initElements(driver, CompanyPage.class);
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Given("User navigates to the registration page")
    public void user_navigates_to_registration_page() {
        driver.get("https://cms.wejha.com/login");
    }

    @When("User clicks on the {string} button")
    public void user_clicks_register_button(String buttonText) {
        registerPage.clickButton(buttonText);
    }

    @And("User enters email {string} and submits")
    public void user_enters_email_and_submits(String email) {
        registerPage.enterEmail(email);
        registerPage.submitEmail();
    }

    @Then("User should be navigated to OTP verification page")
    public void user_navigated_to_otp_page() {
        registerPage.verifyOtpPageDisplayed();
    }

    @When("User retrieves OTP from Gmail and enters it")
    public void user_enters_otp_from_gmail() {
       
    }

    @And("User enters full name {string}")
    public void user_enters_full_name(String name) {
        registerPage.enterFullName(name);
    }

    @And("User enters username {string}")
    public void user_enters_username(String username) {
        registerPage.enterUsername(username);
    }

    @And("User sets password {string} and confirms password")
    public void user_sets_password(String password) {
        registerPage.enterPasswordAndConfirm(password);
    }

    @And("User clicks on the Continue button")
    public void user_clicks_continue() {
        registerPage.clickContinue();
    }

    @Then("User should be navigated to the company details page")
    public void user_navigated_to_company_page() {
        companyPage.verifyCompanyPageDisplayed();
    }

    @When("User enters company name {string}")
    public void user_enters_company_name(String company) {
        companyPage.enterCompanyName(company);
    }

    @And("User enters registration number {string}")
    public void user_enters_registration_number(String regNo) {
        companyPage.enterRegistrationNumber(regNo);
    }

    @And("User enters phone number {string}")
    public void user_enters_phone(String phone) {
        companyPage.enterPhoneNumber(phone);
    }

    @And("User enters company email {string}")
    public void user_enters_company_email(String email) {
        companyPage.enterCompanyEmail(email);
    }

    @And("User enters address {string}")
    public void user_enters_address(String address) {
        companyPage.enterAddress(address);
    }

    @And("User selects country {string}")
    public void user_selects_country(String country) {
        companyPage.selectCountry(country);
    }

    @And("User selects state {string}")
    public void user_selects_state(String state) {
        companyPage.selectState(state);
    }

    @And("User selects city {string}")
    public void user_selects_city(String city) {
        companyPage.selectCity(city);
    }

    @And("User enters pincode {string}")
    public void user_enters_pincode(String pincode) {
        companyPage.enterPincode(pincode);
    }

    @And("User enters total devices {string}")
    public void user_enters_total_devices(String devices) {
        companyPage.enterTotalDevices(devices);
    }

    @And("User clicks on the Submit button")
    public void user_clicks_submit() {
        companyPage.clickSubmit();
    }

    @Then("User should see the message {string}")
    public void user_sees_success_message(String message) {
        companyPage.verifySuccessMessage(message);
    }

    @When("User logs in using username {string} and password {string}")
    public void user_logs_in(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("User should be redirected to the dashboard")
    public void user_redirected_to_dashboard() {
        loginPage.verifyDashboardLoaded();
    }
}
