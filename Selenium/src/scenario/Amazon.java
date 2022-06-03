package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{	

	public static void main (String [] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("URL opened successfully:" + driver.getCurrentUrl());
		
		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		account.click();
		System.out.println("Click on account");
	
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='ap_email']"));
		phoneno.sendKeys("9011159154");
		System.out.println("Type phoneno");
		
		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
	    continuebutton.click();
		
		
	}
}
