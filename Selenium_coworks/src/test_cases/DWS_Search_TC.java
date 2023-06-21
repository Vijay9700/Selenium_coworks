package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;

public class DWS_Search_TC extends Base_Test {
//	@DataProvider(name="Search")
//	public void product()
//	{
//		Object[][] data=new Object[2][1];
//		data[0][0]="computers";
//		data[0][1]="mobile";
//	}
	@Test(dataProvider = "Search")
	public void search(String item) {
		
		//identify search box and enter computer
		driver.findElement(By.id("small-searchterms")).sendKeys(item);
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
