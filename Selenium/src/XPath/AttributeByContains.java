package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeByContains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
        //Xpath by attribute
		WebElement userName = driver.findElement(By.xpath("// input [@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("// input [@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.xpath("// input [@id='login-button']"));
		loginbutton.click();
		
		//Xpath by contains --> syntax by attribute 
		Thread.sleep(3000);
//				WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'user-')]"));
//				userName.sendKeys("standard_user");
//				Thread.sleep(3000);
//				WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
//				password.sendKeys("secret_sauce");
//				Thread.sleep(3000);
//				WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id,'login-')]"));
//				loginButton.click();
		
//				
	}
}