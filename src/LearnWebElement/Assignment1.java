package LearnWebElement;

import java.lang.annotation.ElementType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys("admin@email.com"+Keys.CONTROL+"A");
		driver.findElement(By.id("login_field")).sendKeys("admin@email.com"+Keys.CONTROL+"C");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("admin@email.com"+Keys.CONTROL+"V");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys(Keys.ENTER);

		String ElementType = driver.findElement(By.xpath("//div[contains(text(),'Incorrect username or password.')]")).getText();
		System.out.println("the error message is:"+ElementType);
		
		String colour=driver.findElement(By.xpath("//div[contains(text(),'Incorrect username or password.')]")).getCssValue("background-color");
		
		System.out.println("the error colour is:"+colour);
	}

}
