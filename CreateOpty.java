package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOpty extends SFDCLogin {

	public static void main(String[] args) throws InterruptedException 
	{
//		launchDriver();
		
//		Testcase15();
//		Testcase16();
//		Testcase17();
//		Testcase18();
//		Testcase19();
		
	}
	
	public static void Testcase15() throws InterruptedException
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
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessful");
		
		WebElement loginValidUserName = driver.findElement(By.xpath("//div[@class='navLinks']//div[1]//div[1]//div[1]//div[1]"));
		String actualText = "";
		String expectedText = "Home Page ~ Salesforce - Developer Edition";
		
		actualText = driver.getTitle();
		System.out.println(actualText);
		
		if (actualText.contentEquals(expectedText))
		{
			System.out.println("Salesforce login is performed with valid user name");
		}
		else
		{
			System.out.println("Salesforce login is performed with invalid username");
		}
	
		
		WebElement opportunitiesLink = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunitiesLink.click();
		System.out.println("opportunitiesLink is selected");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		
		WebElement opportunitiesPageValidation = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualpage =  opportunitiesPageValidation.getText();
		String expectedpage = "Oppurtunities";
		
		if (actualpage.contentEquals(expectedpage))
		{
			System.out.println("Oppurtunities page is displayed");
		}
		else
		{
			System.out.println("Oppurtunities page is not displayed");
		}
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown1.selectByVisibleText("New This Week");
		System.out.println("This confirms New This week is present in the dropdown menu");
		
		WebElement opportunitiesLink1 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink1.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown2.selectByVisibleText("All Opportunities");
		System.out.println("This confirms All Opportunities is present the in dropdown menu");
		
		WebElement opportunitiesLink2 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink2.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown3.selectByVisibleText("Closing Next Month");
		System.out.println("This confirms Closing Next Month is present the in dropdown menu");
		
		WebElement opportunitiesLink3 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink3.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown4.selectByVisibleText("Closing This Month");
		System.out.println("This confirms Closing This Month is present the in dropdown menu");
		
		WebElement opportunitiesLink4 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink4.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown5 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown5.selectByVisibleText("My Opportunities");
		System.out.println("This confirms Closing This Month is present the in dropdown menu");
		
		WebElement opportunitiesLink5 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink5.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown6 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown6.selectByVisibleText("New Last Week");
		System.out.println("This confirms New Last Week is present the in dropdown menu");
		
		WebElement opportunitiesLink6 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink6.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown7 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown7.selectByVisibleText("Opportunity Pipeline");
		System.out.println("This confirms Opportunity Pipeline is present the in dropdown menu");
		
		WebElement opportunitiesLink7 = driver.findElement(By.xpath("//a[@title='Opportunities Tab - Selected']"));
		opportunitiesLink7.click();
		System.out.println("opportunitiesLink is selected");
		
		Select dropdown8 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		dropdown8.selectByVisibleText("Private");
		System.out.println("This confirms Private is present the in dropdown menu");
	
		System.out.println("Testcase15 sucessful");
		
		
	}
	
	public static void Testcase16() throws InterruptedException
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
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessful");
		
		WebElement opportunitiesLink = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunitiesLink.click();
		System.out.println("opportunitiesLink is selected");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		
		WebElement newLink = driver.findElement(By.xpath("//input[@title='New']"));
		newLink.click();
		System.out.println("newLink is selected");
		
		WebElement opportunityName = driver.findElement(By.xpath("//input[@id='opp3']"));
		opportunityName.sendKeys("New Project");
		System.out.println("opportunityName is entered");
		
		WebElement closeDate = driver.findElement(By.xpath("//input[@id='opp9']"));
		closeDate.sendKeys("8/8/2019");
		System.out.println("close date is entered");
		
		WebElement accountName = driver.findElement(By.xpath("//input[@id='opp4']"));
		accountName.sendKeys("Ganesha");
		System.out.println("Account name entered");
		
		WebElement campaignSource = driver.findElement(By.xpath("//input[@id='opp17']"));
		campaignSource.sendKeys("Srinivasa");
		System.out.println("campaign source entered");
		
		 
		Select stage = new Select(driver.findElement(By.xpath("//select[@id='opp11']")));
		stage.selectByVisibleText("Closed Won");
		System.out.println("stage field is entered");
		
		WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		save.click();
		System.out.println("Save button is selected");
		
		System.out.println("Testcase16 sucessful");
		
	}
	
	public static void Testcase17() throws InterruptedException

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
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessful");
		
		WebElement opportunitiesLink = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunitiesLink.click();
		System.out.println("opportunitiesLink is selected");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		
		WebElement opportunityPipelineLink = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		opportunityPipelineLink.click();
		System.out.println("opportunity Pipeline Link is selected");
		
		System.out.println("Testcase17 sucessful");
		
	}
	
	public static void Testcase18() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
		driver.get("https://www.salesforce.com");

		WebElement login = driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("user@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessful");
		
		WebElement opportunitiesLink = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunitiesLink.click();
		System.out.println("opportunitiesLink is selected");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		
		WebElement stuckOpportunities = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		stuckOpportunities.click();
		System.out.println("stuckOpportunities is selected");
		
		WebElement title_stuckOpportunities = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']"));
		String actualtTitle = title_stuckOpportunities.getText();
		String expectedTitle = "Stuck Opportunities";
		
		if (expectedTitle.equals(actualtTitle))
		{
			System.out.println("Test: Pass" + "  struckopportunities page is displayed");
		}
		else
		{
			System.out.println("Test: Pass" + "  struckopportunities page is not displayed");
		}
		
		System.out.println("Testcase18 sucessful");
		
//		driver.close();
	
	}
	
	public static void Testcase19() throws InterruptedException
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
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login sucessful");
		
		WebElement opportunitiesLink = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunitiesLink.click();
		System.out.println("opportunitiesLink is selected");
		
		WebElement ad_btn = driver.findElement(By.id("tryLexDialogX"));
		ad_btn.click();
		System.out.println("pop up is closed");
		
		WebElement quaterlySummary = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		quaterlySummary.click();
		
		System.out.println("Testcase19 sucessful");
	}
	

}
