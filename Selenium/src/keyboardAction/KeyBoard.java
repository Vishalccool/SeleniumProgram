package keyboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys("A").perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.ESCAPE).perform();
//		
//		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
//		
//		String value = result.getText();
//		System.out.println(value);
		
	
		//Combine Keys
		
		
		driver.get("https://text-compare.com/");
		
		WebElement textBox1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
		
		textBox1.sendKeys("Hiii. My name is Rahul");
		
		Actions act = new Actions(driver);
		
		//CTRL + A   -select all
		act.keyDown(Keys.CONTROL);       //press CTRL key-down
		act.sendKeys("a");               //press a key
		act.keyUp(Keys.CONTROL);         //CTRL key release
		act.perform();
		
		
		//CTRL + C --copy
		act.keyDown(Keys.CONTROL);       //press CTRL key-down
		act.sendKeys("c");               //press a key
		act.keyUp(Keys.CONTROL);         //CTRL key release
		act.perform();
		
		
		
		WebElement textBox2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
		
		textBox2.click();
		
		

		//CTRL + V --paste
		act.keyDown(Keys.CONTROL);       //press CTRL key-down
		act.sendKeys("v");               //press a key
		act.keyUp(Keys.CONTROL);         //CTRL key release
		act.perform();
		
		
		
		
		String v1 = textBox1.getText();
		
		String v2 = textBox2.getText();
		
		if(v1.equals(v2))
		{
			System.out.println("copied");
		}
		else
		{
			System.out.println(" not copied");
		}
		
		
		//or
		
		
    String v3 = textBox1.getAttribute("value");
		
	String v4 = textBox2.getAttribute("value");
		
		if(v3.equals(v4))
		{
			System.out.println("copied1");
		}
		else
		{
			System.out.println(" not copied1");
		}	
	}

}





