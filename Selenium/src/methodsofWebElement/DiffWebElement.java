package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//WebElements Methods --> isDisplayed, isSelected, isEnabled

public class DiffWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//program1
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL opened successfully");
		Thread.sleep(3000);
		
		//Method of WebElement --> isDisplayed
				WebElement showElementButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
				showElementButton.click();
				
				
				WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
				boolean result = textBox.isDisplayed();
				System.out.println("textBox Status :"+result);
				textBox.sendKeys("hello velocity");
				
				WebElement hideElementButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
				hideElementButton.click();
				
				
				boolean result1 = textBox.isDisplayed();
				System.out.println("textBox Status :"+result1);



		//Method of WebElement --> isEnabled
				
				WebElement countryTextbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
				
				boolean result2 = countryTextbox.isEnabled();
				
				System.out.println(result2);
				
				if(result == true)
				{
					countryTextbox.sendKeys("hiiiiiiiiii");
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}

				

		//Method of WebElement --> isSelected
				
				WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
			
				
				boolean result3 = radioButton1.isSelected();
				System.out.println(result3);             //false
				
				if(result == false)
				{
					radioButton1.click();
				}

				boolean result4 = radioButton1.isSelected();
				System.out.println(result4);           //true

	}
}
		