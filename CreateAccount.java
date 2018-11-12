package selenium;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends SFDCLogin {

	public static void main(String[] args) throws InterruptedException 
	{
//		launchDriver();
		
//		Testcase10();
//		Testcase11();
//		Testcase12();
//		Testcase13(); 
//		Testcase14();

	}
	public static void Testcase10() throws InterruptedException
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
		
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		Accounts.click();
		System.out.println("Accounts option is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement New_btn = driver.findElement(By.xpath("//input[contains(@title,'New')]"));
		New_btn.click();
		System.out.println("New button is selected");
		
		WebElement AccountName = driver.findElement(By.xpath("//input[@id='acc2']"));
		AccountName.sendKeys("Account Name");
		System.out.println("Account name is entered");
		
		WebElement save_btn = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		save_btn.click();
		System.out.println("Save button is selected");
		
		WebElement checkName = driver.findElement(By.xpath("//h2[@class='topName']"));
		String ActualName = checkName.getText();
		String ExpectedName = "Sri Ram";	
		
		if (ActualName.contentEquals(ExpectedName))
		{
			System.out.println("Test: Pass " + "Account with " + 
					ExpectedName + " name is created and mathch with "+ ActualName);
			
		}
		else
		{
			System.out.println("Test: Fail " + "Account with " + ExpectedName +
					" name is not created with "+ ActualName);

		}
	}
	
	public static void Testcase11() throws InterruptedException
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
	
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		Accounts.click();
		System.out.println("Accounts option is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement AccountPageValidation = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualpage = AccountPageValidation.getText();
		String expectedpage = "Accounts";
		
		if (actualpage.contentEquals(expectedpage))
		{
			System.out.println("Accounts page is displayed");
		}
		else
		{
			System.out.println("Accounts page is not displayed");
		}
		
		
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewView.click();
		System.out.println("Create New view button is selected");
		
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.sendKeys("SampleTest8");
		System.out.println("View Name is entered");
		
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		viewUniqueName.sendKeys("SammpleUniqueName8");
		System.out.println("View unique Name is entered");
		
		WebElement save_btn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@title='Save']"));
		save_btn.click();
		System.out.println("Save button is selected");
		
//		Select checkAccount = new Select(driver.findElement(By.id("00Bf200000B8nwi_listSelect")));
//		checkAccount.selectByVisibleText("ViewName6");
//		System.out.println("Account created sucessful with the given name");

		
		WebElement checkAccount = driver.findElement(By.xpath("//select[@class='title']//*[contains(text(),\"SampleTest8\")]"));
		checkAccount.click();
		System.out.println("New view added is displayed on the list");
		
		System.out.println("Testcase11 sucessful");
		
	}
	
	public static void Testcase12() throws InterruptedException
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
		
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		Accounts.click();
		System.out.println("Accounts option is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement AccountPageValidation = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualpage = AccountPageValidation.getText();
		String expectedpage = "Accounts";
		
		if (actualpage.contentEquals(expectedpage))
		{
			System.out.println("Accounts page is displayed");
		}
		else
		{
			System.out.println("Accounts page is not displayed");
		}
//		
//		Select Name = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
//		((WebElement) Name).click();
//		Name.selectByVisibleText("ViewName6");
		
//		WebElement viewPage = driver.findElement(By.xpath("//select[@id='fcf']"));
//		String viewpagetext = viewPage.getText();

		WebElement Name = driver.findElement(By.xpath("//select[@id='fcf']"));
		Name.click();
		System.out.println("view Name is selected");
		
		WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[1]"));
		edit.click();
		System.out.println("Edit is selected");
		
		WebElement viewPageValidation = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		String expectedtext1 = "Accounts: Edit View ~ Salesforce - Developer Edition";
		String actualtext1 = "";
		
		actualtext1 = driver.getTitle();
		System.out.println(actualtext1);
		
		
		if (actualtext1.contentEquals(expectedtext1))
		{
			System.out.println("View Page is displayed");
		}
		else
		{
			System.out.println("View page is not displayed");
		}
		

		
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.clear();
		viewName.sendKeys("edited1");
		System.out.println("View name is entered");
		
		WebElement viewuniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		viewuniqueName.clear();
		viewuniqueName.sendKeys("edited1");
		System.out.println("View unique name is entered");
		
		Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
//		((WebElement) operator).click();
		operator.selectByVisibleText("contains");
		System.out.println("operator is entered");
//		
//		WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
//		operator.click();
//		System.out.println("operator is entered");
		
		
		
		
		Select Field = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
//		((WebElement) Field).click();
		Field.selectByVisibleText("Account Name");
		System.out.println("field is entered");
		
		WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
		value.sendKeys("<a>");
		System.out.println("value is entered");
		
		WebElement lastActivity = driver.findElement(By.xpath("//select[@id='colselector_select_0']//option[@value='ACCOUNT.LAST_ACTIVITY'][contains(text(),'Last Activity')]"));
		lastActivity.click();
		System.out.println("last Activity is selected");
		
		WebElement add_btn = driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"));
		add_btn.click();
		System.out.println("Add button is selected");

		WebElement save_btn = driver.findElement((By.xpath("//div[@class='pbHeader']//input[@title='Save']")));
		save_btn.click();
		System.out.println("Save button is selected");
		
//		Validation not done : View page with <new view name> in the drop down is displayed. 
//		View will have Last activity column added and the data of the list will have 
//		all account names which has <a> in the text.
		
		System.out.println("Testcase12 is sucessful");
		
	}
	
	public static void Testcase13() throws InterruptedException
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
		
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		Accounts.click();
		System.out.println("Accounts option is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement AccountPageValidation = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualpage = AccountPageValidation.getText();
		String expectedpage = "Accounts";
		
		if (actualpage.contentEquals(expectedpage))
		{
			System.out.println("Accounts page is displayed");
		}
		else
		{
			System.out.println("Accounts page is not displayed");
		}
		
		
		WebElement MergeAccount = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		MergeAccount.click();
		System.out.println("Merge Account option is selected");
		
		WebElement searchAccount = driver.findElement(By.xpath("//input[@id='srch']"));
		searchAccount.sendKeys("Sri Ram");
		System.out.println("Account name is entered");
		
		WebElement findAccounts = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[2]"));
		findAccounts.click();
		System.out.println("Find account is selected");
		
		// After the accounts displayed validation is not done
		
		WebElement next_btn = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']"));
		next_btn.click();
		System.out.println("Next button is selected");
		
		WebElement merge_btn = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
		merge_btn.click();
		System.out.println("Merge button is selected");
		
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		
		System.out.println("pop up window, OK option is selected");
		
		WebElement mergeAccountName = driver.findElement(By.xpath("//a[contains(text(),'Sri Ram')]"));
		mergeAccountName.click();
		System.out.println("MergeAccount Name is preset in the recent account display list");
		
		System.out.println("Testcase13 is sucessful");
		
	}
	
	
	public static void Testcase14() throws InterruptedException
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
		
		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		Accounts.click();
		System.out.println("Accounts option is selected");
		
		WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		ad_btn.click();
		System.out.println("Ad screen close button is selected");
		
		WebElement AccountPageValidation = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String actualpage = AccountPageValidation.getText();
		String expectedpage = "Accounts";
		
		if (actualpage.contentEquals(expectedpage))
		{
			System.out.println("Accounts page is displayed");
		}
		else
		{
			System.out.println("Accounts page is not displayed");
		}
		
		WebElement accountActivity = driver.findElement((By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		accountActivity.click();
		System.out.println("Account activity >30 days is selected");
		
		WebElement reportpage = driver.findElement(By.id("AppBodyHeader"));
		reportpage.click();
		System.out.println("reportpage is displayed");
		
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
		dropdown.click();
		System.out.println("Dropdown is selected");
		
		WebElement dateField =(driver.findElement(By.xpath("//div[@class='x-combo-list-item' and text()= 'Created Date']")));
		dateField.click();
		System.out.println("Date field is selected");
		
		WebElement Fromcalender = driver.findElement((By.xpath("//img[@id='ext-gen152']")));
		Fromcalender.click();
		System.out.println("From calender is selected");
		
		WebElement Fromdate = driver.findElement(By.xpath("//button[@id='ext-gen280']"));
		Fromdate.click();
		System.out.println("From date is selected");
		
		WebElement Tocalender = driver.findElement((By.xpath("//img[@id='ext-gen154']")));
		Tocalender.click();
		System.out.println("To calender is selected");
		
//		WebElement todate = driver.findElement(By.xpath("x-btn x-btn-noicon x-btn-over"));
//		todate.click();
//		System.out.println("To date is selected");
		
//		Not able to select "Today" button under "FromDate"
		
		WebElement save = driver.findElement((By.xpath("//button[@id='ext-gen49']")));
		save.click();
		System.out.println("Save button is selected");
		
		WebElement reportName = driver.findElement((By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		reportName.sendKeys("Srinivasa");
		System.out.println("report name is entered");
		
		WebElement reportName1 = driver.findElement((By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		String name = reportName1.getText();
		
		WebElement reportUniqueName = driver.findElement((By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		reportUniqueName.sendKeys("Sri Hari");
		System.out.println("reportUniqueName is entered");
		
		WebElement saveRun = driver.findElement((By.xpath("//button[@id='ext-gen313']")));
		saveRun.click();
		System.out.println("Save and run button is selected");
		
		WebElement reportNameValidation = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		String text = reportNameValidation.getText();
		String expextedtext = name;
		
		if (text.contentEquals(expextedtext))
		{
			System.out.println("Report page with details is displayed");
		}
		else
		{
			System.out.println("Report page with details is not displayed");
		}
		
		System.out.println("Testcase14 is sucessful");
		
	}
	
	
	

}
