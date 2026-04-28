package Assignments;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlliphoneWithPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 14 5g"+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> AllSugg = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		List<WebElement> AllPrice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div/div"));
		
		Thread.sleep(2000);
		int count=AllSugg.size();
		System.out.println("numbers of suggetions we got:"+count);
		
		for(int i=0;i<count;i++) {
			WebElement ele=AllSugg.get(i);
			String name=ele.getText();
			
			WebElement p=AllPrice.get(i);
			String price=p.getText();
			
			
			System.out.println(i+"."+name+":"+price);
		}

	}

}
