package Boards;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement CreateButton = driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateButton.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Tom");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Jerry");
		
		
		//DropDown
		
		WebElement Day = driver.findElement(By.id("day"));
		Select SelectDay = new Select(Day);
		SelectDay.selectByVisibleText("15");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select SelectMonth = new Select(Month);
		SelectMonth.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select SelectYear = new Select(year);	
		SelectYear.selectByVisibleText("1997");
		
		WebElement Male = driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
		Male.click();
		
		WebElement EmailorPhone = driver.findElement(By.name("reg_email__"));
		EmailorPhone.sendKeys("8883398663");
		
		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Ajayshankar@1997");
		
		WebElement Signup = driver.findElement(By.xpath("//*[@type='submit'][1]"));
		Signup.click();
		
		
		
		
		//Alert
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("Ajay Shankar");
		alert.dismiss();
		alert.accept();
		
		//Action 
		WebElement Password = driver.findElement(By.id("password_step_input"));
		WebElement Password = driver.findElement(By.id("password_step_input"));
		WebElement Password = driver.findElement(By.id("password_step_input"));
		WebElement Password = driver.findElement(By.id("password_step_input"));
		
		
	Actions action = new Actions(driver);
	action.doubleClick(Password).perform();
	action.moveToElement(EmailorPhone).perform();
	action.dragAndDrop(Password, Signup).perform();
	action.contextClick(Password).perform();
		
		
		//keyboard action
	
	action.sendKeys(Keys.ENTER);
		
		//frame
	driver.switchTo().frame("Login_frame");
	WebElement Password = driver.findElement(By.id("password_step_input"));
	WebElement Password = driver.findElement(By.id("password_step_input"));
	WebElement Password = driver.findElement(By.id("password_step_input"));
	WebElement Password = driver.findElement(By.id("password_step_input"));
	
	driver.switchTo().defaultContent();
		
		
		//naviagtion 
		driver.navigate().refresh();
	    driver.navigate().to("url");
	    
	    
	   // window handlingling 
	    
	    String mainWindow = driver.getWindowHandle();
	    
	    Set<String> ChildWindow = driver.getWindowHandles();
		
	    for(String handle : ChildWindow) {
	    	if(!handle.equals(mainWindow)) {
	    		driver.switchTo().window(handle);
	    	}
	    	
	    	driver.close();
	    	
	    }
	    
	    //screenshot 
	    
	 // Assuming 'driver' is already initialized
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File source = screenshot.getScreenshotAs(OutputType.FILE);

	    // Give an actual file path with file name and extension (like .png or .jpg)
	    File destination = new File("./screenshots/homepage.png"); // Make sure this folder exists
	    FileHandler.copy(source, destination);

		
	}

}


//All the sleneium methods 

//alert 










