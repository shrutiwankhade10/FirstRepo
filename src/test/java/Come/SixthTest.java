package Come;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixthTest extends base {
	
	@Test(dataProvider="getdata")
	public void huio(String un,String pwd) throws IOException, InterruptedException {
		driver=startDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='u_0_4']")).click();
		}
	
	@DataProvider
	public Object[][] getdata() {
		Object [][] data=new Object[3][2];
		data[0][0]="hjadgj@gmail.com";
		data[0][1]="mdls";
		data[1][0]="lasmd@gmail.com";
		data[1][1]="pska";
		data[2][0]="lashjhk@gmail.com";
		data[2][1]="agdjsadh";
		return data;
		
		
		
	}
	

}
