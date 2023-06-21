package generic_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_methods {
	public static double numericRead(String sheetname,int rownum,int columnnum) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		return sheet.getRow(rownum).getCell(columnnum).getNumericCellValue();
	}
	public static boolean booleanRead(String sheetname,int rownum,int columnnum) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		return sheet.getRow(rownum).getCell(columnnum).getBooleanCellValue();
	}

}
