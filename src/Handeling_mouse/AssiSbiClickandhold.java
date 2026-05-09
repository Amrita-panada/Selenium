package Handeling_mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssiSbiClickandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinessLogin");
		driver.findElement(By.xpath("//div[@id='undefined']/div/a/descendant::span")).click();
		driver.findElement(By.id("userName")).sendKeys("amrita");
		driver.findElement(By.id("password")).sendKeys("amrita");
		WebElement eye = driver.findElement(By.xpath("//img[@loading='lazy']"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.click(eye).pause(1000).clickAndHold(eye).perform();
		Thread.sleep(1000);
		
		
	}

}
