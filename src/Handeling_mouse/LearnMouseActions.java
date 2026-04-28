package Handeling_mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Button']")).click();
		driver.findElement(By.xpath("//*[text()='Right Click']")).click();
		
		WebElement target=driver.findElement(By.xpath("//button[text()='Right Click']"));
	      Actions a = new Actions(driver);

	      a.contextClick(target).perform();
	      
	      driver.findElement(By.xpath("//div[text()='Yes']")).click();
	     // driver.findElement(By.xpath("//*[text()='You selected \"Yes\"']")).getText();
	       
	       System.out.println( driver.findElement(By.xpath("//*[text()='You selected \"Yes\"']")).getText());
	      
	        
	        
	}

}
