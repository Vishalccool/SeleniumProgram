package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetLoopCondition {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, Exception {
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
		XSSFCell cell1 = row.getCell(0);//cell for password

		// value read for string

//		String userName = cell.getStringCellValue();
//		System.out.println(userName);

//		String password = cell1.getStringCellValue();
//	    System.out.println(password);

		// value read for Numeric value
//	    double value = cell.getNumericCellValue(); // when we use numeric value then use double
//	    System.out.println(value);

	
		// method of sheet and rows
		int rows = sheet.getLastRowNum();
		System.out.println("total rows "+rows);
		
		
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println("total columns "+columns);
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow Row = sheet.getRow(r);
			for (int c=0; c<columns; c++)
			{
				XSSFCell Cell = Row.getCell(c);
				double userName = Cell.getNumericCellValue();
				System.out.println(userName);
			}
			
	    }

	}
}