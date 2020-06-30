package Come;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepo.SecondObject;

public class SecondTest extends base {
	public WebDriver driver;
	
	@Test
	public void Spice() throws IOException, InterruptedException {
		driver=startDriver();
		driver.get("https://www.spicejet.com/");
		SecondObject j=new SecondObject(driver);
		j.From().click();
		Thread.sleep(3000);
		j.kanpur().click();
		Thread.sleep(3000);
		j.To().click();
		Thread.sleep(3000);
		j.Mumbai().click();
		
		
		
	}
	
	
	

	
	

}
