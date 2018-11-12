package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReusableMethods {
	
	public static WebDriver driver;
	
	
	/* Name of the Method: LaunchBowser with the given website
	 * Brief Description: FirefoxBrowser opens with Salesforce login page
	 * Arguments: Not required
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void launchSFDC ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}
	
	/* Name of the Method: TextBox Method
	 * Brief Description: Check if text box is present if enabled to send data
	 * Arguments: obj --> Webelement object, value--> object Value, objName-->information
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void textbox (WebElement obj, String value, String objName )
	{
		if (obj.isDisplayed())
		{
			obj.sendKeys("value");
			System.out.println("Pass:" + value + " is entered in "+ objName + " field");
		}
		else
		{
			System.out.println("Fail: " + objName + " object does not exist in the application");
		}
	}
	
	/* Name of the Method: Click operation Method
	 * Brief Description: Performs click operation on selected object
	 * Arguments: obj --> Webelement object,objName-->information
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void click (WebElement obj, String objName)
	{
		if (obj.isDisplayed())
		{
			obj.click();
			System.out.println("Pass: " + obj + " is selected");
		}
		else
		{
			System.out.println("Fail:" + obj + " is not present");
		}
	}
	
	/* Name of the Method: Radio button select and deselect
	 * Brief Description: If radio button is selected not to any thing, if not check the radio button
	 * Arguments: obj --> Webelement object, objName-->information
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void radiobuttonSelectDeselect (WebElement obj, String objName)
	{
		if (obj.isDisplayed())
		{
			if (obj.isSelected())
			{
				System.out.println("Pass: " + objName + " is selected");
			}
			else
			{
				obj.click();
				System.out.println("Pass: " +"previoulsy it is not selected " + 
						objName + "now it is selected");
			}
		}
			else
			{
				System.out.println("Fail: " + objName + " object does not exist, check yourapplication");
			}
	}
	
	/* Name of the Method: Clear Method
	 * Brief Description: Erases the data at a given location
	 * Arguments: obj --> Webelement object, value--> object Value, objName-->information
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void clear (WebElement obj)
	{
		obj.clear();
	}
	
	/* Name of the Method: Switch to Alert and accept Method
	 * Brief Description: Alert windows pops up, ok is seleced
	 * Arguments: obj --> Not Required
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void adwindow()
	{
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
	}
	
	/* Name of the Method: String equal or not method
	 * Brief Description: Check if both the strings contents equal or not
	 * Arguments: obj --> Not Required
	 * Created By: sindhuqa
	 * Creation Date: 8/23/2018
	 * Last Modified: 8/23/2018
	 * Modified By: sindhuqa */
	
	public static void equalOrNot(String actualvalue, String expectedvalue)
	{
		if (actualvalue.contentEquals(expectedvalue))
		{
			System.out.println("Test: Pass" + actualvalue + " contents and "+ expectedvalue + " are same" );
		}
		else
		{
			System.out.println("Test: Fail" + actualvalue + " contents and "+ expectedvalue + " are not same");
		}
	}

}
