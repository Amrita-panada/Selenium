package LearningPOPups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ADD);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		//	r.keyPress(KeyEvent.VK_TAB);
		//	r.keyPress(KeyEvent.VK_TAB);
//		//r.keyPress(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_1);
//		r.keyPress(KeyEvent.VK_ADD);
//		r.keyPress(KeyEvent.VK_2);
	}

}
