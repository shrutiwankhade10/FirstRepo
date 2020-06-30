package ObjectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstObject {
	public WebDriver driver;
	
	By un=By.xpath("//input[@type='email']");
	By pwd=By.xpath("//input[@type='password']");
	By clic=By.id("u_0_b");
	By tab=By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td[3]");
	
	
	public FirstObject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement username() {
		return driver.findElement(un);
	}
	
	public WebElement password() {
		return driver.findElement(pwd);
	}
	 public WebElement clickk() {
		 return driver.findElement(clic);
	 }
	  public List<WebElement> tabblee() {
		  return driver.findElements(tab);
	  }
	  
	 

}
