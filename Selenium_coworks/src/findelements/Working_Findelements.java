package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Findelements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//identifying the web elements in books
		List<WebElement> book_list = driver.findElements(By.xpath("//a[contains(text(),'Books')]"));
		System.out.println("no of web elements presnts..."+book_list.size());
		
		//iterate web elements
		for(int i=0;i<=book_list.size();i++)
		{
		String values = book_list.get(i).getText();	
		System.out.println("web element names...."+values);
		
		driver.quit();
		}
	}

}
