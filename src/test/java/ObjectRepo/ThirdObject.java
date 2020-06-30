package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdObject {
	public WebDriver driver;
	
	By pri=By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a");
	
	
	public ThirdObject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement Privacy() {
		  return driver.findElement(pri);
	  }

}
