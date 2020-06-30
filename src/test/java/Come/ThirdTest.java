package Come;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ObjectRepo.ThirdObject;

public class ThirdTest extends base {
	
/*	@Test
	public void link() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement tabledriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table"));
		System.out.println(tabledriver.findElements(By.tagName("a")).size());
		WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		int count=columndriver.findElements(By.tagName("a")).size();
		
		for(int i=0;i<count;i++) {
			String next=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(next);
		}
		
		Set<String>ab=driver.getWindowHandles();
		Iterator<String> it=ab.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		}  */
	
	@Test
	public void kilo() throws IOException {
		driver=startDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		ThirdObject j=new ThirdObject(driver);
		j.Privacy().click();
		Set<String> ab=driver.getWindowHandles();
		Iterator<String> it=ab.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
	
	}	

}
