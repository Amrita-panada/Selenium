package LearningPOPups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiChildWindScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("text:");
		String text=sc.next();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		
		Set<String> allwind = driver.getWindowHandles();
		for (String wind : allwind) {
			driver.switchTo().window(wind);
			String title = driver.getTitle();
			if(title.contains(text)) {
				driver.close();
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		
	}

}
