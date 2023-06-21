package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woking_On_Click_inDisabledButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-8u371-linux-aarch64.rpm']")).click();
		WebElement disabledButton=driver.findElement(By.xpath("(//div[@class='obttns'])[9]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disabledButton);
		

	}

}
