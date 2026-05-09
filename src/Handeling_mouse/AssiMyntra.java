package Handeling_mouse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssiMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
				WebDriver driver=new ChromeDriver(opt);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.myntra.com/");
				WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
				WebElement Sneaker = driver.findElement(By.xpath("//a[text()='Sneakers']"));
				
				
				Actions a=new Actions(driver);
				a.moveToElement(men).perform();
				Thread.sleep(2000);
				a.click(Sneaker).perform();
				Thread.sleep(2000);
				
				WebElement scale = driver.findElement(By.xpath("//div[@id='rootRailThumbRight']"));
				a.clickAndHold(scale).moveByOffset(-50, 0).release().perform();
				Thread.sleep(2000);
				
				WebElement page=driver.findElement(By.xpath("//h2[contains(text(),'buy')]"));
				a.scrollToElement(page).perform();
				
//				List<WebElement> products = driver.findElements(
//					    By.xpath("//li[contains(@class,'product-base')]")
//					);
//
//					WebElement lastProduct = products.get(products.size() - 1);
//					lastProduct.click();
				
				
				WebElement lastProduct = driver.findElement(
					    By.xpath("(//li[contains(@class,'product-base')])[last()]")
					);

					Thread.sleep(2000);
					a.moveToElement(lastProduct).click().perform();
					
					
					String parent = driver.getWindowHandle();

					
					for (String win : driver.getWindowHandles()) {
					    if (!win.equals(parent)) {
					        driver.switchTo().window(win);
					        break;
					    }
					}

					
					WebElement pin = driver.findElement(By.xpath("//input[@placeholder='Enter pincode']"));
					pin.sendKeys("560001");

					
					driver.findElement(By.xpath("//input[@value='Check']")).click();

					
					Thread.sleep(3000);

					WebElement deliverydate = driver.findElement(
					    By.xpath("//h4[contains(text(),'Get it by')]")
					);
					
					Thread.sleep(2000);
					System.out.println(deliverydate.getText());
				
				
				
	}

}
