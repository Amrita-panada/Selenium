package HandelingDropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8 {

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
		List<String>AlphaOrder=new ArrayList<>();
		for ( WebElement ele: allOptions) {
			// System.out.println(ele.getText());
			AlphaOrder.add(ele.getText());
		}
		Collections.sort(AlphaOrder);
		// give a player name
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		for (String string : AlphaOrder) {
			if(AlphaOrder.contains(name)){
				System.out.println("player is present");
			}
			else {
				System.out.println("player is not present");
			}
		}

	}

}
