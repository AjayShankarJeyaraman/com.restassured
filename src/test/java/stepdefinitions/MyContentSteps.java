package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.MyContentPage;

public class MyContentSteps {

    private final WebDriver driver;
    private final MyContentPage contentPage;

    public MyContentSteps() {
        this.driver = Hooks.getDriver();
        this.contentPage = new MyContentPage(driver);
    }

    @When("User clicks on Content Management tab")
    public void user_clicks_on_content_management_tab() {
        contentPage.clickContentManagement();
    }

    @And("User clicks on My Content")
    public void user_clicks_on_my_content() {
        contentPage.clickMyContent();
    }

    @And("User clicks on New Content button")
    public void user_clicks_on_new_content_button() {
        contentPage.clickNewContent();
    }

    @And("User clicks on Add Content")
    public void user_clicks_on_add_content() {
        contentPage.clickAddContent();
    }

    @And("User selects Portrait as the content type")
    public void user_selects_portrait_as_the_content_type() {
        contentPage.selectPortraitOption();
    }

    @And("User enters media tags {string}")
    public void user_enters_media_tags(String tags) {
        contentPage.enterMediaTags(tags);
    }

    @And("User selects Male in audience preference")
    public void user_selects_male_in_audience_preference() {
        contentPage.clickAudiencePreference();
        contentPage.selectMaleAudience();
    }

    @And("User selects All under result options")
    public void user_selects_all_under_result_options() {
        contentPage.selectAllResultOption();
    }

    @And("User uploads file from path {string}")
    public void user_uploads_file_from_path(String filePath) {
        contentPage.uploadFile(filePath);
    }

    @And("User clicks on Upload button")
    public void user_clicks_on_upload_button() {
        contentPage.clickUploadButton();
    }
} 