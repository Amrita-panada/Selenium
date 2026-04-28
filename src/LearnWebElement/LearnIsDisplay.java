package LearnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement wishlist= driver.findElement(By.xpath("//div[text()='Wishlist']"));
		
		boolean res1=wishlist.isDisplayed();
		if(res1==true) {
			System.out.println("element is not displayed");
		}else {
			System.out.println("element is displayed");
		}
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		WebElement name=driver.findElement(By.id("name"));
		
		
		boolean res2=name.isEnabled();
		if(res2) {
			System.out.println("Element is enable");
		}else {
			System.out.println("Element is not enable");
		}
		
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//span[text()='Email']/../input"));
		email.click();
		Thread.sleep(2000);
		
		boolean res3=email.isSelected();
		if(!res3) {
			System.out.println("checkbox is not selected");
		}else {
			System.out.println("checkbox is selected");
		}
	}

}
