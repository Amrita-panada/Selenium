package HandelingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		ele.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		
		WebElement countryCode=driver.findElement(By.id("country_code"));
		Select s=new Select(countryCode);
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.id("phone")).sendKeys("7894847456");
		
		WebElement country=driver.findElement(By.id("select3"));
		Select s1=new Select(country);
		s1.selectByIndex(7);
		Thread.sleep(2000);
		
		WebElement state=driver.findElement(By.id("select5"));
		Select s2=new Select(state);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//label[text()='City']/../select"));
		Select s3=new Select(city);
		s3.selectByIndex(5);
		
		
		
		

	}

}
