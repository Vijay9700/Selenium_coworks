package handling_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this is handled with help of URL itself
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//way to handle["http://username:password@the-internet.herokuapp.com/basic_auth"]
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.quit();

	}

}
