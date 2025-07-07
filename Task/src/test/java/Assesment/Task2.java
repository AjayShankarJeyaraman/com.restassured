package Assesment;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
       
       
      WebElement Dropdown = driver.findElement(By.xpath(""));
      
      Select select = new Select(Dropdown);
       List<WebElement>allcountry=select.getOptions();
       
       for(WebElement option:allcountry){
    	   System.out.println(option.getText());
    	   
    	   WebElement menu = driver.findElement(By.xpath(null)); // Line 1
    	   Actions action = new Actions(driver);
    	   action.moveToElement(menu).perform();
    	   action.contextClick().perform();
    	   
    	   WebElement CountryName = driver.findElement(By.xpath(""));  
    	   
    	   Select S=new Select(CountryName);
    	   
    	   List<WebElement>AllCountry =S.getAllSelectedOptions();
    	   
    	   for(WebElement options : AllCountry) {
    		   
    		  String country = options.getText();
    		  
    		  System.out.println(country);
    		  
    		  S.selectByVisibleText(country);
    		  
    		  
    		  
    		  
    		String mainWindow =  driver.getWindowHandle();
    		
    		Set<String>ChildWindow=driver.getWindowHandles();
    		
    		for(String Handle : ChildWindow) {
    			if(!Handle.equals(mainWindow)) {
    				driver.switchTo().window(Handle);
    			}
    			
    		}
    		  
    		   
    	   }
    	   
      
       }
     
       
       
       
       
     
    }
    }



/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownExample {
    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the practice site
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Switch to the iframe containing the drop-down (if applicable)
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        // Locate the drop-down element
        WebElement dropdown = driver.findElement(By.tagName("select"));

        // Create a Select object
        Select select = new Select(dropdown);

        // Retrieve all options from the drop-down
        List<WebElement> options = select.getOptions();

        // Print all options
        System.out.println("Available Countries:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
*/