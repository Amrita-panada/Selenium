package LearnWebElements;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> allEle= driver.findElements(By.tagName("a"));
		int count=allEle.size();
		 System.out.println("total number of links:"+count);
		 
//		for(int i=0;i<count;i++) {
//			WebElement ele=allEle.get(i);
//			String text=ele.getText();
//			System.out.println(text);
//		}
		 
		 for (WebElement webElement : allEle) {
			System.out.println(webElement.getText());
		}
		
		//getAttribute
		for(int i=0;i<count;i++) {
			WebElement ele=allEle.get(i);
			String link=ele.getAttribute("href");
			System.out.println(link);
		}
		driver.quit();
	}

}
