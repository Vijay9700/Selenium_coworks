package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_On_HiddenWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].value='VIJAY';", hiddenTextBox);

	}

}
