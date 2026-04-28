package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSugg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> AllSugg = driver.findElements(By.xpath("//div[text()='iphone']"));
		Thread.sleep(2000);
		
		for (WebElement sugg : AllSugg) {
			String text=sugg.getText();
			System.out.println(text);
			
		}
	}

}
