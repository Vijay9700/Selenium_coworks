package handlingalert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//identify right click me option and right click
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		//double click 
		Actions action=new Actions(driver);
		action.contextClick(rightClickMeButton).build().perform();
		List<WebElement> allOptions = driver.findElements(By.xpath("//li/span"));
		System.out.println(allOptions);
		for (WebElement webElement : allOptions) {
			action.contextClick(rightClickMeButton).perform();
			webElement.click();
			Alert popup = driver.switchTo().alert();
			System.out.println(popup.getText());
			popup.accept();
			Thread.sleep(3000);
		}
		
		driver.quit();
	}

}
