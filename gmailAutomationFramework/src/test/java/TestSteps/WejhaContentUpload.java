package TestSteps;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WejhaContentUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().window().maximize();

        try {
            // 1. Login
            driver.get("https://cms-test.wejha.com/login");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("ajayshankarj123@gmail.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Ashankar@918");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Login']"))).click();

            // 2. Handle optional popup (Skip)
            Thread.sleep(2000); // Temporary wait for popup to render
            List<WebElement> skipBtns = driver.findElements(By.xpath("(//*[text()='Skip'])[2]"));
            if (!skipBtns.isEmpty()) {
                skipBtns.get(0).click();
                System.out.println("Skipped new features popup.");
            }

            // 3. Wait for loader or overlay to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("black-box")));

            // 4. Scroll to and click "Content Management"
            WebElement contentMgmt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Content Management']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contentMgmt);
            wait.until(ExpectedConditions.elementToBeClickable(contentMgmt)).click();

            // 5. Click "My Content"
            WebElement myContent = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Content']")));
            myContent.click();

            // 6. Click "+ New Content"
            WebElement newContentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'New Content')]")));
            newContentBtn.click();

            // 7. Click "+" Add Content
            WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Add Content']")));
            addBtn.click();

            // 8. Upload file
            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
            String filePath = "/Users/agmac26/Desktop/Ajayshankar.jpeg"; // Update this to your actual file path
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File not found: " + filePath);
                return;
            }
            fileInput.sendKeys(file.getAbsolutePath());
            System.out.println("File uploaded: " + file.getName());

            // 9. Select Portrait
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Portrait']/preceding-sibling::input"))).click();

            // 10. Enter Tags
            WebElement tagsInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Media Tags (Limit of 5)']")));
            tagsInput.sendKeys("automationTag");

            // 11. Select Audience Preference
            WebElement audienceDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'MuiSelect-root')]")));
            audienceDropdown.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Male')]"))).click();

            // 12. Click Upload
            WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Upload']")));
            uploadBtn.click();

            System.out.println("Upload completed successfully.");
            Thread.sleep(3000); // wait to confirm visually

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
