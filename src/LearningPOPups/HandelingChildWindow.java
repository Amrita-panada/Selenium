package LearningPOPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		String parentWid=driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
