package ObjectRepo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondObject {
	public WebDriver driver;
	
	By from= By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By kanp=By.xpath("//a[@value='KNU']");
	By to=By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	By bom=By.xpath("//a[value='BOM'][2]");
	
	
	
	
	 
	public SecondObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement From() {
		return driver.findElement(from);
	}
	
	public WebElement kanpur() {
		return driver.findElement(kanp);
	}
	public WebElement To() {
		return driver.findElement(to);
	}
	public WebElement Mumbai() {
		return driver.findElement(bom);
	}
	
}
