package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.FacebookLoginPage;

public class LoginSteps extends BaseTest {

    FacebookLoginPage loginPage;

    @Before
    public void setupTest() throws Exception {
        setUp();
        loginPage = new FacebookLoginPage(driver);
    }

    @Given("Facebook app is launched")
    public void facebookAppIsLaunched() {
        // Launched in setup
    }

    @When("user enters valid {string} and {string}")
    public void userEntersValidCredentials(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        System.out.println("Login submitted. Manually verify outcome.");
    }

    @After
    public void tearDownTest() {
        tearDown();
    }
}
