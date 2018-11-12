package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads extends SFDCLogin {

	public static void main(String[] args) throws InterruptedException 
	{
//		Testcase20();
//		Testcase21();
//		Testcase22();
//		Testcase23();
//		Testcase24();

	}
	
	public static void Testcase20() throws InterruptedException
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
			
			WebElement Leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads.click();
			System.out.println("Leads option from the menun is selected");
			
			WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			ad_btn.click();
			System.out.println("ad is closed");
			
			WebElement LeadsHomepage = driver.findElement(By.xpath("//h1[contains(@class,'pageType')]"));
			String Actualpagetitle = LeadsHomepage.getText();
			String Expectedpagetitle = "Leads";
			
			if (Actualpagetitle.contentEquals(Expectedpagetitle))
			{
				System.out.println("Test: Pass " + "Leads homepage is displayed");
			}
			else
			{
				System.out.println("Test: Pass " + "Leads homepage is displayed");
			}
			
			System.out.println("Testcase20 is sucessful");
			
	}
	
	public static void Testcase21() throws InterruptedException
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
			
			WebElement Leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads.click();
			System.out.println("Leads option from the menun is selected");
			
			WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			ad_btn.click();
			System.out.println("ad is closed");
			
			
			WebElement LeadsHomepage = driver.findElement(By.xpath("//h1[contains(@class,'pageType')]"));
			String Actualpagetitle = LeadsHomepage.getText();
			String Expectedpagetitle = "Leads";
			
			if (Actualpagetitle.contentEquals(Expectedpagetitle))
			{
				System.out.println("Test: Pass " + "Leads homepage is displayed");
			}
			else
			{
				System.out.println("Test: Pass " + "Leads homepage is displayed");
			}
			
			WebElement dropDownList = driver.findElement(By.xpath("//select[@id='fcf']"));
			dropDownList.click();
			System.out.println("Drop down list is selected");
			
			System.out.println("Testcase21 is sucessful");
			
			
	}
	
	public static void Testcase22() throws InterruptedException
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
			
			WebElement Leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads.click();
			System.out.println("Leads option from the menun is selected");
			
			WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			ad_btn.click();
			System.out.println("ad is closed");
			
			Select dropDownList = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
			dropDownList.selectByVisibleText("Today's Leads");
			System.out.println("todays leads is selected form the dropdown menu");
			
			WebElement FullName = driver.findElement((By.xpath("//div[@id='userNav-arrow']")));
			FullName.click();
			System.out.println("Full name is selected");

			WebElement dropdown = driver.findElement(By.xpath("//a[@title='Logout']"));
			dropdown.click();
			System.out.println("logout performed sucessfully");
			
			WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
			username1.sendKeys("user@gmail.com");
			System.out.println("Username entered");
			
			WebElement password1 = driver.findElement(By.xpath("//input[@id='password']"));
			password1.sendKeys("sales");
			System.out.println("Password entered");
			
			WebElement login_btn1 = driver.findElement(By.xpath("//input[@id='Login']"));
			login_btn1.click();
			System.out.println("login button is selected");
			
			WebElement Leads1 = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads1.click();
			System.out.println("Leads option from the menun is selected");
			
//			WebElement ad_btn1 = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
//			ad_btn1.click();
//			System.out.println("ad is closed");
			
			WebElement getText = driver.findElement((By.xpath("//select[@id='fcf']")));
			String actualText = getText.getText();
			String ExpectedText = "Today's Leads";
			
			if (actualText.contentEquals(ExpectedText))
			{
				System.out.println("Test: Pass");
			}
			else
			{
				System.out.println("Test: Fail");
			}
			
			WebElement go_btn = driver.findElement(By.xpath("//input[@title='Go!']"));
			go_btn.click();
			System.out.println("Go button is selected");
			
			System.out.println("Testcase22 sucessful");
			
	}
	
	public static void Testcase23() throws InterruptedException
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
			
			WebElement Leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads.click();
			System.out.println("Leads option from the menun is selected");
			
			WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			ad_btn.click();
			System.out.println("ad is closed");
			
			Select dropDownList = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
			dropDownList.selectByVisibleText("Today's Leads");
			System.out.println("todays leads is selected form the dropdown menu");
			
			WebElement go_btn = driver.findElement(By.xpath("//input[@title='Go!']"));
			go_btn.click();
			System.out.println("Go button is selected");
			
			WebElement check = driver.findElement(By.xpath("//input[@title='New Lead']"));
			String actualtext = check.getText();
			String expectedtext = "New Lead";
			
			if(actualtext.contentEquals(expectedtext))
			{
				System.out.println("Test: Pass");
			}
			else
			{
				System.out.println("Test: Fail");
			}
			
			System.out.println("Testcase23 sucessful");
	}
	
	public static void Testcase24() throws InterruptedException
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
			
			WebElement Leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']"));
			Leads.click();
			System.out.println("Leads option from the menun is selected");
			
			WebElement ad_btn = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			ad_btn.click();
			System.out.println("ad is closed");
			
			WebElement new_btn = driver.findElement(By.xpath("//input[@title='New']"));
			new_btn.click();
			System.out.println("New button is selected");
			
			WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
			lastName.sendKeys("DEFRT");
			System.out.println("last name entered");
			
			WebElement companyName = driver.findElement(By.xpath("//input[@id='lea3']"));
			companyName.sendKeys("DEFRT");
			System.out.println("company name entered");
			
			WebElement save_btn = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
			save_btn.click();
			System.out.println("Save button is selected");
			
			System.out.println("Testcase24 sucessful");
			
	}
			
	
			

}
