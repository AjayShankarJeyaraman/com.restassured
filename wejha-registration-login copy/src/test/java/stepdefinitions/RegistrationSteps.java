package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import pages.ContentManagement;
import pages.LoginPage;
import pages.OTPPage;
import pages.RegistrationPage;

public class RegistrationSteps {

    WebDriver driver = Hooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    OTPPage otpPage = new OTPPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    ContentManagement contentManagement = new  ContentManagement(driver);

    @Given("User navigates to wejha application")
    public void user_navigates_to_wejha_application() {
       driver.get("https://cms.wejha.com/login");
    }


    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Register")) {
        	registrationPage.clickRegister();
        } else if (buttonName.equalsIgnoreCase("Login")) {
            loginPage.clickLogin();
        } else if (buttonName.equalsIgnoreCase("Send OTP")) {
        	registrationPage.clickSendOtp();
        }
    }

    @And("User enters email {string} and clicks Send OTP")
    public void user_enters_email_and_clicks_send_otp(String email) {
        loginPage.enterEmail(email);
        registrationPage.clickSendOtp();
    }

    @And("User navigates to Gmail and retrieves the OTP")
    public void user_navigates_to_gmail_and_retrieves_the_otp() {
        // Placeholder – implement Gmail OTP logic
        otpPage.fetchOtpFromGmail(); // dummy method
    }

    @And("User enters the retrieved OTP in the OTP field")
    public void user_enters_the_retrieved_otp_in_the_otp_field() throws InterruptedException {
    	Thread.sleep(2000);
        otpPage.enterOtp(otpPage.retrievedOtp);
    }

    @And("User clicks the Submit button after entering OTP")
    public void user_clicks_the_submit_button_after_entering_otp() {
        otpPage.clickSubmit();
    }

    @Then("User should be navigated to the Create Account page")
    public void user_should_be_navigated_to_the_create_account_page() {
        registrationPage.verifyCreateAccountPage();
    }

    @When("User enters full name {string} and {string}")
    public void user_enters_full_name_and_username(String fullName, String userName1) {
        registrationPage.enterFullName(fullName);
        registrationPage.enterUserName1(userName1);
    }

    @And("User sets password {string} and confirm password {string}")
    public void user_sets_password_and_confirm_password(String password, String confirmPassword) {
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(confirmPassword);
    }

    @And("User clicks the Continue button on personal details page")
    public void user_clicks_the_continue_button_on_personal_details_page() {
        registrationPage.clickContinuePersonal();
    }

    @Then("User enters company name {string}, registration number {string}, phone {string}, email {string}, and address {string}")
    public void user_enters_company_details(String company, String regNumber, String phone, String email, String address) {
        registrationPage.enterCompanyDetails(company, regNumber, phone, email, address);
    }

    @And("User selects country as India")
    public void user_selects_country_as_india() {
        registrationPage.selectCountry("India");
    }

    @And("User selects state as Tamilnadu")
    public void user_selects_state_as_tamilnadu() {
        registrationPage.selectState("Tamilnadu");
    }

    @And("User selects city as Coimbatore")
    public void user_selects_city_as_coimbatore() {
        registrationPage.selectCity("Coimbatore");
    }

    @And("User enters pincode {string}")
    public void user_enters_pincode(String pin) {
        registrationPage.enterPincode(pin);
    }

    @And("User selects employee count option {string}")
    public void user_selects_employee_count_option(String count) {
        registrationPage.selectEmployeeCount(count);
    }

    @And("User clicks the Submit button on company details page")
    public void user_clicks_the_submit_button_on_company_details_page() {
        registrationPage.clickSubmitCompany();
    }

    @Then("User sees account creation confirmation popup and is navigated to the login page")
    public void user_sees_account_creation_confirmation_popup() {
        registrationPage.verifyAccountCreated();
    }

    @When("User enters login username {string} and password {string}")
    public void user_enters_login_username_and_password(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks the Login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        loginPage.verifySuccessfulLogin();
    }
}
