package HandelingDropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

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
		//create a new list
		HashSet<String>AlphaOrder=new HashSet<>();
		for ( WebElement ele: allOptions) {
			//System.out.println(ele.getText());
			AlphaOrder.add(ele.getText());
		}
		
		for (String string : AlphaOrder) {
			System.out.println(string);
		}
	}

}
