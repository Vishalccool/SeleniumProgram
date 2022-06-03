package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IFrame2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	    WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	
	    driver.switchTo().frame(frame1);  //switching to frame1 of mainpage
	    WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
	    driver.switchTo().frame(frame3);
	
        WebElement innerframecheakbox  = driver.findElement(By.xpath("//input[@id='a']"));
        innerframecheakbox.click();


        driver.switchTo().defaultContent();
        System.out.println("moved to baby cat");
        Thread.sleep(30);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));  //this is xpath of frame in which required dropdown is present
		
		driver.switchTo().frame(frame2);  //switching of frame
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		
		Select s = new Select(dropDown);	
		s.selectByValue("babycat");
		dropDown.click();
	
		System.out.println("Endofprogram");
		
	}

}

