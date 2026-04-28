package Syncronisation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LearnFluentWait{

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // FluentWait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))   // ✅ correct method
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);

        // Wait until URL contains dashboard
        wait.until(ExpectedConditions.urlContains("dashboard"));

        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.quit();
    }
}