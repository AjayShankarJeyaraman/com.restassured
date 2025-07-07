package Assesment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.redbus.in/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement fromInput = driver.findElement(By.xpath("//div[text()='From']"));
        fromInput.sendKeys("Coimbatore");
        Thread.sleep(1000);
       
        WebElement toInput = driver.findElement(By.xpath("//div[text()='To']"));
        toInput.sendKeys("Bangalore");
        Thread.sleep(1000);
       
        WebElement todayBtn = driver.findElement(By.xpath("//*[text()='Today']"));
        todayBtn.click();

    
        WebElement searchBtn = driver.findElement(By.xpath("//*[text()='Search buses']"));
        searchBtn.click();

        Thread.sleep(5000);

        
        // Store main window handle
        String mainWindow = driver.getWindowHandle();

        // Click on "Click Here" link to open new window
        WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Click Here']"));
        clickBtn.click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to new window and print its text
        for (String handle : allWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);

                
                

                // Close the child window
                driver.close();
        
        
        
        List<WebElement> busNames = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));

       

        for (WebElement bus : busNames) {
            String busName = bus.getText();

                     
            System.out.println("Bus Name: " + busName );
        }

        driver.quit();
    }
}
        }
    }