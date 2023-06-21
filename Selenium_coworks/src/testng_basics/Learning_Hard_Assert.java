package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Hard_Assert {
	@Test
	public void hard_assertPractise() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//for positive scnario
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		//for negative scenario
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.quit();
		
	}

}
