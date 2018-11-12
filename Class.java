package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class extends ReusableMethods {

	public static void main(String[] args) 
	{
		login();

	}
	
	public static void login()
	{

		launchSFDC();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		textbox(username, "user@gmail.com", "UserId");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		textbox(password, "password1234", "Password" );
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		click(login_btn, " loginClickOperation");
		
		WebElement radio_btn = driver.findElement(By.id("rememberUn"));
		radiobuttonSelectDeselect(radio_btn, "RadioButtonSelectionDeselection");
	}


}
