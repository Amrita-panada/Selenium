package HandelingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/ASUS/Downloads/CricketTeam.html");
		Thread.sleep(2000);
		
		WebElement player=driver.findElement(By.id("PLAYERS"));
		Select s=new Select(player);Thread.sleep(2000);
		
		
		List<WebElement> allOptions=s.getOptions();
		Thread.sleep(2000);
		for(int i =0;i<allOptions.size();i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		for(int i =allOptions.size()-1;i>=0;i--) {
			s.deselectByIndex(i);
			Thread.sleep(2000);
		}
	}

}
