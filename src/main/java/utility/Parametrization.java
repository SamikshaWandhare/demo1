package utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization
{
	public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file = new FileInputStream("D:\\Eclipse-workplace\\kiteZerodha\\src\\main\\resources\\TestData.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
}
	
	public static double getNamericData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream("D:\\Eclipse-workplace\\kiteZerodha\\src\\main\\resources\\TestData.xlsx");
		
		double value= WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		
		return value;
		}
	}


