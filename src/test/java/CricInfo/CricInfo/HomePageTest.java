package CricInfo.CricInfo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PageObjects;


public class HomePageTest extends Testbase
{
	PageObjects p = new PageObjects(driver);
	
	int ODI_MATCHES = 463;
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	
	@Test
	public void cricinfo() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		
		driver.get("https://www.espncricinfo.com/");
		
		driver.findElement(By.xpath(p.Search_Bar)).click(); //clicking on the search Bar
		
		driver.findElement(By.xpath(p.Search_Text)).sendKeys("Sachin Tendulkar");
		
		driver.findElement(By.xpath(p.Search_Bar)).sendKeys(Keys.ENTER);//Hitting enter button 
		
		
		
		driver.findElement(By.xpath(p.name_Link)).click();
		
		if (driver.findElement(By.xpath(p.ODI_matches)).getText().equals(ODI_MATCHES)){
			
			System.out.println("scahin total ODI's played" + ODI_MATCHES);
		}
		else {
			System.out.println("ODI matches number doesn't match");
		}
	}
	
}
