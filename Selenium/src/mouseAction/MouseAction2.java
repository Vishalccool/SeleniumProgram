package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/buttons");

		WebElement Clickme = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions act  = new Actions(driver);
		act.click(Clickme).perform();
		System.out.println("Clickme");
		
		WebElement RightClickme = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	//	Actions act  = new Actions(driver);
		act.contextClick(RightClickme).perform();
		System.out.println("RightClickme");
		
		WebElement DoubleClickme = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		act.doubleClick(DoubleClickme).perform();
		System.out.println("DoubleClickme");
	}

}







