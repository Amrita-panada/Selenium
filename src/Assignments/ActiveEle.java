package Assignments;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://google.com/");
				
				WebElement searchbox=driver.switchTo().activeElement();
				searchbox.sendKeys("Qspider");
				
				@Nullable
				String text = searchbox.getAttribute("value");
				
	}

}
