package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByWebelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesh/Downloads/iframe.html");
		//switch to demo shop frame
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		//identify the search box and enter book
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		//click on search button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
