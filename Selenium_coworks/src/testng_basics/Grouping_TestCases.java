package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping_TestCases {
	@Test
	public void subscribe() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//identify subscribe bar and enter data
		driver.findElement(By.id("newsletter-email")).sendKeys("vijay@gmail.com");
		//click on subscribe button
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.quit();
	}
	
	@Test(groups = "smoke")
	public void communityPoll() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//select good
		driver.findElement(By.id("pollanswers-2")).click();
		//click on vote button
		driver.findElement(By.id("vote-poll-1")).click();
		driver.quit();
	}

}
