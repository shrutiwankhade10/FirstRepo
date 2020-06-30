package Come;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FifthTest extends base {
	public WebDriver driver;
	
	
	@Test(groups= {"alert"})
	public void alertone() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("shruti");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		//driver.close();
		}
	
	@Test(groups= {"alert"})
	public void alerttwo() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("shruti");
		//Assert.assertEquals("shruti", driver.findElement(By.id("name")));
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		//driver.close();
		}


	
	@Test
	public void fotrt() throws IOException {
		driver=startDriver();
		driver.get("https://www.yatra.com/domestic-airlines/air-india-airlines.html");
		driver.findElement(By.id("BE_flight_origin_city")).click();
		WebElement s= driver.findElement(By.id("BE_flight_origin_city"));
		s.clear();
		s.sendKeys("BOM");
		WebElement d=driver.findElement(By.id("BE_flight_destination_city"));
		d.clear();
		d.click();
		d.sendKeys("DEL");
		
		
	}
	
	@Test
	public void dynamicdwn() throws IOException, InterruptedException {
		driver=startDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Ajmer (KQH)']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Mumbai (BOM)'][contains(text(),'Mumbai (BOM)')]")).click();
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-week-end')]//a[@class='ui-state-default'][contains(text(),'20')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement j=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		j.click();
		j.sendKeys(Keys.ARROW_DOWN);
		j.sendKeys(Keys.ENTER);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(1);
	
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}
	@AfterMethod
	public void endikj() {
		driver.close();
		
	}
	
	
	
	
	
	
	
}
