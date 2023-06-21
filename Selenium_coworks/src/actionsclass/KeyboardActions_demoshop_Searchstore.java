package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_demoshop_Searchstore {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//find search store text box
		WebElement smallsearchterms = driver.findElement(By.id("small-searchterms"));
		//create an obj for sctions class
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(smallsearchterms).click().sendKeys("mobiles").perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h1[text(),'Search']")).click();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_UP).perform();
	}

}
