package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_JSExecutor_ScrollintoView {
	@Test
	public void scrollIntoView() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement mumbaiRes = driver.findElement(By.xpath("//h5[text()='Mumbai Restaurants']"));
		js.executeAsyncScript("arguments[0].scrollIntoView(false);",mumbaiRes );
	}

}
