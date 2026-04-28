package Syncronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//ExplecitWait create
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		
		//explecitWait use
		wait.until(ExpectedConditions.urlContains("dashboard"));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
