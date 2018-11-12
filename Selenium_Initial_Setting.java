package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Initial_Setting {

	public static void main(String[] args) {
		
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
			driver.get("https://www.google.com");
		}
		else
		{
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}


		

	}

}
