package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Retrieve the color of register link
		String colorOfRegButton = driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println("colorOfRegButton..."+colorOfRegButton);
		
		//retrieve the font size of books button
		String fontSizeOfBooksButton = driver.findElement(By.partialLinkText("Books")).getCssValue("font-size");
		System.out.println("fontSizeOfBooksButton..."+fontSizeOfBooksButton);
		
		driver.quit();
	}

}
