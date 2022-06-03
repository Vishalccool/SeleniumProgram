package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethodWithoutParameter 
       {
	
		// Take screenshot method
		public static WebDriver driver;
		public static void captureScreenshot()throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
		// Take the screenshot and store as file format
		File scrFile = ts.getScreenshotAs(OutputType.FILE);

		// Open the current date and time
		String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
		
		File destfile = new File("D:\\selenium installation\\ScreenShot\\loginpage.jpg"+timestamp+ ".PNG");
				
		
		//Copy the screenshot on the desire location with different name using current date and time
		FileHandler.copy(scrFile, destfile);
		}
		
		
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
			 driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
			ScreenshotMethodWithoutParameter ScreenshotConcept = null;
			ScreenshotConcept.captureScreenshot();
			
			Thread.sleep(5000);			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
			ScreenshotMethodWithoutParameter ScreenshotConcept2 = null;
			ScreenshotConcept2.captureScreenshot();
			
			Thread.sleep(5000);	
			
		
			WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
			loginbutton.click();
			
			// Call the screenshot method to take a screenshot
			ScreenshotConcept2.captureScreenshot();
			
			System.out.println("Homepage");
		

	}
}