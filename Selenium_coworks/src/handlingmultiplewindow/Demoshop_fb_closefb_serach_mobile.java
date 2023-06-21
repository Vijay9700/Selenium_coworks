package handlingmultiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop_fb_closefb_serach_mobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//capture parent window id
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		//identify fb link and click on
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		//capture all window id
		Thread.sleep(2000);
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		for (String wid : allWindowId) {
			if(!(wid.equals(pid)))
			{
				driver.switchTo().window(wid);
				driver.close();
			}
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
	}

}
}
