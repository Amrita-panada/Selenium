package LearnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(200);
		
		WebElement ele1=driver.findElement(By.xpath("//div[text()='3,00,000+']"));
		WebElement ele2=driver.findElement(By.xpath("//div[text()=3 billion+']"));
		WebElement ele4=driver.findElement(By.xpath("//div[text()='What’s waiting for you ']"));
		WebElement ele5=driver.findElement(By.xpath("//div[text()=Better food for   more people ']"));
		WebElement ele6=driver.findElement(By.xpath("//div[text()='Our app is packed with features that enable you to experience food delivery like never before']"));
		WebElement ele7=driver.findElement(By.xpath("//div[text='...and a lot more']"));
		WebElement ele8=driver.findElement(By.xpath("//div[text()='India/’s Top Savings Program for Food Lovers']"));
		WebElement ele9=driver.findElement(By.xpath("//div[text()='At all restaurants within 7 km']"));
		WebElement ele10=driver.findElement(By.xpath("//div[text()='At 20,000+ partner restaurants']"));
		WebElement ele11=driver.findElement(By.xpath("//div[text()='POWERING INDIA’S CHANGING LIFESTYLE]"));
		
	}

}
