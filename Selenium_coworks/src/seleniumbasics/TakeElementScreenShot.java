package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeElementScreenShot {
	@Test
	public void elementScreenShot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.partialLinkText("Log"));
		File temp = loginLink.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/Elementss.png");
		FileHandler.copy(temp, dest);
		driver.quit();
	}

}
