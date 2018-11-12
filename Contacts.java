package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Contacts {

	public static void main(String[] args) throws InterruptedException 
	{
//		launchDriver();
		
//		Testcase25();
//		Testcase26();
//	    Testcase27();
//		Testcase28();
//		Testcase29();
//		Testcase30();
//		Testcase31();
//		Testcase32();
		
		

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
		
//		driver.get("https://login.salesforce.com/");
		
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
	
	public static void Testcase25() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement new_btn = driver.findElement(By.xpath("//input[contains(@title,'New')]"));
		new_btn.click();
		System.out.println("New button is selected");
		
		WebElement lastName = driver.findElement(By.id("name_lastcon2"));
		lastName.sendKeys("lastname");
		System.out.println("Last name is entered");
		
		WebElement account_Name = driver.findElement(By.xpath("//input[@id='con4']"));
		account_Name.clear();
		account_Name.sendKeys("username");
		System.out.println("Account Name is entered");
		
		WebElement save_btn = driver.findElement(By.className("btn"));
		save_btn.click();
		System.out.println("Save button is selected");
		
		System.out.println("Testcase25 is sucessful");
		
	}
	
	public static void Testcase26() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
//		WebElement ad_btn = driver.findElement(By.xpath("//a[text = Create New View]"));
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewView.click();
		System.out.println("Create new view is selected");
		
		WebElement viewpagevalidation = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		viewpagevalidation.click();
		System.out.println("View page is displayed");
		
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.sendKeys("Normal");
		System.out.println("View Name is entered");
		
		String actualtext = viewName.getText();
		
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		viewUniqueName.sendKeys("Full view");
		System.out.println("view unique name is entered");
		
		WebElement save_btn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@title='Save']"));
		save_btn.click();
		System.out.println("Save button is selected");
		
//		WebElement viewname = driver.findElement(By.xpath("//select[@id='00Bf2000007TIjr_listSelect']"));
//		String text1 = viewname.getText();
//		
//		if (text1.contentEquals(actualtext)) 
//		{
//			System.out.println("View name is displayed");
//		}
//		else
//		{
//			System.out.println("View name is not dispalyed");
//		}
		
		WebElement contactPageVerification1 = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText1 = contactPageVerification.getText();
		String expectedtext1 = "Contacts";
		
		if (actualText1.equals(expectedtext1)) 
		{
			System.out.println("Test: Pass " + expectedtext1 + "  is same as " + actualText1 );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext1 + "  is not same as " + actualText1 );
		}
		
		
		System.out.println("testcase26 sucessful");
	}
	
	public static void Testcase27() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
//		WebElement ad_btn = driver.findElement(By.xpath("//a[text = Create New View]"));
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
//		dropdown.deselectByVisibleText("Recently Created");
//		System.out.println("Recently viewed is selected from the dropdown");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		dropdown.click();
		System.out.println("dropdown is selected");
		
		WebElement choose = driver.findElement(By.xpath("//option[@value='2']"));
		choose.click();
		System.out.println("recently created option is selected");
		
		
//		WebElement verification = (driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
//		String dropdowntext = verification.getText();
//		System.out.println(dropdowntext);
//		String expecteddropdowntex = "Recently Created";
//		
//		if (dropdowntext.contentEquals(expecteddropdowntex))
//		{
//			System.out.println("Test: Pass");
//		}
//		else
//		{
//			System.out.println("Test: Fail");
//		}
		
		//working on step3 validation
		
		System.out.println("Testcase27 is sucessful");
	}
	
	public static void Testcase28() throws InterruptedException
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
				
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		System.out.println("Testcase28 is sucessful");
		

	}
	
	public static void Testcase29() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement name = driver.findElement(By.xpath("//tbody//tr[3]//th[1]"));
		name.click();
		System.out.println("contact name is selected");
		
//		WebElement fr = driver.findElement(By.className("bPageBlock brandSecondaryBrd secondaryPalette"));
//		driver.switchTo().frame("fr");
		
		WebElement title = driver.findElement(By.xpath("//h2[@class='topName']"));
		String actualname = title.getText();
		String expectedname = "Indian Global Media";
	
		if (expectedname.contentEquals(actualname))
		{
			System.out.println("Test: Pass");
		}
		else
		{
			System.out.println("Test: Fail");
		}
		System.out.println("Testcase29 is sucessful");
	}
	
	public static void Testcase30() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewView.click();
		System.out.println("Create new view is selected");
		
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		viewUniqueName.sendKeys("HIJK");
		System.out.println("View Unique Name is entered");
		
		WebElement save_btn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@title='Save']"));
		save_btn.click();
		System.out.println("Save button is selected");
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='requiredInput']//div[@class='errorMsg']"));
		String actualErrorText = errorMessage.getText();
		String ExpectedErrorText = "Error: You must enter a value";
		
		if (actualErrorText.contentEquals(ExpectedErrorText))
		{
			System.out.println("Test: Pass " + ExpectedErrorText + " is same as " + actualErrorText);
		}
		else
		{
			System.out.println("Test: Fail " + ExpectedErrorText + " is not same as " + actualErrorText);
		}
		
		System.out.println("Testcase30 sucessful");
		
		
	}
	
	public static void Testcase31() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewView.click();
		System.out.println("Create new view is selected");
		
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.sendKeys("ABCD");
		System.out.println("View name is entered");
		
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		viewUniqueName.sendKeys("EFGH");
		System.out.println("View unique name is entered");
		
		WebElement cancelBtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@title='Cancel']"));
		cancelBtn.click();
		System.out.println("Cancel button is selected");
		
		WebElement check = driver.findElement(By.xpath("//select[@id='fcf']"));
		String ActualText = check.getText();
		String Expectedtext = "EFGH";
		
		if (ActualText.contentEquals(Expectedtext))
		{
			System.out.println("Test: Fail " + "contact created upon cancel button");
		}
		else
		{
			System.out.println("Test: Pass " + "contact is not created upon cancel button");
		}
		
		System.out.println("Testcase31 is sucessful");
	}
	
	public static void Testcase32() throws InterruptedException
	{
		WebDriver driver = launchDriver();
		
//		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		System.out.println("contactTab is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement contactPageVerification = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualText = contactPageVerification.getText();
		String expectedtext = "Contacts";
		
		if (actualText.equals(expectedtext)) 
		{
			System.out.println("Test: Pass " + expectedtext + "  is same as " + actualText );
		}
		else
		{
			System.out.println("Test: Fail " + expectedtext + "  is not same as " + actualText );
		}
		
		WebElement newButton = driver.findElement(By.xpath("//input[@title='New']"));
		newButton.click();
		System.out.println("New option is selected");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		lastName.sendKeys("USAA");
		System.out.println("lastname is entered");
		
		WebElement accountName = driver.findElement(By.xpath("//input[@id='con4']"));
		accountName.sendKeys("Global Market");
		System.out.println("Account Name is entered");
		
		WebElement saveNew = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']"));
		saveNew.click();
		System.out.println("Save and New option is selected");
		
		WebElement lastName1 = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		String ActualText= lastName1.getText();
		String ExpectedText = "";
		
		if (ActualText.contentEquals(ExpectedText))
		{
			System.out.println("Test: Pass " + "Entered info is saved and new page is opened");
		}
		else
		{
			System.out.println("Test: Fail " + "Entered info is not saved and new page is not opened");
		}
		
		System.out.println("Testcase32 sucessful");

		
		
	}

}



