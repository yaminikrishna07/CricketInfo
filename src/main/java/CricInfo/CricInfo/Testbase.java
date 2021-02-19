package CricInfo.CricInfo;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;


	
	
	
	public static void initialization(){
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamini\\Downloads\\Compressed\\chromedriver.exe");	
			driver = new ChromeDriver(); 
//			

}
}