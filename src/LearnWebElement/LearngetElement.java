package LearnWebElement;

import java.awt.Dimension;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearngetElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//p[ text()='UI Testing Concepts']"));
		ele.click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("name"));
		//getSize
		org.openqa.selenium.Dimension d1=name.getSize();
		int height1=d1.getHeight();
		int width1=d1.getWidth();
		//System.out.println(height1);
		//System.out.println(width1);
		
		//getLocator
		Point p1=name.getLocation();
		int X1=p1.getX();
		int Y1=p1.getY();
		//System.out.println(X1);
		//System.out.println(Y1);
		
		//2nd element
		WebElement email = driver.findElement(By.id("email"));

		// getSize
		org.openqa.selenium.Dimension d2 = email.getSize();
		int height2 = d2.getHeight();
		int width2 = d2.getWidth();

		// getLocation
		Point p2 = email.getLocation();
		int X2 = p2.getX();
		int Y2 = p2.getY();

		//System.out.println(X2);
		//System.out.println(Y2);

		if(height1 == height2 && width1 == width2 && X1 == X2 ) {
		    System.out.println("same");
		} else {
		    System.out.println("not same");
		}

	}

}
