package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrowserMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        driver.quit();
	}

}
