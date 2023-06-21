package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Disabled_textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/index.php");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement disabledTextBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='VIJAY'", disabledTextBox);

	}

}
