package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortBy_select_onebyone {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement position = driver.findElement(By.id("products-orderby"));
		Select Options = new Select(position);
	    List<WebElement> opt1 = Options.getOptions();
		
		for (int i = 0; i <opt1.size()-1; i++) {
			//identify the position dropdown
			WebElement position1 = driver.findElement(By.id("products-orderby"));
			Select allPositionOptions = new Select(position1);
			allPositionOptions.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		driver.quit();
	}

}
