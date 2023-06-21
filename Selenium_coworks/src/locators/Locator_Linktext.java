package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Linktext {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on register link
        driver.findElement(By.linkText("Register")).click();
        //select male radio button
        driver.findElement(By.id("gender-male")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("VIJAY");
        //enter last name
        driver.findElement(By.id("LastName")).sendKeys("GANESAN");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("vijay1@gmail.com");
        //enter password
        driver.findElement(By.name("Password")).sendKeys("vijay@123");
        //enter confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("vijay@123");
        Thread.sleep(5000);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(5000);
        driver.quit();
	}

}
