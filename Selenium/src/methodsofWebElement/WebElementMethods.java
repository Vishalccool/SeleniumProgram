package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//USername WebElement
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		//password WebElement
		
		WebElement password =driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		//login button WebElement
		WebElement login = driver.findElement(By.className("button"));
		login.click();	
	
		
	}

}
