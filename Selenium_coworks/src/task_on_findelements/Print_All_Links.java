package task_on_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("TOTAL LINKS..."+allLinks.size());
		for (WebElement link : allLinks) {
			System.out.println(link.getAttribute("href"));
		}
		
		driver.quit();
	}

}
