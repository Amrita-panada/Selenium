package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//shortcut
		//String data=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
//		Sheet s=wb.getSheet("Sheet1");
//		Row r=s.getRow(1);
//		Cell c=r.getCell(1);
//		String data=c.getStringCellValue();
//		//print 
//		System.out.println(data);
//		
//		//another data note:if data is in numaric value then make it as string otherwise it will give error
		
//		String property=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
//		System.out.println(property);
		
		//update data   note:if excel file already open then it will give error
		wb.getSheet("Sheet1").getRow(1).createCell(1).setCellValue("samsung");
		FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
		wb.write(fos);
	}

}
