package my_practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		//simple alert--->only ok button
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//confirmation alert--->both ok and cancel button
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		
		//text box alert--->text box will be present
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("vj");
//		Thread.sleep(3000);
//		alert.accept();
		System.out.println(alert.getText());
		driver.quit();
		}

}
