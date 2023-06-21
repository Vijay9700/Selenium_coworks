package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_SoftAssert {
	@Test
	public void softAssertPractise() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//create an object for soft assert class
		SoftAssert ast=new SoftAssert();
		//positive scenario
		ast.assertEquals(driver.getTitle(), "Demo Web Shop");
		//negative scenario
		//ast.assertEquals(driver.getTitle(), "facebook");
		//assertAll() is mandatory when we using soft assert,It must be the last argument of of every test case before quit
		ast.assertAll();
		driver.quit();
	}

}
