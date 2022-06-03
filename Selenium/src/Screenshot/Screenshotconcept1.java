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

public class Screenshotconcept1 
{
	
	// method for screenshot 
	// Take screenshot method
	public static WebDriver driver;
	public static void captureScreenshot(String fileName,String extension)throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	// Take the screenshot and store as file format
	File scrFile = ts.getScreenshotAs(OutputType.FILE);

	// Open the current date and time
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

	//Copy the screenshot on the desire location with different name using current date and time
	FileHandler.copy(scrFile, new File("D:\\selenium installation\\ScreenShot\\" + fileName+" "+timestamp+extension));
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		 driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//Casting 
	//	TakesScreenshot ts = (TakesScreenshot)driver;
//	********	
//		int x = 10;
//		System.out.println(x);
//		
//		double y = (double)x;
//		System.out.println(y);
		
//*********
		
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("E:\\Learning Material\\Screenshots\\homepage1.jpg");
//		//check whether other extensions are supported or not (jpg,png,)
//		FileHandler.copy(source, dest);
//		System.out.println("Scrrenshot is taken");
//		// OutputType.FILE => classname.static method 
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		// Call the screenshot method to take a screenshot
		Screenshotconcept1.captureScreenshot("screenshot1",".png");

		
		System.out.println("Homepage");
//		
//		File source1 = ts.getScreenshotAs(OutputType.FILE);
//		File dest1 = new File("E:\\Learning Material\\Screenshots\\loginpage1.jpg");
//		FileHandler.copy(source1, dest1);
//		

//Assignment 2  -  code to change the file name to timestamp name bcoz we are not getting same file name  
	}

	

}