package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerMethods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(2000);
		driver.navigate().to("https://en.wikipedia.org/wiki/Indian_Army");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
