package HandelingDropdown;
//write a script to print only duplicate element
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

public class Assignment7 {

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
		//create a new set
		HashSet<String>UniqueEle=new HashSet<>();
		HashSet<String>duplicates=new HashSet<>();
		
		for ( WebElement ele: allOptions) {
			//System.out.println(ele.getText());
			if(!UniqueEle.add(ele.getText())) {
				duplicates.add(ele.getText());
				
			}
		}
		
		System.out.println(duplicates);
		
		
	}

}
