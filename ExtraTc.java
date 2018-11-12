package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraTc extends SFDCLogin {

	public static void main(String[] args) {
	

	}
	
	public static void Testcase38() throws InterruptedException
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
		
		System.out.println("Not able to proceed with the execution");
		
	}

}
