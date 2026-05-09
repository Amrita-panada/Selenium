package Usejsexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraScroll {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Geo_Brand_India_BM_TROAS_SOK_New_Search_Brand_AI_Max_AB_Test&gad_source=1&gad_campaignid=23797101965&gbraid=0AAAAADoxBh7dHusvqH5MHnSXPYOPmj2aF&gclid=CjwKCAjwntHPBhAaEiwA_Xp6RrzDb44Q2-dfF_M6Jzb_dnfJ4-Qgb_xwPNAA7MYMZhsH2WezuFQ2ZBoC-ScQAvD_BwE");
		    Thread.sleep(1000);
		   WebElement ele = driver.findElement(By.xpath("//strong[text()='HISTORY OF MYNTRA']"));
		    Point axis=ele.getLocation();
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("window.scrollTo"+axis);
		}


}
