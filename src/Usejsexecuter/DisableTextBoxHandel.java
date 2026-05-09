package Usejsexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextBoxHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/all%20Text%20data/DisableTextboxHandle.html");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("username")).sendKeys("amrita");
	    
	    //HANDLE DISABLE TEXTBOX
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "document.getElementById('password').value='Admin@123';"
	    );

	}

}
