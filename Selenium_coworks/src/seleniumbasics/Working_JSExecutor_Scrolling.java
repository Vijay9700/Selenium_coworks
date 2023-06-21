package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_JSExecutor_Scrolling {
	@Test
	public void Scrolling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/bangalore");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900);" );
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900);" );
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,2500);");
		
	}
	

}
