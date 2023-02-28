package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2_getNumericData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\selenium sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		double value = sh.getRow(2).getCell(2).getNumericCellValue();
		
		System.out.println(value);
		
		double value1=sh.getRow(2).getCell(4).getNumericCellValue();
		System.out.println(value1);
	}
	
}
