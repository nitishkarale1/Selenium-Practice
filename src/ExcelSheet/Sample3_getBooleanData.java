package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3_getBooleanData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\selenium sheet.xlsx");
		boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getBooleanCellValue();
		
		System.out.println(value);
	}
	
}
