package webTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//columns
		List<WebElement> columns = driver.findElements(By.xpath("//table//tbody//tr//th"));
		int noOfColumns = columns.size();
		System.out.println("number of columns are :-"+noOfColumns);
		
//		//cells
//		List<WebElement> cells = driver.findElements(By.xpath("//table//tbody//tr//td"));
//		int noOfCells = cells.size();
//		System.out.println("number of cells are :-"+noOfCells);
		
		//rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		int noOfRows = rows.size();
		System.out.println("number of rows are :-"+noOfRows);
		
		
		
		//whole table data print 
		
		for(int i=0;i<=noOfRows; i++)          //rows for loop
		{
			List<WebElement> cells = rows.get(i).findElements(By.xpath("//table//tbody//tr//td"));
			int noOfCells = cells.size();
			
			for(int j=0; j<=noOfCells;j++)
			{
				String value =cells.get(j).getText();
				System.out.println(value);
			} 
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
	}

}

