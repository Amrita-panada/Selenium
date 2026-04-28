package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//p[ text()='UI Testing Concepts']"));
		ele.click();
		Thread.sleep(2000);
		
		WebElement table=driver.findElement(By.xpath("//section[text()='Web Table']"));
		table.click();
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));

		for(int i = 0; i < rows.size(); i++) {

		    List<WebElement> cols = rows.get(i).findElements(By.xpath("th|td"));

		    for(int j = 0; j < cols.size(); j++) {
		        String data = cols.get(j).getText();
		        System.out.print(data + "\t"); 
		    }

		    System.out.println(); 
		}
		

	}

}
