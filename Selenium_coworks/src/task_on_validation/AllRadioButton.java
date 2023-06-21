package task_on_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllRadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify excellent radio button
		WebElement excellentRadioButton = driver.findElement(By.id("pollanswers-1"));
		if(excellentRadioButton.isDisplayed())
		{
			System.out.println("excellentRadioButton is found successfully");
			excellentRadioButton.click();
			System.out.println("excellentRadioButton is working accordingly");
		}
		else
		{
			System.out.println("excellentRadioButton is not found");
		}
		//identify good radio button
		WebElement goodRadioButton = driver.findElement(By.id("pollanswers-2"));
		if(goodRadioButton.isDisplayed())
		{
			System.out.println("goodRadioButton is found successfully");
			excellentRadioButton.click();
			System.out.println("goodRadioButton is working accordingly");
		}
		else
		{
			System.out.println("goodRadioButton is not found");
		}
		//identify poor radio button
		WebElement poorRadioButton = driver.findElement(By.id("pollanswers-3"));
		if(poorRadioButton.isDisplayed())
		{
			System.out.println("poorRadioButton is found successfully");
			excellentRadioButton.click();
			System.out.println("poorRadioButton is working accordingly");
		}
		else
		{
			System.out.println("poorRadioButton is not found");
		}
		//identify very bad radio button
		WebElement verybadRadioButton = driver.findElement(By.id("pollanswers-4"));
		if(verybadRadioButton.isDisplayed())
		{
			System.out.println("verybadRadioButton is found successfully");
			excellentRadioButton.click();
			System.out.println("verybadRadioButton is working accordingly");
		}
		else
		{
			System.out.println("verybadRadioButton is not found");
		}
		
		driver.quit();
	}

}
