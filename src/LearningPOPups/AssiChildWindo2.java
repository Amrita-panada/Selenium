package LearningPOPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiChildWindo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//h2[text()='Watches']/following-sibling::button")).click();
		driver.findElement(By.xpath("//h2[text()='Laptop']/following-sibling::button")).click();
		
		Set<String> allwind = driver.getWindowHandles();
		for (String wind : allwind) {
			driver.switchTo().window(wind);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();

		}
		

	}

}
