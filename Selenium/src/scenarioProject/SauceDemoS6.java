package scenarioProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//S6. Verify the logout functionality

public class SauceDemoS6 
{
	// Take screenshot method
	public static WebDriver driver;
	public static void captureScreenshot()throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	// Take the screenshot and store as file format
	File scrFile = ts.getScreenshotAs(OutputType.FILE);

	// Open the current date and time
	String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
	
	File destfile = new File("D:\\selenium installation\\ScreenShot\\"+timestamp+ ".PNG");
	
	//Copy the screenshot on the desire location with different name using current date and time
	FileHandler.copy(scrFile, destfile);
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Browser opened successfully: "+title);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		String title1 = driver.getTitle();
		System.out.println("UserName is accept successfully: "+title1);
		SauceDemoS6.captureScreenshot();
			
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		String title2 = driver.getTitle();
		System.out.println("Password is accept successfully: "+title2);
		SauceDemoS6.captureScreenshot();
			
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		String title3 = driver.getTitle();
		System.out.println("Homepage: "+title3);
		SauceDemoS6.captureScreenshot();
		
        WebElement selectproduct = driver.findElement(By.xpath("//img [@alt='Sauce Labs Backpack']"));
        selectproduct.click();
        String title4 = driver.getTitle();
        System.out.println("selectproduct: "+title4);
        SauceDemoS6.captureScreenshot();
        
        WebElement addproduct = driver.findElement(By.xpath("//button [@id='add-to-cart-sauce-labs-backpack']"));
        addproduct.click();
        String title5 = driver.getTitle();
        System.out.println("addproduct: "+title5);
        SauceDemoS6.captureScreenshot();
        
        WebElement clickcartbutton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        clickcartbutton.click();
        String title6 = driver.getTitle();
        System.out.println("clickcartbutton: "+title6);
        SauceDemoS6.captureScreenshot();
      
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        String title7 = driver.getTitle();
        System.out.println("checkout: "+title7);
        SauceDemoS6.captureScreenshot();
     
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("vishal");
        String title8 = driver.getTitle();
        System.out.println("firstname: "+title8);
        SauceDemoS6.captureScreenshot();
        
        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("chavan");
        String title9 = driver.getTitle();
        System.out.println("firstname: "+title9);
        SauceDemoS6.captureScreenshot();
        
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("411057");
        String title10 = driver.getTitle();
        System.out.println("zipcode: "+title10);
        SauceDemoS6.captureScreenshot();
        
        WebElement hambergerbutton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
   	    hambergerbutton.click();
   	 
   	 //here hambergerbutton is dropdown which dont have select class. this is customised dropdown
   	 //so we need to use findElements method,inspect that list & store it in list form
   	 //and click required function using click method of webElement
   	 
   	    List<WebElement> alloptions=new ArrayList<WebElement>(driver.findElements(By.xpath("//nav[@class='bm-item-list']//a")));
   	    System.out.println(alloptions); //choose xpath in such a way that it should cover all list items
   	 
        WebElement option1=alloptions.get(2);  //here about tab's  index is 2
   	    option1.click();
   	 
        System.out.println("logout the application");
       
     
	}
	
}