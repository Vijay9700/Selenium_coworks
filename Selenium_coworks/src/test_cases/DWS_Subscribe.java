package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;

public class DWS_Subscribe extends Base_Test {
//	@DataProvider(name="Subscribe")
//	public Object[][] SubscribeData() {
//		Object[][] data=new Object[1][1];
//		data[0][0]="vijay@gmail.com";
//		return data;
//	}
	@Test(dataProvider = "Subscribe")
	public void subscribe(String email) {
		
		//identify subscribe bar and enter data
		driver.findElement(By.id("newsletter-email")).sendKeys(email);
		//click on subscribe button
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		
	}

}
