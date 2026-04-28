package LearningPOPups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class govtMuliPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pib.gov.in/indexd.aspx?reg=3&lang=1");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Ministry of Finance']")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		String pwind=driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		Thread.sleep(1000);
		for (String wind : allwind) {
			driver.switchTo().window(wind);
			if(!pwind.equals(wind)) {
				break;
			}
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		

	}

}
