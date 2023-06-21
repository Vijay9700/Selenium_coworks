package task_on_validation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_RegisterPage {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Random r = new Random();
		int num=r.nextInt(1000);
		//click on register link
        driver.findElement(By.linkText("Register")).click();
        //select male radio button
        WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
        if(maleRadioButton.isEnabled())
        {
        	System.out.println("male radio button is founded successfully");
        	maleRadioButton.click();
        	System.out.println("male radio button selected successfully");
        }
        else {
        	System.out.println("male radio button not found");
        }
        //enter first name
         WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
        if(firstNameTextField.isDisplayed())
        {
        System.out.println("firstname text field is founded successfully");
        firstNameTextField.sendKeys("MS DHONI 1");
        System.out.println("Data entered into firstname textfield successfully");
        }
        else {
        	System.out.println("firstname text fiels not found");
        }
        System.out.println("Data entered in firstname textfield..."+driver.findElement(By.id("FirstName")).getAttribute("value"));
        //enter last name
         WebElement lastNameTextField = driver.findElement(By.id("LastName"));
         if(lastNameTextField.isDisplayed())
         {
        	System.out.println("lastname text field is founded successfully");
        	lastNameTextField.sendKeys("7");
        	System.out.println("Data entered into lastname textfield successfully");
         }
         else
         {
        	 System.out.println("lasttname text fiels not found");
         }
         System.out.println(driver.findElement(By.id("LastName")).getAttribute("value"));
        //enter email
        WebElement emailTextField = driver.findElement(By.name("Email"));
        if(emailTextField.isDisplayed())
        {
        	System.out.println("email textfield is found successfully");
        	emailTextField.sendKeys("msd"+num+"@gmail.com");
        	System.out.println("Data entered into email textfield successfully");
        }
        else
        {
        	System.out.println("email textfield not found");
        }
        System.out.println(driver.findElement(By.name("Email")).getAttribute("value"));
        //enter password
        WebElement passwordTextfield = driver.findElement(By.name("Password"));
        if(passwordTextfield.isDisplayed())
        {
        	System.out.println("password textfield is found successfully");
        	passwordTextfield.sendKeys("msd@123");
        	System.out.println("password entered successfully");
        }
        else {
        	System.out.println("password textfiels not found");
        }
        System.out.println(driver.findElement(By.name("Password")).getAttribute("value"));
        //enter confirm password
        WebElement confirmPasswordTextfield = driver.findElement(By.name("ConfirmPassword"));
        if(confirmPasswordTextfield.isDisplayed())
        {
        	System.out.println("confirm Password Textfield is found successfully");
        	confirmPasswordTextfield.sendKeys("msd@123");
        	System.out.println("data entered into confirm Password Textfield successfully ");
        }
        else
        {
        	System.out.println("confirm Password Textfield not found");
        }
        if(passwordTextfield.equals(confirmPasswordTextfield))
        {
        	System.out.println("password and confirm password is matched");
        }
        Thread.sleep(5000);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(5000);
        driver.quit();
	}

}
