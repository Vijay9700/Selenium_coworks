package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesh/Downloads/demo.html");
		
				//find the drop down
				WebElement carsOptions = driver.findElement(By.id("standard_cars"));
				
		        //create an object for select class
				Select options = new Select(carsOptions);
				//check it is multiple select or not
				System.out.println(options.isMultiple());
				List<WebElement> allOptions = options.getOptions();
				for (WebElement ele : allOptions) {
					System.out.println(ele.getText());
				}
		driver.quit();
	}

}
