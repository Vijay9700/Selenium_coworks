package handlingmultiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesh/Downloads/MultipleWindow.html");
		
		//identify the parent window
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId);
		Thread.sleep(3000);
		//identify the child window and get their id
		//click on open food sites button
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='button']")).click();
		//capture all window id
		Thread.sleep(3000);
		Set<String> allChildId = driver.getWindowHandles();
		System.out.println(allChildId);
		//switch to all windows and close
		for (String childId : allChildId) {
			driver.switchTo().window(childId);
			driver.close();
			Thread.sleep(2000);
		}
	}

}
