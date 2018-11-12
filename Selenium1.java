package selenium;

import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String option = scan.nextLine();
		
		WebDriver driver;
		
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("mac"))
		{
			System.setProperty("webdriver.chrome.driver", "/User/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		}
		
		if (os.contains("mac"))
		{
			System.setProperty("webdriver.gecko.driver", "/User/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		}
		
		if (option.equals("1"))
		{
			driver = new ChromeDriver();
			
		}
		else
		{
			
			driver = new FirefoxDriver();
			
		}


		
//		driver.get("https://www.salesforce.com/");
//		driver.manage().window().maximize();
//		System.out.println("salesforce.com opened sucessfully");
//		
//		WebElement login = driver.findElement(By.cssSelector("div.dropdown:nth-child(1) > a:nth-child(1)"));
//		Thread.sleep(1000);
//		login.click();
//		System.out.println("login clicked");
//		
//		WebElement username = driver.findElement(By.cssSelector("#username"));
//		Thread.sleep(4000);
//		username.sendKeys("password");
//		System.out.println("Username entered");
//		
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		Thread.sleep(4000);
//		password.sendKeys("password");
//		System.out.println("Password entered");
//		
//		WebElement radio_btn = driver.findElement(By.id("rememberUn"));
//		Thread.sleep(4000);
//		radio_btn.click();
//		System.out.println("Radio button is selected");
//		
//		WebElement login_btn = driver.findElement(By.id("Login"));
//		Thread.sleep(4000);
//		login_btn.click();
//		System.out.println("login button is clicked");
		
		driver.get("http://www.salesforce.com");
		driver.manage().window().maximize();
		System.out.println("salesforce website is opened");
		
		WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath(".//*[@id = 'username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("password"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("Login"));
		login_btn.click();
		
		////*[@id="identifierId"]
		///html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/content/div/h1/content
		
		
		

		


		
		

		
		
		
		
		
				

	}

}
