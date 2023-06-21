package handlingalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Dismiss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//identify the customer id 
		driver.findElement(By.name("cusid")).sendKeys("333");
		//identify the submit button and click
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		//capture the alert text
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		Thread.sleep(2000);
		//handle the popup with dismiss
		driver.switchTo().alert().dismiss();
		driver.quit();

	}

}
