package Basic_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		WebDriver driver=new ChromeDriver();
		//it is used to lanch a browser,address of the browser will be stored in driver variable
		
		driver.get("https://www.facebook.com/");
		//get(String url) is used to triger the main url of the application
		//url should contain protocol,application name,domain name
		
		String titel=driver.getTitle();
		//get titel is used to fetch the current titel of the webpage
		System.out.println(titel);
		
		
		String url=driver.getCurrentUrl();
		
		driver.close();
	}

}
