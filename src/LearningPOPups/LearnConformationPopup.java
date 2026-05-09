package LearningPOPups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConformationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		 //a.accept();
		Thread.sleep(2000);
		a.dismiss();
		 
	}

}
