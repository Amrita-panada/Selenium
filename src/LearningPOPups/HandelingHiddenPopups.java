package LearningPOPups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingHiddenPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//input[@id='customerName']")).sendKeys("amrita");
		

	}

}
