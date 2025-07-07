package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentManagement {

    WebDriver driver;

    public ContentManagement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Content Management']")
    private WebElement contentManagementField;

    @FindBy(xpath = "(//*[text()='My Content'])[1]")
    private WebElement myContentField;

    @FindBy(id = "upload-media")
    private WebElement contentMediaBtn;

    @FindBy(xpath = "(//*[text()='Continue'])[1]")
    private WebElement continueBtn;

    @FindBy(id = "description")
    private WebElement contentDescription;

    @FindBy(xpath = "//*[@placeholder='Enter Media Tags']")
    private WebElement mediaTag;

    @FindBy(xpath = "//*[text()='Upload']")
    private WebElement uploadBtn;

    // Playlist elements

    @FindBy(xpath = "//*[text()='Playlist']")
    private WebElement playlistBtn;

    @FindBy(xpath = "//*[text()='New Playlist']")
    private WebElement newPlaylistBtn;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    private WebElement allcheckBox;

    @FindBy(id = "name")
    private WebElement playListName;

    @FindBy(id = "description")
    private WebElement playListDescription;

    @FindBy(xpath = "//*[text()='Continue']")
    private WebElement playlistContinueBtn;

    // === Action Methods ===

    public void clickContentManagement() {
        contentManagementField.click();
    }

    public void clickMyContent() {
        myContentField.click();
    }

    public void clickNewContentButton() {
        contentMediaBtn.click();
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void enterDescription(String description) {
        contentDescription.clear();
        contentDescription.sendKeys(description);
    }

    public void enterMediaTags(String tags) {
        mediaTag.clear();
        mediaTag.sendKeys(tags);
    }

    public void clickUploadButton() {
        uploadBtn.click();
    }

    // === Playlist Action Methods ===

    public void clickPlaylist() {
        playlistBtn.click();
    }

    public void clickNewPlaylistButton() {
        newPlaylistBtn.click();
    }

    public void checkAllMediaItems() {
        allcheckBox.click();
    }

    public void enterPlaylistName(String name) {
        playListName.clear();
        playListName.sendKeys(name);
    }

    public void enterPlaylistDescription(String description) {
        playListDescription.clear();
        playListDescription.sendKeys(description);
    }

    public void clickPlaylistContinueButton() {
        playlistContinueBtn.click();
    }
}
