package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessGeneric {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GenericClass G=new GenericClass();
		String url=G.readDataFromProperty("url");
		String un=G.readDataFromProperty("un");
		String pwd=G.readDataFromProperty("pwd");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='log in']")).click();
		
		String data1=G.readDataFromexcel("sheet1", 0, 0);
		System.out.println(data1);
		
		//G.writedataIntoexcel("sheet2", 1, 1,"good");
		
	}

}
