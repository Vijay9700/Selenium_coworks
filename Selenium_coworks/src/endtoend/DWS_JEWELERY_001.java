package endtoend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_JEWELERY_001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://demowebshop.tricentis.com/");
		//identify jewelry and click it
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Jewelry"))));
		driver.findElement(By.partialLinkText("Jewelry")).click();
		//identify add to cart button and click
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Add to cart'])[1]"))));
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//Thread.sleep(2000);
		//identify the material drop down
		WebElement materialDropDown = driver.findElement(By.tagName("select"));
		//create an object for select class and pass material reference
		Select sel=new Select(materialDropDown);
		//Thread.sleep(2000);
		//choose the option gold(0.5mm)
		//wait.until(ExpectedConditions.visibilityOf(materialDropDown));
		sel.selectByValue("45");
		//identify the length text box and enter 10
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'product_')])[1]"))));
		driver.findElement(By.xpath("(//input[contains(@id,'product_')])[1]")).sendKeys("10");
		//Thread.sleep(2000);
		//select pendent as ladybug and click
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("product_attribute_71_11_17"))));
		driver.findElement(By.name("product_attribute_71_11_17")).click();
		//Thread.sleep(2000);
		//enter 1 in quantity textbox
		WebElement quantityTextbox=driver.findElement(By.id("addtocart_71_EnteredQuantity"));
		wait.until(ExpectedConditions.visibilityOf(quantityTextbox));
		quantityTextbox.clear();
		//Thread.sleep(1000);
		quantityTextbox.sendKeys("2");
		//click on add to cart button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-cart-button-71"))));
		driver.findElement(By.id("add-to-cart-button-71")).click();
		//Thread.sleep(7000);
		//identify shipping cart link and click on it
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Shopping cart"))));
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		//Thread.sleep(2000);
		//identify I agree button and click it
		driver.findElement(By.id("termsofservice")).click();
		//Thread.sleep(2000);
		//identify the checkout button and click it
		driver.findElement(By.id("checkout")).click();
		//Thread.sleep(2000);
		//identify email text field and pass data
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
		driver.findElement(By.id("Email")).sendKeys("vijayganesan@gmail.com");
		//Thread.sleep(2000);
		//identify password textfield and pass data
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Password"))));
		driver.findElement(By.id("Password")).sendKeys("Vijay@123");
		//Thread.sleep(2000);
		//identify login button and click it
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		//Thread.sleep(2000);
		//identify I agree button and click it
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("termsofservice"))));
		driver.findElement(By.id("termsofservice")).click();
		//Thread.sleep(2000);
		//identify the checkout button and click it
		driver.findElement(By.id("checkout")).click();
		//Thread.sleep(2000);
		//identify continue button in billing and click on it
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@title='Continue'])[1]"))));
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		//Thread.sleep(5000);
		//identify the continue button in shipping adress and click
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@title='Continue'])[2]"))));
		driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
		//Thread.sleep(5000);
		//choose shipping method as ground and click continue
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("shippingoption_0"))));
		driver.findElement(By.id("shippingoption_0")).click();
		//Thread.sleep(6000);
		//click on continue which belongs to shipping method
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[3]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		//Thread.sleep(6000);
		//choose cod option
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("paymentmethod_0"))));
		driver.findElement(By.id("paymentmethod_0")).click();
		//Thread.sleep(6000);
		//click on continue on payment option
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[4]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		//Thread.sleep(6000);
		//click on continue in payment information
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[5]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		//Thread.sleep(6000);
		//click on confirm button in confirm 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Confirm']"))));
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		//Thread.sleep(6000);
		//get the confirmation message
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[contains(text(),'Your order')]"))));
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Your order')]")).getText());
		//Thread.sleep(5000);
		//identify the continue button and click it
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Thread.sleep(2000);
		driver.quit();
		

	}

}
