package Handeling_mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseFuntions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement interactions=driver.findElement(By.linkText("Interactions"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(interactions).perform();
		WebElement dragAndDrop=driver.findElement(By.linkText("Drag and Drop"));
		Thread.sleep(1000);
		a.click(dragAndDrop).perform();
		WebElement staticLink=driver.findElement(By.linkText("Static"));
		a.click(staticLink).perform();
		WebElement angular=driver.findElement(By.id("angular"));
		WebElement droparea=driver.findElement(By.id("droparea"));
		WebElement node=driver.findElement(By.id("node"));
		a.dragAndDrop(angular, droparea).perform();
		//or
		a.clickAndHold(node).moveToElement(droparea).release().build().perform();
		
		
		

	}

}
