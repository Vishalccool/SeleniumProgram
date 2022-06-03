package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramUsingXpath
{
	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		  // Get Method  		
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(2000);
		  
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  // Xpath by Tag Name
//		  WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		  username.sendKeys("");
//		  Thread.sleep(2000);
//		  
//		  WebElement  password = driver.findElement(By.xpath("//input[@name='password']"));
//		  password.sendKeys("");
//		  Thread.sleep(2000);
		  
		  WebElement facebooklogin = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		  facebooklogin.click();
		  
		  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		  email.sendKeys("Enter you emailid");
		  Thread.sleep(2000);
		  
		  WebElement  password = driver.findElement(By.xpath("//input[@id='pass']"));
		  password.sendKeys("Enter your password");
		  Thread.sleep(2000);
		  
		  WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		  login.click();
		  
		  Thread.sleep(2000);
	}
}