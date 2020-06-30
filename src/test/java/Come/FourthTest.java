package Come;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FourthTest extends base {
	
	@Test
	public void startt() throws IOException {
		driver=startDriver();
		
	}
	
	@Test(dependsOnMethods= {"startt"})
	public void drag() throws IOException {
		//driver=startDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		}
	
	@Test
	public void trail() throws IOException {
		driver=startDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.name("site-search"))).click().keyDown(Keys.SHIFT).sendKeys("adas").build().perform();
		
		a.moveToElement(driver.findElement(By.name("site-search"))).click().sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(driver.findElement(By.name("site-search"))).click().contextClick().build().perform();
		
		
		
		
		
	}

}
