package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay_isEnabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println("search button is present..."+driver.findElement(By.cssSelector("input[value='Search']")).isDisplayed());
		System.out.println("search button is enabled..."+driver.findElement(By.cssSelector("input[value='Search']")).isEnabled());
		
		driver.quit();
	}

}
