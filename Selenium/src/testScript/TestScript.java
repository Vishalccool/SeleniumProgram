package testScript;
// Test Script with proper scenarios and Logs
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL opened successfully");
		Thread.sleep(3000); 
	
		//Xpath buy attribute
		WebElement userName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userName.sendKeys("standard_user");
		System.out.println("USerName Entered successfully");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		password.sendKeys("secret_sauce");
		System.out.println("Password Entered successfully");
	    Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginButton.click();
		System.out.println("clicked on the login button successfully");
		
		String expectedTitle = "Swag Labs";    //what we want
		
		String actualTitle = driver.getTitle();    //this is what we are getting
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("We are succesfuuly entered on HOMEPAGE");
			System.out.println("Test Script is passed");
		}
		else
		{
			System.out.println("Test Script is failed");
		}
		
		Thread.sleep(3000);
		driver.close();
		System.out.println("browser is closed now");

	


		

		
	}
}