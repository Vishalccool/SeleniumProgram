package popUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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

public class ChlidBrowser 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/obj_console.asp");
		
		
		//to get the address
		String addressManinPage = driver.getWindowHandle();
		System.out.println("MainPageAddress -"+addressManinPage);
		
		WebElement tryItUrselfButton = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		tryItUrselfButton.click();	
		
		WebElement tryItUrselfButton2 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		tryItUrselfButton2.click();	
		
		//address of two pages
		
//		Set <String> allPagesAddresses = new HashSet<String>(driver.getWindowHandles());
		
		List<String> allPagesAddresses = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("allPagesAddresses -"+allPagesAddresses);
		System.out.println(allPagesAddresses.get(0));      //main
		System.out.println(allPagesAddresses.get(1));      //child -->latest button
		System.out.println(allPagesAddresses.get(2));      //child --> previous
		
		driver.switchTo().window(allPagesAddresses.get(1));   //switch to u on child page
		
		WebElement newWebsiteButton = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		newWebsiteButton.click();	

		
		
	}

}
