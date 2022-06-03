package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
public static void main(String[] args) throws InterruptedException  
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
		
	driver.manage().window().maximize();
		
	
	Thread.sleep(2000);
// Navigate method is used for open the application and move forward,backward,refresh the webpage.
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
}
}