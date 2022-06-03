package diffWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition
{
public static void main(String[] args) throws InterruptedException {		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	
	Thread.sleep(2000);
	
	Dimension d=new Dimension(300, 500);     	
	driver.manage().window().setSize(d);
	
	Thread.sleep(2000);
	
	Point p=new Point(300, 400);         //x,y
	driver.manage().window().setPosition(p);
	
	
}
}