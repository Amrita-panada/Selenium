package Assignments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTitel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.instagram.com/?hl=en");
	
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/?hl=en");
//		driver.navigate().forward();
//		driver.navigate().back();
		
		@Nullable
		String url = driver.getCurrentUrl();
		System.out.println(url);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		
		@Nullable
		String page = driver.getPageSource();
		System.out.println(page);
		
		//driver.quit();
		//driver.close();
		
	}

}
