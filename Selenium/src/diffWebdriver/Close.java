package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close 
{
public static void main(String[] args) throws InterruptedException  
{
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	Thread.sleep(2000); //pause time for use
	
	driver.get("https://www.google.com"); //to enter the URL in browser or to open application
	
	Thread.sleep(2000);
	
	driver.close(); //to close the current tab of browser
	
		
}
}