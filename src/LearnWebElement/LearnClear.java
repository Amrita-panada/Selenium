package LearnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		ele.click();
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("amrita123");
		Thread.sleep(2000);
		
		name.clear();
		Thread.sleep(2000);
		
		name.sendKeys("aman123");
		
		String Tname=ele.getTagName();
		
		String text=ele.getText();
		
		String url=ele.getAttribute("href");
		
		String size=ele.getCssValue("font-size");
		
		System.out.println(Tname);
		System.out.println(text);
		System.out.println(url);
		System.out.println(size);
	}

}
