package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetProgram
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//file path
		String path = "D:\\selenium installation\\saucedemo Excel file.xlsx";
		
		//file read
		FileInputStream file = new FileInputStream(path);
		
		//workbook read
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//sheet read
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//row read
		XSSFRow row = sheet.getRow(0);//row for username
		XSSFRow row1 = sheet.getRow(0);//row for password
		
		//cell read
		
		XSSFCell cell = row.getCell(0);//cell for username
		XSSFCell cell1 = row.getCell(1);//cell for password
		
		//value read
		
		String userName = cell.getStringCellValue();
		System.out.println(userName);
		
		String password = cell1.getStringCellValue();
		System.out.println(password);
		
		
		

	//Create URL opening code and paste the above value into username and password fields and open homepage		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL opened successfully");
		Thread.sleep(3000); 
	
		
		WebElement userName1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		userName1.sendKeys(userName);
		System.out.println("UserName Entered successfully");
		Thread.sleep(3000);
		
		WebElement password1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		password1.sendKeys(password);
		System.out.println("Password Entered successfully");
	    Thread.sleep(3000);
	    
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginButton.click();
		System.out.println("clicked on the login button successfully");
		
		
	}

}