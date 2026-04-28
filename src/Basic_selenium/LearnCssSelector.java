package Basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(200);
		
		WebElement Login=driver.findElement(By.cssSelector("a[href='/login']"));
		
		Login.click();
		
		Thread.sleep(200);
		
		WebElement Email=driver.findElement(By.cssSelector("input[id='Email']"));
		
		Email.sendKeys("amrita@gmail.com");
		
		Thread.sleep(200);
		
		WebElement pw=driver.findElement(By.cssSelector("input[id='Password']"));
		
		pw.sendKeys("123");
		
		Thread.sleep(200);
		
		WebElement forget_pw=driver.findElement(By.linkText("Forgot password?"));
		forget_pw.click();

	}

}
