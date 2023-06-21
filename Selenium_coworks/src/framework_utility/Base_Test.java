package framework_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Base_Test {
	public WebDriver driver;
	@Parameters("url")
	@BeforeClass
	public void browser_setup(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	//register data
	@DataProvider(name="TestData")
	public Object[][] testData() {
		Object[][] data=new Object[2][5];
		data[0][0]="vijay";
		data[0][1]="ganesan";
		data[0][2]="vijay@gmail.com";
		data[0][3]="12345";
		data[0][4]="12345";
		//2nd iteration
		data[1][0]="Dhoni";
		data[1][1]="MS";
		data[1][2]="dhoni@gmail.com";
		data[1][3]="12345";
		data[1][4]="12345";
		return data;
	}
	@DataProvider(name="Subscribe")
	public Object[][] SubscribeData() {
		Object[][] data=new Object[1][1];
		data[0][0]="vijay@gmail.com";
		return data;
	}
	
	@DataProvider(name="Search")
	public Object[][] product()
	{
		Object[][] data=new Object[2][1];
		data[0][0]="computers";
		data[1][0]="mobile";
		return data;
	}
	@AfterClass
	public void browser_teardown() {
		driver.quit();
	}

}
