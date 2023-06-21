package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_jobs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(4000);
		//identify the jobs option and mouse hover
		WebElement jobs=driver.findElement(By.xpath("((//div[contains(text(),'Jobs')])[1]"));
		//create an object for actions class
		Thread.sleep(4000);
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(jobs).build().perform();

	}

}
