package LearnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("amrita123"+Keys.CONTROL+"AC");
		driver.findElement(By.name("email")).sendKeys("amrita123@.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("/button[text()='Register']")).submit();
		//driver.findElement(By.xpath("//section[text()='check box']")).submit();
		
	}

}
