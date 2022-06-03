package diffWebdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize
{
public static void main(String[] args) throws InterruptedException {		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	
	Thread.sleep(3000);
	
	Dimension d = driver.manage().window().getSize();
	System.out.println(d);
	
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	
	Dimension d1 = driver.manage().window().getSize();
	System.out.println(d1);
		
	
}
}