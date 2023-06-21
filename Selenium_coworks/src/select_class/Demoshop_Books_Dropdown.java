package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoshop_Books_Dropdown {
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
		
		//identify display per page dropdown
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select displayPerPage = new Select(display);
		List<WebElement> dropdown2 = displayPerPage.getOptions();
		for (WebElement webElement : dropdown2) {
			System.out.println(webElement.getText());
		}
		
		//identify the grid dropdown
		WebElement grid = driver.findElement(By.id("products-viewmode"));
		Select gridOptions = new Select(grid);
		List<WebElement> dropdown3 = gridOptions.getOptions();
		for (WebElement webElement : dropdown3) {
			System.out.println(webElement.getText());
		}
		
		
		driver.quit();
	}

}
