package handling_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("");//the file must developed by type="file" attribute
		driver.findElement(By.id("file-submit")).click();

	}

}
