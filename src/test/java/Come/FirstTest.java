package Come;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
// import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import ObjectRepo.FirstObject;

public class FirstTest extends base {
	public WebDriver driver;
	
	
	@Test (timeOut=4000)
	public void invalid() throws IOException {
		driver=startDriver();
		driver.get(prop.getProperty("urlfb"));
		FirstObject j=new FirstObject(driver);
		j.username().sendKeys("shruti@gmail.com");
		j.password().sendKeys("asddfd");
		j.clickk().click();
		driver.close();
		}
	
	@Test
	public void screenShot() throws IOException {
		driver=startDriver();
		driver.get(prop.getProperty("urlfb"));
		TakesScreenshot js=(TakesScreenshot)driver;
		File src=js.getScreenshotAs(OutputType.FILE);
		String dest="D:\\screenshot\\Screen.png";
		FileUtils.copyFile(src, new File(dest));
		driver.close();
		}
	
	@Test
	public void cookies() throws IOException {
		driver=startDriver();
		driver.get(prop.getProperty("urlfb"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.close();
		}
	
	@Parameters({"url1"})
	@Test
	
	public void jui(String a) {
		System.out.println(a);
		
	}
	
	
/*	@Test
	public void certi() {
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		driver=new ChromeDriver(c);
		}
		*/
	
	/*@Test
	public void tablee() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement table=driver.findElement(By.cssSelector("div[class='left-align']"));
		FirstObject e=new FirstObject(driver);
//int count=e.tabblee().size();
		for(int i=0;i<count;i++) {
			String a=e.tabblee().get(i).getText();
			System.out.println(a);
		}
		*/
		
		
		
		
		
		
		
		
	}
	
	
	
	
	


