package Screenshot;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook 
{
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("URL opened successfully");
		Thread.sleep(1000); 
		

	    WebElement Createnewaccount = driver.findElement(By.xpath("//a[@rel='async']"));
		Createnewaccount.click();
		System.out.println("Click on Create new account");
		Thread.sleep(2000);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@tabindex='0']"));
		Firstname.sendKeys("Vishal");
		System.out.println("Type Firstname");
		Thread.sleep(2000);
		
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("chavan");
		System.out.println("Type Surname");
		Thread.sleep(1000);
		
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobilenumber.sendKeys("9011159154");
		System.out.println("Type Mobilenumber");
		Thread.sleep(1000);
		
		WebElement Newpassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Newpassword.sendKeys("9011159154");
		System.out.println("Type Newpassword");
		Thread.sleep(1000);
		
		  //Concept of Dropdowns
		   WebElement dateofbirth = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		   dateofbirth.click();
		   Select s=new Select(dateofbirth);
		   s.selectByValue("28");
		   dateofbirth .click();
		   System.out.println("clicked on DOB successfully");
		   
		   WebElement monthofbirth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		   monthofbirth.click();
		   Select s1=new Select(monthofbirth);
		   s1.selectByVisibleText("May");
		   monthofbirth.click();
		   System.out.println("clicked on MOB successfully");
		   
		   WebElement yearofbirth = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		   yearofbirth.click();
		   Select s2=new Select(yearofbirth);
		   s2.selectByValue("1990");
		   yearofbirth.click();
		   System.out.println("clicked on YOB successfully");
		   
//		   WebElement genderbox = driver.findElement(By.xpath("//label[@class='_58mt'][1]"));
//		   boolean output=genderbox.isSelected();
//		   System.out.println(output);
//		   if(output==false)
//		   {
//			   genderbox.click();
//		   }
//		   
		  
//		   WebElement signupbutton = driver.findElement(By.xpath("//button[@name='websubmit']"));
//		   signupbutton.click();
//       
			WebElement GenderCustom = driver.findElement(By.xpath("//input[@value='-1']"));
			boolean result3 = GenderCustom.isSelected();
			System.out.println(result3);             //false
			
			if(result3 == false)
			{
				GenderCustom.click();
			}

			boolean result4 = GenderCustom.isSelected();
			System.out.println(result4);           //true
		 
	}
}	