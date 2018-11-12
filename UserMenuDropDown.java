package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMenuDropDown {

	public static void main(String[] args) throws InterruptedException {
//		
//		launchDriver();
//		ValidUserIdPwd();
		
//		Testcase5();
//		Testcase6();
//		Testcase7();
//		Testcase8();
//		Testcase9();

	}
	
	public static WebDriver launchDriver() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
	
	public static void Testcase5() throws InterruptedException
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
		username.sendKeys("user13@gmail.com");
		System.out.println("Username entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("password");
		System.out.println("Password entered");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@id='Login']"));
		login_btn.click();
		System.out.println("login button is selected");
		System.out.println("Login sucessfull with valid username and valid password");
					
		WebElement customerName = driver.findElement(By.id("userNavButton"));
		customerName.click();
		System.out.println("customer name is selected");

		WebElement dropdown = driver.findElement(By.xpath("//a[@title='Logout']"));
		dropdown.click();
		System.out.println("logout performed sucessfully");
		
		
		System.out.println("Testcase5 is sucessfull");
	}
	
	public static void Testcase6() throws InterruptedException
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
		
		
		WebElement FullName = driver.findElement(By.xpath(" //span[@id='userNavLabel']"));
		FullName.click();
		System.out.println("Full name is selected");
		
		WebElement Profile_option = driver.findElement(By.xpath("//a[@title='My Profile']"));
		Profile_option.click();
		System.out.println("Profile option is selected");
		
		WebElement edit_img = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
		edit_img.click();
		System.out.println("Edit option is selected");
		
//		WebElement popup_window = driver.findElement(By.xpath("/html"));
		
		WebElement popup_window = driver.findElement(By.xpath("//div[@id='contactInfoContent']"));
		popup_window.click();
		System.out.println("pop up window is clicked");
		
		driver.switchTo().frame("contactInfoContentId");
		
		WebElement aboutTab = driver.findElement(By.id("aboutTab"));
		aboutTab.click();
		System.out.println("about tab is selected");
		
		WebElement lastname = driver.findElement(By.id(("lastName")));
		lastname.clear();
		lastname.sendKeys("Abcd");
		System.out.println("last name is edited");
		
		WebElement saveAll = driver.findElement(By.cssSelector("input.zen-btn:nth-child(1)"));
		saveAll.click();
		System.out.println("Save button is selected");
		
//		WebElement post_option = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
//		post_option.click();
//		System.out.println("post link is selected");
		
//		WebElement frame = driver.findElement(By.tagName("iframe"));
//		 driver.switchTo().frame(frame);
//		 System.out.println("Switched to frame" + frame);
//		 
//		 WebDriverWait wait = new WebDriverWait(driver, 40);
//		 WebElement messagebox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
//		 messagebox.click();
//		 System.out.println("Msg box clicked");
//		 Thread.sleep(3000);
//		 new Actions(driver).sendKeys("Hello This is a message to post").perform();
//	
//		WebElement share_Btn = driver.findElement(By.id("publishersharebutton"));
//		share_Btn.click();
//		System.out.println("share button is selected");
		
		WebElement file_option = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		file_option.click();
		System.out.println("File option is selected");
		
		WebElement upload_btn_computer = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		upload_btn_computer.click();
		System.out.println("upload form computer button is selected");
		
//		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
//		chooseFile.click();
//		System.out.println("Choose file is selected");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		chooseFile.sendKeys("C:\\Users\\Desktop\\sunset.jpg");
		
		WebElement share_btn = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		share_btn.click();
		System.out.println("Share button is selected");
		
		WebElement add_photo = driver.findElement(By.id("displayBadge"));
		add_photo.click();
		System.out.println("Add photo text is selected");
		
		WebElement chooseFile1 = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		chooseFile1.click();
		System.out.println("Choose file1 selected");
		
		chooseFile1.sendKeys("C:\\Users\\Desktop");
		
		//crop image code type here
	
		}
	
	public static void Testcase8() throws InterruptedException
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
		
		WebElement customerName = driver.findElement(By.id("userNavButton"));
		customerName.click();
		System.out.println("Full name is selected on the page");
		
		WebElement developerConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		developerConsole.click();
		System.out.println("developer console is selected");
		
		//developer console window close code not completed
	}
	
	public static void Testcase9() throws InterruptedException
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
			
		
		WebElement customerName = driver.findElement(By.id("userNavButton"));
		customerName.click();
		System.out.println("Full name is selected on the page");

		WebElement dropdown = driver.findElement(By.xpath("//a[@title='Logout']"));
		dropdown.click();
		System.out.println("logout performed sucessfully");
		
		WebElement correctpage = driver.findElement(By.id("Login"));
		correctpage.click();
		System.out.println("Test:Pass");
	
		System.out.println("Tesecase9 sucessful");
		
	}
	
	public static void Testcase7() throws InterruptedException
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
		
		WebElement customerName = driver.findElement(By.id("userNavButton"));
		customerName.click();
		System.out.println("Full name is selected on the page");

		WebElement dropdown = driver.findElement(By.xpath("//a[@title='My Settings']"));
		dropdown.click();
		System.out.println("Mysetting option selected");
		
		WebElement personalLink = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		personalLink.click();
		System.out.println("Personal link selected");
		
		WebElement loginHistory = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		loginHistory.click();
		System.out.println("login history option is selected");
		
		WebElement downloadLoginHistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		downloadLoginHistory.click();
		System.out.println("download is selected");
		
		WebElement displayLayout = driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
		displayLayout.click();
		System.out.println("Display Layout is selected from the left panel");
		
		WebElement customizeMyTab = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		customizeMyTab.click();
		System.out.println("customize my tab option is selected");
		
		Select customApp = new Select(driver.findElement(By.xpath("//select[@id='p4']")));
		((WebElement) customApp).click();
		customApp.selectByVisibleText("Salesforce Chatter");
		System.out.println("salesforce chatter is selected under custom app");
		
		WebElement reportTab = driver.findElement(By.xpath("//option[@value='report']"));
		reportTab.click();
		System.out.println("reports tab is selected");
		
		WebElement AddBtn = driver.findElement(By.xpath("//img[@title='Add']"));
		AddBtn.click();
		System.out.println("Add button is selected");
		
		WebElement emailLink = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		emailLink.click();
		System.out.println("Email link is selected");
		
		WebElement emailSetting = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		emailSetting.click();
		System.out.println("Emailsetting is selected");
		
		WebElement EmailName = driver.findElement(By.xpath("//input[@id='sender_name']"));
		EmailName.clear();
		EmailName.sendKeys("User");
		System.out.println("Email name is entered");
		
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@id='sender_email']"));
		EmailAddress.clear();
		EmailAddress.sendKeys("user@gmail.com");
		System.out.println("Email address is entered");
		
		WebElement AutomaticBCC = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		AutomaticBCC.click();
		System.out.println("radio button is selected");
		
		WebElement saveBtn = driver.findElement(By.xpath("//input[@title='Save']"));
		saveBtn.click();
		System.out.println("Save button is selected");
		
		WebElement calenderRemainders = driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']]"));
		calenderRemainders.click();
		System.out.println("calender and Remainders button is selected");
		
		WebElement ActivityRemainders = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		ActivityRemainders .click();
		System.out.println("Activity Remainders is selected");
		
		// I did not find the remainder alert button to perform final operation
		
		System.out.println("Testcase7 sucessful");
	
	}

}
