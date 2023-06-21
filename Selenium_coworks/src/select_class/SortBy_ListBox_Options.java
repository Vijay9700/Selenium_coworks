package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortBy_ListBox_Options {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		//identify the position dropdown
		WebElement position = driver.findElement(By.id("products-orderby"));
		Select allPositionOptions = new Select(position);
		List<WebElement> dropdown1 = allPositionOptions.getOptions();
		for (WebElement webElement : dropdown1) {
			System.out.println(webElement.getText());
		}
		driver.quit();
		
	}

}
