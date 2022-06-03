package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainByText
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//Xpath by contains --> By Attribute
		WebElement userName = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
		userName.sendKeys("Vishalccool@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		password.sendKeys("Vishal");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]"));
		loginbutton.click();
		
		//input[contains(@class,'_2IX_2- VJZDxU')]
		//input[contains(@type,'password')]
		//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]
	}
}