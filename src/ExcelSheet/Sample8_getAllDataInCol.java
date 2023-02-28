package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sha256WithSM2;

public class Sample8_getAllDataInCol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex = Sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			String value = Sh.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value);
		}
		
		
	}
	
}
