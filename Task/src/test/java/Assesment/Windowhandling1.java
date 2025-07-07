package Assesment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Click the button to open a new window
        driver.findElement(By.id("openwindow")).click();

        // Get the main window handle
        String mainWindow = driver.getWindowHandle();

        // Get all window handles
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                System.out.println("Switched to new window: " + driver.getTitle());

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                // ✅ Wait for the preloader to go invisible
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".preloader")));

                // ✅ Wait until Courses link is clickable
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Courses'])[1]")));

                // ✅ Click it
                driver.findElement(By.xpath("(//*[text()='Courses'])[1]")).click();
                break;
            }
        }

        Thread.sleep(2000);
        System.out.println("It's working perfectly");

        driver.quit(); // Close all windows
    }
}
