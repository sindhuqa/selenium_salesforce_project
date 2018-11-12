package selenium;



import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RandomScenarios {
	
	public static void main(String[] args) throws InterruptedException 
	{
//		launchDriver();
		
//		Testcase33();
//		Testcase34();
//		Testcase35();
//		Testcase36(); 
//		Testcase37();

	}

	public static WebDriver launchDriver() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void Testcase33() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.salesforce.com");
		
		String baseUrl = "https://login.salesforce.com/";
		
		String expectedTitle = "Login | Salesforce";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Salesforce login page is launched");
		}
		else
		{
			System.out.println("Salesforce login page error");
		}
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.salesforce.com");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		System.out.println("valid Username entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("valid Password is entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		
		WebElement home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		System.out.println("Home menu is clicked");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("ad screen is closed");
		
		WebElement fullName = driver.findElement(By.xpath("//a[@href='/_ui/core"
				+ "/userprofile/UserProfilePage'][contains(text(),'username')]"));
		String actualText = fullName.getText();
		String ExpectedText = "username";
		
		if (ExpectedText.equals(actualText))
		{
			System.out.println("Test: pass " + ExpectedText + " is same as " + actualText);
		}
		else
		{
			System.out.println("Test: fail " + ExpectedText + " is not equal to " + actualText);
		}
		
		WebElement fullName1 = driver.findElement(By.xpath("//a[@href='/_ui/core"
				+ "/userprofile/UserProfilePage'][contains(text(),'User')]"));
		fullName1.click();
		
		WebElement actualProfilePage = driver.findElement(By.xpath("//div[@class='contactInfo profileSection']//h3"));
		actualProfilePage.getClass();
		
		WebElement ExpectedProfilePage = driver.findElement(By.xpath("//div[@class='contactInfo profileSection']//h3"));
		ExpectedProfilePage.getClass();
		
		if (actualProfilePage.getClass().equals(ExpectedProfilePage.getClass()))
		{
			System.out.println("Test: Pass " + ExpectedProfilePage.getClass() + 
					" is same page as " + ExpectedProfilePage.getClass());
			
		}
		
		else
		{
			System.out.println("Test: Pass " + ExpectedProfilePage.getClass() + 
					" is not the same page as " + ExpectedProfilePage.getClass());

		}
		
//		driver.close();		
		
	}
	
	public static void Testcase34() throws InterruptedException
	{
		WebDriver driver = launchDriver();
//		driver.get("https://www.salesforce.com");
		
		String baseUrl = "https://login.salesforce.com/";
		
		String expectedTitle = "Login | Salesforce";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Salesforce login page is launched");
		}
		else
		{
			System.out.println("Salesforce login page error");
		}
		
		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		System.out.println("Valid username is entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("Valid password is entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		
		WebElement home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		System.out.println("Home menu is clicked");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("ad screen is closed");
		
		WebElement fullName1 = driver.findElement(By.xpath("//a[@href='/_ui/core"
				+ "/userprofile/UserProfilePage'][contains(text(),'User')]"));
		fullName1.click();
		System.out.println("selected full name");
		
		
		WebElement editContact = driver.findElement(By.xpath("//a[@class='contactInfoLaunch "
				+ "editLink']//img[@title='Edit Profile']"));
		editContact.click();
		System.out.println("Edit contact is selected");
		
		String handle =  driver.getWindowHandle();
		System.out.println(handle);
		
//		Set<String>allwindows = driver.getWindowHandles();
//		String[] allwindowsID = allwindows.toArray(new String[allwindows.size()]);
//		
//		driver.switchTo().window(allwindowsID[1]);
		
//        Set<String> handles = driver.getWindowHandles();
//        System.out.println(handles);

//        for (String handle1: driver.getWindowHandles()) 
//     {
//
//               System.out.println(handle1);
//
//               driver.switchTo().window(handle1);
//
//        }
		
//		WebElement insideWindow = driver.findElement(By.xpath("//div[@id='contactInfoContent']"));
//		insideWindow.click();
		
//		WebElement fr = driver.findElement(By.id("contactInfoContent"));
		driver.switchTo().frame("contactInfoContentId");
		
		WebElement aboutTab = driver.findElement(By.id("aboutTab"));
		aboutTab.click();
		System.out.println("about tab is selected");
		

		
//		WebElement aboutTab = driver.findElement(By.cssSelector("#aboutTab > a"));
//		aboutTab.click();
//		System.out.println("about tab is selected");
		
		
		WebElement lastname = driver.findElement(By.id(("lastName")));
		lastname.clear();
		lastname.sendKeys("Abcd");
		System.out.println("last name is edited");
		
		WebElement saveAll = driver.findElement(By.cssSelector("input.zen-btn:nth-child(1)"));
		saveAll.click();
		System.out.println("Save button is selected");
		
//		driver.close();
	
	}
	
	public static void Testcase35() throws InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.salesforce.com");
		
		String baseUrl = "https://login.salesforce.com/";
		
		String expectedTitle = "Login | Salesforce";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Salesforce login page is launched");
		}
		else
		{
			System.out.println("Salesforce login page error");
		}

		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		
		String handle =  driver.getWindowHandle();
		System.out.println(handle);
		
		WebElement plusSymbol = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		plusSymbol.click();
		
		WebElement customizemenu = driver.findElement(By.xpath("//input[@title='Customize My Tabs']"));
		customizemenu.click();
		
		WebElement removeChatter = driver.findElement(By.xpath("//option[@value='Chatter']"));
		removeChatter.click();
				
		WebElement remove_btn = driver.findElement(By.xpath("//img[@title='Remove']"));
		remove_btn.click();
		
		WebElement save_btn = driver.findElement(By.xpath("//input[@title='Save']"));
		save_btn.click();
		
		Select customerName = new Select (driver.findElement(By.xpath("	//div[@id='userNav-arrow']")));
		Thread.sleep(6000);
		//((WebElement) customerName).click();
		//customerName.selectByIndex(0);
		customerName.selectByVisibleText("Logout");
		System.out.println("logout performed sucessfully");
		Thread.sleep(6000);
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		username1.sendKeys("user@gmail.com");
		
		WebElement password1 = driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("1swy_salesforce");
		
		WebElement login_btn1 = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn1.click();
		
		WebElement removeChatter1 = driver.findElement(By.xpath("//option[@value='Chatter']"));
		Thread.sleep(6000);
		removeChatter1.isEnabled();
		
		if (removeChatter1.isEnabled())
		{
			System.out.println("Test: Fail");
		}
		else
		{
			System.out.println("Test: Pass");
		}
		
		driver.close();
	}
	
	public static void Testcase36() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.salesforce.com");

		String baseUrl = "https://login.salesforce.com/";
		
		String expectedTitle = "Login | Salesforce";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Salesforce login page is launched");
		}
		else
		{
			System.out.println("Salesforce login page error");
		}
		
		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		
//		String handle =  driver.getWindowHandle();
//		System.out.println(handle);
		
		WebElement home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		System.out.println("Home menu is clicked");
		
		WebElement currentDate = driver.findElement(By.xpath("//a[contains(text(),'Tuesday August 7, 2018')]"));
		currentDate.click();
		
		WebElement eightpmlink = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		eightpmlink.click();
		
		WebElement subjectimg = driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
		subjectimg.click();
		
		driver.getWindowHandle();
		
		for (String handle1 : driver.getWindowHandles()) {
			 
		    driver.switchTo().window(handle1);
		    
		}
		
		WebElement otheroption = driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']"));
		otheroption.click();
	
		Select endTime = new Select(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		endTime.selectByVisibleText("9:00 PM");
		
		WebElement save_btn = driver.findElement(By.xpath("	//td[@id='topButtonRow']//input[@title='Save']"));
		save_btn.click();
		
//		driver.close();

	}
	
	public static void Testcase37() throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");

		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessfull");
		
//		String handle =  driver.getWindowHandle();
//		System.out.println(handle);
		
		WebElement home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		home.click();
		System.out.println("Home menu is clicked");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("ad window is closed");
		
		WebElement currentDate = driver.findElement(By.xpath("//a[contains(text(),'Tuesday August 7, 2018')]"));
		currentDate.click();
		System.out.println("currentdate is selected");
		
		WebElement fourpmlink = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		fourpmlink.click();
		System.out.println("4PM time set");
		
		//driver.getWindowHandle();
		
		WebElement subjectimg = driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
		subjectimg.click();
		System.out.println("new window is opened");
		
		String mainWindow = driver.getWindowHandle();
		
//		Set<String> handles = driver.getWindowHandles();
		
//		for (String handle1 : driver.getWindowHandles()) {
//			 
//		    driver.switchTo().window(handle1);
//		    
//		}
		
		WebElement otheroption = driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']"));
		otheroption.click();
		
		

		Thread.sleep(6000);
		
		Select endTime = new Select(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		endTime.selectByVisibleText("7:00 PM");
		
		WebElement recurrence = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		recurrence.click();
		
		WebElement weeklyradiobtn = driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		weeklyradiobtn.click();
		
		WebElement endDate = driver.findElement(By.xpath("//input[@id='EndDateTime']"));
		endDate.clear();
		endDate.sendKeys("8/21/2018");
		
		WebElement save_btn = driver.findElement(By.xpath("	//td[@id='topButtonRow']//input[@title='Save']"));
		save_btn.click();
		
		WebElement monthviewicon = driver.findElement(By.xpath("//img[@title='Month View']"));
		monthviewicon.click();
		
		//driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
