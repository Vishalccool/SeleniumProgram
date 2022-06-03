package seleniumProgram;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class DiffBrowser 
	{
		public static void main(String[] args) throws InterruptedException 
		{
//			System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32 98.0.4\\chromedriver.exe");
					
				
					
//			WebDriver -->Interface of seleium		
//			driver --> reference variable		 
//			ChromeDriver() --> impclass interface	
					
//			get(String URL)  : void  : WebDriver
			
//			WebDriver driver =  new ChromeDriver();	 //upcasting
//			driver.get("https://www.google.com");
//			Thread.sleep(3000);
			
//			
//			//2nd instance
//			WebDriver driver1 =  new ChromeDriver();	 //upcasting
//			driver1.get("https://www.selenium.dev");
			
			
//			WebDriver driver =  new ChromeDriver();	     //upcasting
//			
//			
//			WebDriver driver1 = new WebDriver();		//not possible
			
			
//			ChromeDriver driver = new ChromeDriver();    //object creation
//			
//			driver.get("https://www.selenium.dev");
			
			//chrome
//			System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32 98.0.4\\chromedriver.exe");
//			WebDriver driver1 =  new ChromeDriver();
//			driver1.get("https://www.selenium.dev");
			
			
			//firefox --gecko
//			System.setProperty("webdriver.gecko.driver", 
//							"C:\\Users\\Admin\\Desktop\\Pavan Velo\\13-Nov Batch\\Selenium Downloads\\chromedriver_win32\\geckodriver.exe");
//			WebDriver driver2 =  new FirefoxDriver();
//			driver.get("https://www.selenium.dev");
//			
			System.setProperty("webdriver.edge.driver", "D:\\selenium installation\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver3 =  new EdgeDriver();
			driver3.get("https://www.selenium.dev");
			
			
			
			
		}

	}
	


