package diffWebdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize
{
public static void main(String[] args) throws InterruptedException {		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	
	Thread.sleep(3000);
	
	Dimension d=new Dimension(700, 700);     //w, h
	
	driver.manage().window().setSize(d);
	
}
}