package youtube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthInAssending {
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
		ArrayList<String> list=new ArrayList<>();
		Select sel = new Select(monthDropdown);
		List<WebElement> allMonths = sel.getOptions();
		for (WebElement webElement : allMonths) {
		 list.add(webElement.getText());
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
