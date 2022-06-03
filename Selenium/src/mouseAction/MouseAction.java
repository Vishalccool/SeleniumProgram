package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");



		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
          
//		WebElement interface
//		login.click();
		
		
		//Mouse action
		Actions act  = new Actions(driver);
		act.click(login).perform();
		
//		act.moveToElement(login).click().perform();
		
//		act.contextClick().perform();
		
		//action create and not executing
//		act.click(login);
//		act.doubleClick(WebElement);
//		act.contextClick();
//		act.moveToElement(webelement);
		
		//perform method  --> action complete
	
		
		
//		act.doubleClick(WebElement).perform();
//		act.contextClick().perform();
//		act.moveToElement(webelement).perform();
		
		
		
		
		
		
		
		
	}

}

