package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		 Properties p = new Properties();
		 p.load(fis);
		 String url=p.getProperty("url2");
		 FileInputStream fis2=new FileInputStream("./data/Book1.xlsx");
		 Workbook wb = WorkbookFactory.create(fis2);
		
		 
		 for (int i = 0; i < 7; i++) {
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			 driver.get(url);
			 String name=wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			 String password=wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
				//System.out.println(name);
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(name);
				//System.out.println(password);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(1000);
				
				if (driver.getCurrentUrl().contains("inventory")) {
					wb.getSheet("Sheet2").getRow(i).createCell(2).setCellValue("pass");
					Thread.sleep(1000);	
				} else {
					wb.getSheet("Sheet2").getRow(i).createCell(2).setCellValue("fail");
					Thread.sleep(1000);	
				}
				
				FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
				wb.write(fos);
				
				 driver.quit();
			}
				
		}
		
}
