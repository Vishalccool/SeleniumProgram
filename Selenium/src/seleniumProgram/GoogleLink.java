package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class GoogleLink 
	{
	  public static void main (String []args) 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\selenium installation\\chromedriver_win32 98.0.4\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");

	  }
	}


