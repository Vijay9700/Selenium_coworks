package endtoend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//select heart
public class DWS_JEWELERY_006 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify jewelery and click it
		driver.findElement(By.partialLinkText("Jewelry")).click();
		//identify add to cart button and click
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		//identify the material drop down
		WebElement materialDropDown = driver.findElement(By.tagName("select"));
		//create an object for select class and pass material reference
		Select sel=new Select(materialDropDown);
		Thread.sleep(2000);
		//choose the option gold(1mm)
		sel.selectByValue("47");
		//identify the length text box and enter 10
		driver.findElement(By.xpath("(//input[contains(@id,'product_')])[1]")).sendKeys("10");
		Thread.sleep(2000);
		//select pendent as heart and click
		driver.findElement(By.id("product_attribute_71_11_17_49")).click();
		Thread.sleep(2000);
		//enter 1 in quantity textbox
		WebElement quantityTextbox=driver.findElement(By.id("addtocart_71_EnteredQuantity"));
		quantityTextbox.clear();
		Thread.sleep(1000);
		quantityTextbox.sendKeys("2");
		//click on add to cart button
		driver.findElement(By.id("add-to-cart-button-71")).click();
		Thread.sleep(7000);
		//identify shipping cart link and click on it
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Thread.sleep(2000);
		//identify I agree button and click it
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		//identify the checkout button and click it
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		//identify email text field and pass data
		driver.findElement(By.id("Email")).sendKeys("vijayganesan@gmail.com");
		Thread.sleep(2000);
		//identify password textfield and pass data
		driver.findElement(By.id("Password")).sendKeys("Vijay@123");
		Thread.sleep(2000);
		//identify login button and click it
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		//identify I agree button and click it
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		//identify the checkout button and click it
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		//identify continue button in billing and click on it
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		Thread.sleep(5000);
		//identify the continue button in shipping adress and click
		driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
		Thread.sleep(5000);
		//choose shipping method as nextday on air  and click continue
		driver.findElement(By.id("shippingoption_1")).click();
		Thread.sleep(6000);
		//click on continue which belongs to shipping method
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		Thread.sleep(6000);
		//choose cod option
		driver.findElement(By.id("paymentmethod_0")).click();
		Thread.sleep(6000);
		//click on continue on payment option
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		Thread.sleep(6000);
		//click on continue in payment information
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		Thread.sleep(2000);
		//click on confirm button in confirm 
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(6000);
		//get the confirmation message
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Your order')]")).getText());
		Thread.sleep(5000);
		//identify the continue button and click it
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.quit();

	}

}
