package diffWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1
{
public static void main(String[] args)
{		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.google.com");
	
	String Title = driver.getTitle();     //return type of getTitle() type is String
	System.out.println(Title);
		
	String expTitle="Google";
		
	if(Title.equals(expTitle)) 
	{
		System.out.println("navigated to correct webpage");
	}
	else
	{
		System.out.println("navigated to wrong webpage");
	}
	
	}
		
}