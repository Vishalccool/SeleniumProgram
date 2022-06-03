package enertics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enertics_Scenario3 
{
	// Negative test check
	
	public static void main (String [] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://devv2.enertics.ca/#/");
		System.out.println("URL opened successfully:" + driver.getCurrentUrl());
		
		
	    WebElement login = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
		login.click();
		System.out.println("Click on login");
	
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("Varinder.sembhi@enertics.ca"); 
		System.out.println("Type email");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("User@1234");      // Password is invalid
		System.out.println("Type password");
		
		WebElement continuebutton = driver.findElement(By.xpath("//button[@class='btn primary_btn']"));
	    continuebutton.click();
	    System.out.println("Unuccessful Login");
	    
	    
		
	}
}
