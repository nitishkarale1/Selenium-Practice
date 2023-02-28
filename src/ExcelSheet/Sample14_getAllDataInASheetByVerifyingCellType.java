package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample14_getAllDataInASheetByVerifyingCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)
			{
				Cell clInfo = sh.getRow(i).getCell(j);
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
			System.out.println();
			
		}
		
		
	}
	
}
