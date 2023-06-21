package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Locators_Id_01 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement smallSearchtermsButton=driver.findElement(By.id("small-searchterms"));
		smallSearchtermsButton.sendKeys("VIJAY");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
