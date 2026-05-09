package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[text()='Frames']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='iframes']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Multiple iframe']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amrita@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("amrita06");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='confirm-password']")).sendKeys("amrita06");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("amrita");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("amrita06");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	    
	}

}
