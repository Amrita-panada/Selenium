package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic class,which contains generic methods for reading data from property and 
 * excel file and writing the data into excel file
 */
public class GenericClass {
	/**
	 * It is a generic method which is used to read the data from property file
	 * @param key
	 * @return it will return String value based on mentioned key name
	 * @throws IOException
	 */
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	
	/**
	 * It is a generic method which is used to read the data from Excel file
	 * @param SheetName
	 * @param rowindex
	 * @param cellIndex
	 * @return it will return String value based on mentioned SheetName, rowindex, cellIndex
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromexcel(String SheetName,int rowindex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(SheetName).getRow(rowindex).getCell(cellIndex).getStringCellValue();
		return data;
	}
	
	/**
	 * It is a generic method which is used to write the data in Excel file
	 * @param sheetName
	 * @param rowindex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writedataIntoexcel(String sheetName,int rowindex,int cellIndex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowindex).createCell(cellIndex).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
		wb.write(fos);
	}
}
