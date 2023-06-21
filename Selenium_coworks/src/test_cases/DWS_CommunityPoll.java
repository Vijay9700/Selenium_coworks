package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import framework_utility.Base_Test;

public class DWS_CommunityPoll extends Base_Test {
	@Test
	public void communityPoll() {
		
		//select good
		driver.findElement(By.id("pollanswers-2")).click();
		//click on vote button
		driver.findElement(By.id("vote-poll-1")).click();
		
	}

}
