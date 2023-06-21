package youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identifying create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//identify the month dropdown
		Thread.sleep(5000);
		WebElement monthDropdown = driver.findElement(By.id("month"));
		//create select class object
		Select sel = new Select(monthDropdown);
		List<WebElement> allMonths = sel.getOptions();
		for (WebElement webElement : allMonths) {
			System.out.println(webElement.getText());
		}
		
		//identify the year dropdown
				Thread.sleep(5000);
				WebElement yearDropdown = driver.findElement(By.id("year"));
				//create select class object
				Select sel1 = new Select(yearDropdown);
				List<WebElement> allyears = sel1.getOptions();
				for (WebElement webElement : allyears) {
					System.out.println(webElement.getText());
				}
		
		driver.quit();
	}

}
