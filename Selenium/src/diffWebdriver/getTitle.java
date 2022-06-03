package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle
{
public static void main(String[] args) throws InterruptedException 
{		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.get("https://www.facebook.com");//this URL is printed
	
	String title = driver.getTitle();     //return type of getTitle() type is String
	System.out.println(title);
	
		
}
}