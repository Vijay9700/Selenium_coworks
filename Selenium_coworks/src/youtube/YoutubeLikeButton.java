package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLikeButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//find search button
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("xpath in selenium");
		//find search icon and click
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		//found the video
		driver.findElement(By.xpath("//yt-formatted-string[@aria-label='What is XPath? Types of XPath? How to write XPath? |  XPath Tutorial for Beginners | by H Y R Tutorials 3 years ago 9 minutes, 38 seconds 83,054 views']")).click();
		driver.findElement(By.xpath("//*[@id=\"segmented-like-button\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
	}

}
