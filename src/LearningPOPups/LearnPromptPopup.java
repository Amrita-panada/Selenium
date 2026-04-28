package LearningPOPups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("siba");
		Thread.sleep(1000);
		 a.accept();
		Thread.sleep(1000);
//		a.dismiss();
		 
		 System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());
		 
	}

}
