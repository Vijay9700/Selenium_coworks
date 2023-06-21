package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		singleReadExcel("Login");
		multipleReadExcel("Login");
	}
	public static void singleReadExcel(String sheetname) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
	}
	public static String[][] multipleReadExcel(String sheetname) throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		
		int row=sheet.getPhysicalNumberOfRows();
		System.out.println("NUMBER OF ROWS..."+row);
		int column=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("NUMBER OF COLUMN..."+column);
		String[][] data=new String[row-1][column];
		//row loop
		for(int i=1;i<row;i++)
		{
			//column loop
			for(int j=0;j<column;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		//row loop
//		for(int i=0;i<row-1;i++)
//			{
//				//column loop
//				for(int j=0;j<column;j++)
//					{
//						System.out.println(data[i][j]);
//					}
//				}
		
		return data;
	}

}
