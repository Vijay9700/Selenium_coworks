package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText__getAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Retrieve text of register link
	    String registerText = driver.findElement(By.linkText("Register")).getText();
	    System.out.println("REGISTER LINK TEXT..."+registerText);
	    
	    //Retrieve the attribute value belongs to edit box by using id attribute
	    String idValue = driver.findElement(By.id("small-searchterms")).getAttribute("id");
	    System.out.println("value of id..."+idValue);
	    
	    //Retrieve the attribute value belongs to edit box by using value attribute
	    System.out.println("BEFORE ENTER ...."+driver.findElement(By.id("small-searchterms")).getAttribute("value"));
	    driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	    System.out.println("AFTER ENTER..."+driver.findElement(By.id("small-searchterms")).getAttribute("value"));
	    
	    driver.quit();
	}

}
