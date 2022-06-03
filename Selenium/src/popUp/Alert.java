package popUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
//	1)	Click on First tab Button 
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='alertBox']"));
		clickMe.click();	
		
//	 2) this method is of web driver interface which will return alert interface so store it as follows
//		Alert alt = driver.switchTo().alert();  
//		alt.accept();              //OK
		
//     3) Switch the selenium focus from main page to alert pop-up and for this use  method
	  //	driver.switchTo().alert();  
		
//	 4)  And now use the alert interface methods to perform action on alert pop-up as follows 
		driver.switchTo().alert().accept();  // to accept the alert 
//		driver.switchTo().alert().dismiss();  // to reject the alert 
//		driver.switchTo().alert().getText();   // to get text present on alert 
//		driver.switchTo().alert().sendKeys("Pravin");  // to send the value to alert 
		
	
//   5) Click on Second tab Button 	
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@id='confirmBox']"));
		clickMe2.click();	
		
		 driver.switchTo().alert().dismiss();
	}

}



