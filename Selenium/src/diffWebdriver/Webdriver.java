package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class Webdriver 
	{
	  public static void main (String []args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			//maximize
//			driver.manage().window().maximize();

			//maximize
//			driver.maximize();      //no such a method 
			
			//get method : open the URL
//			driver.get("https://www.google.com");    // to open the URL
			
		     //navigate method : open the URL
			driver.navigate().to("https://www.facebook.com"); 
			Thread.sleep(3000);
			
//			driver.navigate().to("https://www.instagram.com");
//			Thread.sleep(3000);
			
//			driver.navigate().back();       //google
//			Thread.sleep(3000);
			
//			driver.navigate().forward();       //facebook
//			Thread.sleep(3000);
			
//			driver.navigate().refresh();       //facebook
//			Thread.sleep(5000);
			
			
			//URL
			driver.getCurrentUrl();
			String currentURl = driver.getCurrentUrl();
			System.out.println(currentURl);
			// o/p : https://www.facebook.com/
			
			//title
			driver.getTitle();
			String  title = driver.getTitle();
			System.out.println(title);
			// o/p : Facebook – log in or sign up

			
			
			//close - quit
//			driver.close();
//			driver.quit();

		//to set the size of browser
//		Dimension d = new Dimension(100, 100) ;    //Width X Height
	//	
//		driver.manage().window().setSize(d);        //need to pass the above dimension class object always
			
//		setSize() ==> In this method we need to pass the object of Dimension Class
//		and while creating the object of Dimesion class we need to pass two int values into
//		its constructor( Width and Height)
			
		//to set the position of browser
		
//		Point p = new Point(200, 200);
//		driver.manage().window().setPosition(p);
		
		
		
//		driver.manage().window().minimize();
		
		
		
		//maximize method synatx
//		driver.maximize();         // WebDriver has no maximize method
//		driver.manage().window().maximize();   //method chaining
		
//		driver --> WebDriver refVaribale
		
//		Options o = driver.manage();   //method of WebDriver and its returning "Options" Interface
	//	
//		Window w = o.window();         //method of Options Int and returning Winodw interface
	//	
//		w.maximize();                //method is of Window int
		
		
//		driver.manage().window().maximize(); 
//		
//		
//		Options o = driver.manage();
//		Window w = o.window();
//		w.maximize();
//		
			
			
		}

	    
	  }
	

