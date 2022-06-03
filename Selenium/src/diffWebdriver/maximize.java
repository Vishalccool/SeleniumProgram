package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize 
{
public static void main(String[] args) throws InterruptedException  
{
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com"); 
	
	Thread.sleep(2000);
//Maximize the browser
	
	driver.manage().window().maximize();
// V-IMP note	
//Note we can't minimize the browser 
//if we minimize it then how we will be able to execute the automation script on it.	
	driver.manage().window().minimize();	
		
}
}