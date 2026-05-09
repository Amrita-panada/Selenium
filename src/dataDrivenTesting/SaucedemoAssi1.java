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

public class SaucedemoAssi1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		 Properties p = new Properties();
		 p.load(fis);
		 String url=p.getProperty("url2");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get(url);
		 driver.findElement(By.xpath("//input[@id='user-name']"));
		 driver.findElement(By.xpath("//input[@id='password']"));
		 
		 FileInputStream fis2=new FileInputStream("./data/Book1.xlsx");
		 Workbook wb = WorkbookFactory.create(fis2);
		
		 //want to check each name and password pair click on login if it is success then write pass on the excel sheet2
		 for(int i=1;i<7;i++) {
			
			
				String name=wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
				//System.out.println(name);
				
				
				String password=wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
				//System.out.println(password);
				
				
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(name);
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(2000);
				
				if(driver.getCurrentUrl().contains("inventory")) {
					System.out.println(driver.getCurrentUrl());
					//driver.switchTo().alert().accept();
				
				Thread.sleep(2000);	
				wb.getSheet("Sheet2").getRow(i).createCell(2).setCellValue("pass");
				Thread.sleep(2000);	
				
				Thread.sleep(2000);	
				driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
				
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
				}else {
					wb.getSheet("Sheet2").getRow(i).createCell(2).setCellValue("fail");
					
					
					driver.findElement(By.id("user-name")).clear();
			        driver.findElement(By.id("password")).clear(); 
					
				}
				
				
			}FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
			wb.write(fos);
		

	}

}
