package LearningPOPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopStackChildWind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/products_page/51");
		driver.findElement(By.xpath("//button[@id='compare']")).click();
		
		Set<String> allwind = driver.getWindowHandles();
		for (String wind : allwind) {
			driver.switchTo().window(wind);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();

		}
	}

}
