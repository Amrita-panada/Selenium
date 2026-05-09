package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//to get data of column 1
		for(int i=0;i<12;i++) {
			String data=wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(data);
		}
		
		//to get data of row 2
		for(int j=0;j<12;j++) {
			String data=wb.getSheet("Sheet1").getRow(1).getCell(j).getStringCellValue();
			System.out.println(data);
		}
		
		//to get data of total excel
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				String data=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
			
		}

	}

}
