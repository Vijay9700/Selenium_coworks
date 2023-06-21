package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Demoshop_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesh/Downloads/iframe.html");
		//switch to demo shop frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(2000);

	}

}
