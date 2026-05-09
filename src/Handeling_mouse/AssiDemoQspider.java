package Handeling_mouse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssiDemoQspider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[ text()='UI Testing Concepts']")).click(); 
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click(); 
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
//		 WebElement  MobCharger= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
//		 WebElement LapCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//		 WebElement MobCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
//		 WebElement LapCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		 WebElement MobAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		  WebElement LapAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		  
		  List<WebElement> items = driver.findElements(
				    By.xpath("//div[@draggable='true']")
				);

		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		
//		a.dragAndDrop(MobCover, MobAccessories).perform();
//		Thread.sleep(2000);
//		a.dragAndDrop(LapCover, LapAccessories).perform();
//		Thread.sleep(2000);
//		a.dragAndDrop(MobCharger, MobAccessories).perform();
//		Thread.sleep(2000);
//		a.dragAndDrop(LapCharger, LapAccessories).perform();
		
		for (WebElement item : items) {
			String ele=item.getText();
			
			if(ele.contains("Mobile")) {
				a.dragAndDrop(item, MobAccessories).perform();
				Thread.sleep(2000);
			}else {
				a.dragAndDrop(item, LapAccessories).perform();
				Thread.sleep(2000);
			}
		}
		
			

	}

}
