package HandelingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAllMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/ASUS/Downloads/CricketTeam.html");
		Thread.sleep(2000);
		
		WebElement player=driver.findElement(By.id("PLAYERS"));
		Select s=new Select(player);Thread.sleep(2000);
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByValue("8");
		Thread.sleep(2000);
		s.selectByVisibleText("Virat");
		Thread.sleep(2000);
		s.selectByContainsVisibleText("R");
		
//		s.deselectByIndex(6);
//		Thread.sleep(2000);
//		s.deselectByValue("8");
//		Thread.sleep(2000);
//		s.deselectByVisibleText("Virat");
//		Thread.sleep(2000);
//		s.deSelectByContainsVisibleText("R");
		//s.deselectAll();
//		
//		WebElement firstopt=s.getFirstSelectedOption();
//		System.out.println(firstopt.getText());
		
		List<WebElement> allSElected = s.getAllSelectedOptions();
		for (WebElement webElement : allSElected) {
			System.out.println(webElement.getText());
		}
		
		List<WebElement> allOptions=s.getOptions();
		for (WebElement webElement1 : allOptions) {
			System.out.println(webElement1.getText());
			
		}
		
	}

}
