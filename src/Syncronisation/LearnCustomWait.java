package Syncronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCustomWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		for(int i=0;i<1000;i++) {
			try {
				driver.findElement(By.name("Username")).sendKeys("admin");
				break;
			}
			catch(Exception e) {
				System.out.println(i);
			}
		}

	}

}
