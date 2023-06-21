package task_on_findelements;

import java.util.List;

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
		
		List<WebElement> allRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(allRadioButton.size());
		//iterate
		for(int i=0;i<=allRadioButton.size()-1;i++)
		{
			System.out.println(allRadioButton.get(i).getAttribute("value"));
			allRadioButton.get(i).click();
			
		}
		
		driver.quit();
	}

}
