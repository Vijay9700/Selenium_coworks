package youtube;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAutomation {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your prefered Browser example: chrome or firefox or edge ");
		System.out.println("Enter here: ");
		String browser=scanner.next();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./Drivers/edgedriver.exe");
		boolean validBrowser=true;
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new  ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			//System.out.println(browser+" driver is not compatible");
			validBrowser=false;
		}
		
		if(validBrowser) {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("abcd");
			driver.findElement(By.id("pass")).sendKeys("Abcd@12345");
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver.close();
		}
		else {
			System.out.println(browser+" driver is not compatible");
		}
	}

}