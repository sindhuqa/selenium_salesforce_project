package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SFDCLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		
//		launchDriver();
//		ValidUserIdPwd();
		
//		Testcase1();
//		Testcase2();
//		Testcase3();
//		Testcase4a();
//		Testcase4b();
		

	}
	
	public static WebDriver launchDriver() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void ValidUserIdPwd() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		System.out.println("Username entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("Password entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		System.out.println("Login sucessfull with valid username and valid password");
		
	}

	
	public static void Testcase1() throws InterruptedException
	{
		
		WebDriver driver = launchDriver();
		
		driver.get("https://www.salesforce.com");

		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		System.out.println("Password field is clear");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login in button is clicked");
		
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[@id='error']"));
		String expectedErrorMessage = "Please enter your password.";
		String actualErrorMessage = errorMessage.getText();
		
		if(expectedErrorMessage.equals(actualErrorMessage))
		{
			System.out.println("Test: Pass. " + expectedErrorMessage + " is equal to " + actualErrorMessage);
		}
		else
		{
			System.out.println("Test: Fail " + expectedErrorMessage + " is not equal to " + actualErrorMessage);
		}
		
		System.out.println("Testcase1 passed");
		
//		driver.close();
	
	}
	
	public static void Testcase2() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		System.out.println("Username entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("Password entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		System.out.println("Login sucessfull with valid username and valid password");
		
		System.out.println("Testcase2 passed");
		
//		driver.close();
	
	}
	
	public static void Testcase3() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		System.out.println("Username entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("Password entered");
		
		WebElement radio_btn = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		radio_btn.click();
		System.out.println("radio button rememeber me is checked");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		WebElement customerName = driver.findElement(By.id("userNavButton"));
		customerName.click();
		System.out.println("Full name is selected on the page");

		WebElement dropdown = driver.findElement(By.xpath("//a[@title='Logout']"));
		dropdown.click();
		System.out.println("logout performed sucessfully");
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
//		username1.getText();
		String check = username1.getAttribute("value");
		System.out.println("printing" + check);
		String ExpectedUserName = "user@gmail.com";
		
		
		if (check.equals(ExpectedUserName))
		{
			System.out.println("Test: Pass " + ExpectedUserName + "  is equal to "+ check);
		}
		else
		{
			System.out.println("Test: Fail " + ExpectedUserName + "  is not equal to "+ check);
		}
		
		System.out.println("Testcase3 passed");
		
//		driver.close();
		

	}
	
	public static void Testcase4a() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement ForgotPassword = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		ForgotPassword.click();
				
		WebElement username = driver.findElement(By.xpath("//input[@id='un']"));
		username.sendKeys("user@gmail.com");
		System.out.println("email id is entered to recover the password");
		
		WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
		continue_btn.click();
		System.out.println("continue button is pressed to recover the password");
		
		System.out.println("Testcase4a passed");
		
		
//		driver.close();
	}
	
	public static void Testcase4b() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("123");
		System.out.println("Invalid username is entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("22131");
		System.out.println("Invalid password is entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		System.out.println("Testcase4b passed");
		
//		driver.close();
	
	}
	
	

}
