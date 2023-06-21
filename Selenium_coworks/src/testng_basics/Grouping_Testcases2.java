package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping_Testcases2 {
	@Test(groups = "smoke")
	public void search() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//identify search box and enter computer
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	}

}
