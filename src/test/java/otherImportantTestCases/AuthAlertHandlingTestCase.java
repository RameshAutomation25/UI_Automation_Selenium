package otherImportantTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;

public class AuthAlertHandlingTestCase {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		By wishes = By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]");
		
		String result = driver.findElement(wishes).getText();
		System.out.println(result);
		
		if(result.equals("Congratulations! You must have the proper credentials.")) {
			System.out.println("User is logged in to the application");
		}
		
		
		//In this auth alert handling we cannot switch to alert as it is not a js alert. So we need to send
		//the username and password after the // and before the base url start.
		
		
		

		// --------------------------
		Thread.sleep(30000);
		driver.quit();
		// --------------------------

	}

}
