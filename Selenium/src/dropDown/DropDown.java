package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32 98.0.4\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL opened successfully");
		Thread.sleep(3000);
	
	//dropdown handling
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
		
		Select s = new Select(dropDown);
		
//		s.selectByIndex(1);            //option2
//		//or
//		s.selectByValue("option2");      //option2
//		
//		//or
		s.selectByVisibleText("Option2");        //option2 
		

	}
}