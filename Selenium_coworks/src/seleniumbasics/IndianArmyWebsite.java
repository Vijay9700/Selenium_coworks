package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class IndianArmyWebsite {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Indian_Army");
		Thread.sleep(3000);
		driver.quit();
	}

}
