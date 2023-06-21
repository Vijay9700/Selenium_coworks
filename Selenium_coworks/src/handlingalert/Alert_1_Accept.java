package handlingalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_1_Accept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//identify the double click me button and click
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		//double click
		Actions action=new Actions(driver);
		action.doubleClick(button).perform();
		//handle the popup by accept
		Alert popup = driver.switchTo().alert();
		Thread.sleep(2000);
		popup.accept();

	}

}
