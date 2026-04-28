package Basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Downloads/html2.html");
		
		WebElement ele=driver.findElement(By.tagName("a"));
		
		ele.click();
		
		driver.navigate().back();
		
		WebElement ele2=driver.findElement(By.id("google"));
		
		ele2.click();
		
	}

}
