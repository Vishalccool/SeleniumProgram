package mouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		
		//casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");     //positive value-down
		System.out.println("scroiing down");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");  //negative value-down
		System.out.println("scroiing up");
	}

}
