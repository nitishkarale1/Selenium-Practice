package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample7_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=LastCellIndex; i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value+" ");
		}
		
	}
	
}
