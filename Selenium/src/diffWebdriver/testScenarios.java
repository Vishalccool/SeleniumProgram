package diffWebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testScenarios 
{
public static void main(String[] args) throws InterruptedException 
{
		
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
//	WebDriver driver =new ChromeDriver();

	System.setProperty("webdriver.edge.driver", "D:\\selenium installation\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.facebook.com");
//to enter URL in Browser or to open an application	
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
//maximize the Browser 
	
	Thread.sleep(2000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
//get the URL of Browser
	
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println("Title :" +(title));
//get the title of Browser
}
}