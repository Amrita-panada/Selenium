package LearnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(200);
		
		WebElement Login=driver.findElement(By.xpath("//a[@href='/login']"));
		
		Login.click();
	
		Thread.sleep(200);
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='Email']"));
		
		Email.sendKeys("amrita@gmail.com");
		
		Thread.sleep(200);
		
		WebElement pw=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		pw.sendKeys("123");
		
		Thread.sleep(200);
		
		WebElement forget_pw=driver.findElement(By.xpath("//a[@href=\"/passwordrecovery\"]"));
		
		forget_pw.click();
		
		WebElement book=driver.findElement(By.xpath("//a[@href='/books']"));
		
		WebElement poll=driver.findElement(By.xpath("//input[@name='pollanswers-1']"));
		
		WebElement cart=driver.findElement(By.xpath("//span[@class='cart-label']"));
		
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement fly=driver.findElement(By.xpath("//div[@id='flyout-cart']"));

	}

}
