package task_on_validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//in demo shop website 
//go to news letter textfield and enter the data
//click on subscribe button
public class Subscribe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify the sign up for our newsletter textbox
		WebElement newsLetterTextfield = driver.findElement(By.id("newsletter-email"));
		if(newsLetterTextfield.isDisplayed())
		{
			System.out.println("newsLetterTextfield is found successfully");
			newsLetterTextfield.sendKeys("msd77@gmail.com");
			System.out.println("data entered into newsLetterTextfield successfully");
		}
		else
		{
			System.out.println("newsLetterTextfield is not found");
		}
		
		//click on subscribe button
		driver.findElement(By.cssSelector("input[class='button-1 newsletter-subscribe-button']")).click();
		String message = driver.findElement(By.id("newsletter-result-block")).getText();
		System.out.println("MESSAGE..."+message);
		if(message.equals("Thank you for signing up! A verification email has been sent. We appreciate your interest."))
		{
			System.out.println("SUBSCRIBED SUCCESSFULLY...");
		
		}
		else
		{
			System.out.println("not successfully subscribed");
		}
		
		driver.quit();
		
	}

}
