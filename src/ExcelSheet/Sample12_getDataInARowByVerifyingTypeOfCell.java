package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample12_getDataInARowByVerifyingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
		
		int lastCellIndex = sh.getRow(3).getLastCellNum()-1;
		
		for(int i=0; i<=lastCellIndex; i++)
		{
			Cell clInfo = sh.getRow(3).getCell(i);
			CellType clType = clInfo.getCellType();
			
			if(clType==CellType.STRING)
			{
				System.out.print(clInfo.getStringCellValue()+"  ");
			}
			
			else if(clType==CellType.NUMERIC)
			{
				System.out.print(clInfo.getNumericCellValue()+"  ");
			}
			
			else if(clType==CellType.BOOLEAN)
			{
				System.out.print(clInfo.getBooleanCellValue()+"  ");
			}
			
		}
		
		
	}
	
}
