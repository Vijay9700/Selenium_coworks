package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortBy_Listbox_LocateParicularOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		String value="Name: A to Z";
		//identify the select tag element
		WebElement position = driver.findElement(By.id("products-orderby"));
		//create an object for select class
		Select sel=new Select(position);
		List<WebElement> options = sel.getOptions();
		for (int i=0;i<=options.size();i++) {
			WebElement position1 = driver.findElement(By.id("products-orderby"));
			Select sel1=new Select(position1);
			if(options.get(i).getText().equals(value)) {
				System.out.println("INDEX OF THE VALUE IS..."+i);
				break;
			}
		}
		driver.quit();
	}

}
