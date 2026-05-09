package Frames;


import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFramesHandle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/all%20Text%20data/page1.html");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("virat");
        driver.switchTo().frame("frame1");
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("virat@.com");
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Anushka");
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("//input[@id='phNo']")).sendKeys("7894554307");
        
        WebElement frameAddress=driver.findElement(By.xpath("//iframe[@id='frame_2']"));
        driver.switchTo().frame(frameAddress);
        driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("Anushka");
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anushka");
    }
}
