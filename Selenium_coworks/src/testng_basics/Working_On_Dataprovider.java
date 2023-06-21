package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;

public class Working_On_Dataprovider extends Base_Test {
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
	@Test(dataProvider = "TestData")
	public void register(String fn,String ln,String email,String pwd,String cpwd) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		Thread.sleep(2000);
		driver.quit();
	}

}
