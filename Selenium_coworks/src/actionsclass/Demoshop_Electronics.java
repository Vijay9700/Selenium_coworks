package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoshop_Electronics {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//find electronic option
		WebElement electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		//create an object for actions class and pass driver ref
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		//find cell phone option and click
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"))).click().perform();
	}

}
