package XPath;

//Method of WebElement get Attribute, get Text, get TagName
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class byWebelement 
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
	
		//Method of WebElement get Attribute, get Text, get TagName
		WebElement userName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userName.sendKeys("standard_user");
		
		String idAttribute = userName.getAttribute("id");
		System.out.println(idAttribute);
		
		System.out.println("HTML Text -" +userName.getText());
		System.out.println("tagName is _ "+userName.getTagName());
		
		
	}
}