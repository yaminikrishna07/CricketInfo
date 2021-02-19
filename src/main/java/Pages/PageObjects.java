package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjects {
	
	
	

	public PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}



	public final static String Search_Bar = "//div[@id='navbarSupportedContent']/ul[2]//li[@class='search']";

	public final static String Search_Text = "//input[@name='search']";
	
	public final static String name_Link = "//a[contains(text(),'Tendulkar, SR’)]";
	
	public final static String ODI_matches = "(//table[@class='engineTable'])[1]//tr[@class='data1'][2]/td[2]";
}
