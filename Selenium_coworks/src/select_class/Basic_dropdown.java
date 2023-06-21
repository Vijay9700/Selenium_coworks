package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesh/Downloads/demo.html");
		
		//find the drop down
		WebElement carsOptions = driver.findElement(By.id("standard_cars"));
		
        //create an object for select class
		Select options = new Select(carsOptions);
		
		
		options.selectByIndex(5);
		options.selectByValue("toy");
		options.selectByVisibleText("Jaguar");
	}

}
