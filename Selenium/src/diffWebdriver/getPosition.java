package diffWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition
{
public static void main(String[] args) throws InterruptedException {		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	
	Thread.sleep(2000);
	
	
	Point p = driver.manage().window().getPosition();
	System.out.println(p);
	
	
	
}
}
