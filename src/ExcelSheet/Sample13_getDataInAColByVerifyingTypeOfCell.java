package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample13_getDataInAColByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell clInfo = sh.getRow(i).getCell(2);
			CellType clType = clInfo.getCellType();
			
			if(clType==CellType.STRING)
			{
				System.out.println(clInfo.getStringCellValue());
			}
			
			else if(clType==CellType.NUMERIC)
			{
				System.out.println(clInfo.getNumericCellValue());
			}
			
			else if(clType==CellType.BOOLEAN)
			{
				System.out.println(clInfo.getBooleanCellValue());
			}
		}
		
	}
	
}
