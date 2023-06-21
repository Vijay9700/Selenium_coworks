package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Computer_mouseaction_demoshop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//find computer option
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		//create an object foe action class and pass driver reference
		Actions action=new Actions(driver);
		//call the method of actions class
		action.moveToElement(computer).build().perform();
		//find the desktop option and click
		WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		action.moveToElement(desktop).click().perform();
	}

}
