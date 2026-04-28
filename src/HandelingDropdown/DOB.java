package HandelingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://x.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		//month
		WebElement month=driver.findElement(By.xpath("//span[text()='Month']/../../select"));
		Select s=new Select(month);
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByValue("8");
		Thread.sleep(2000);
		s.selectByVisibleText("November");
		
		//day
		WebElement day=driver.findElement(By.xpath("//span[text()='Day']/../../select"));
		Select s2=new Select(day);
		s2.selectByIndex(6);
		Thread.sleep(2000);
		s2.selectByValue("8");
		Thread.sleep(2000);
		s2.selectByVisibleText("6");
		
		WebElement year=driver.findElement(By.xpath("//span[text()='Year']/../../select"));
		Select s3=new Select(year);
		s3.selectByIndex(6);
		Thread.sleep(2000);
		s3.selectByValue("2008");
		Thread.sleep(2000);
		s3.selectByVisibleText("2001");
		
	}

}
