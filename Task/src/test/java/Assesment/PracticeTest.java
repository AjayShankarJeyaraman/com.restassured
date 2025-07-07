package Assesment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Radio Button Section
        System.out.println(driver.findElement(By.xpath("//*[text()='Radio Button Example']")).getText());
        driver.findElement(By.name("radioButton")).click();
        driver.findElement(By.xpath("//input[@value='radio2']")).click(); 
        driver.findElement(By.xpath("//input[@value='radio3']")).click();

        // Suggestion Class Example
        System.out.println(driver.findElement(By.xpath("//*[text()='Suggession Class Example']")).getText());
        driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Germany");

        // Dropdown Example
        System.out.println(driver.findElement(By.xpath("//*[text()='Dropdown Example']")).getText());
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        select.selectByIndex(1);

        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected Options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Alert Handling
        driver.findElement(By.id("name")).sendKeys("28");
        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Simple alert handled");

        driver.findElement(By.id("confirmbtn")).click();
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        System.out.println("Confirmation alert handled");

        // Scroll and Mouse Hover
        WebElement mouseHover = driver.findElement(By.id("mousehover"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHover)
               .sendKeys(Keys.ARROW_DOWN)
               .sendKeys(Keys.ARROW_DOWN)
               .sendKeys(Keys.ENTER)
               .perform();

        System.out.println("Completed mouse hover actions");

        driver.quit();
    }
}
