package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.devtools.v107.dom.model.ShadowRootType;

public class Sample11_getDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
		Cell cellInfo = sh.getRow(2).getCell(2);
		CellType clType = cellInfo.getCellType();
		
		if(clType==CellType.STRING)
		{
			System.out.println(cellInfo.getStringCellValue());
		}
		
		else if(clType==CellType.NUMERIC)
		{
			System.out.println(cellInfo.getNumericCellValue());
		}
		
		else if(clType==CellType.BOOLEAN)
		{
			System.out.println(cellInfo.getBooleanCellValue());
		}
		
	}
	
}
