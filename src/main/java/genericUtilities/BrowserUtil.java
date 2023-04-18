package genericUtilities;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method initialises the browser based on the given browser Possible
	 * browsers are chrome and firefox
	 * 
	 * @param browserName
	 * @return
	 */
	public WebDriver launchBrowser(String browserName) {

		System.out.println("Launching " + browserName);

		if (browserName == null) {
			System.out.println("Browser name cannot be null");
		} else if (browserName.isEmpty() || browserName.isBlank()) {
			System.out.println("Browser name cannot be blank");
		} else {
			switch (browserName.toLowerCase().trim()) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;

			default:
				System.out.println("Please enter valid Browser name");
				throw new CustomException("WRONGBROWSEREXCEPTION");
			}
		}
		return driver;
	}

	/**
	 * This method is used to launch the application URL with String URL
	 * @param url
	 */
	public void launchURL(String url) {

		if (url == null) {
			System.out.println("URL cannot be null");
			throw new CustomException("NULLURLEXCEPTION");
		} else if (url.isBlank() || url.isEmpty()) {
			System.out.println("URL cannot be blank or empty");
			throw new CustomException("BLANKURLEXCEPTION");
		} else if (url.equals(" ")) {
			System.out.println("URL cannot contain spaces only");
		} else if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("URL should contain http protocol");
		}
	}

	/**
	 * This method is used to launch the application URL with URL type of URL
	 * @param url
	 */
	public void launchURL(URL url) {

		String mainURL = String.valueOf(url);

		if (mainURL == null) {
			System.out.println("URL cannot be null");
			throw new CustomException("NULLURLEXCEPTION");
		} else if (mainURL.isBlank() || mainURL.isEmpty()) {
			System.out.println("URL cannot be blank or empty");
			throw new CustomException("BLANKURLEXCEPTION");
		} else if (mainURL.equals(" ")) {
			System.out.println("URL cannot contain spaces only");
		} else if (mainURL.contains("http")) {
			driver.get(mainURL);
		} else {
			System.out.println("URL should contain http protocol");
		}
	}

	/**
	 * This method is used to get the current Page title
	 * @param url
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	/**
	 * This method is used to get the current Page URL
	 * @param url
	 */
	public String getURL() {
		return driver.getCurrentUrl();
	}

	
	/**
	 * This method is used to close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	
	/**
	 * This method is used to quit the browser
	 * @param url
	 */
	public void quitBrowser() {
		driver.quit();
	}

	
	/**
	 * This method is used to validate the response
	 * @param url
	 */
	public void validateValues(String actResult, String expResult) {

		if (actResult.equals(expResult)) {
			System.out.println(actResult + " : is equal to Expected Result : " + expResult);
		}
		else {
			System.out.println(actResult + " : is not equal to Expected Result : " + expResult);
		}
	}

}
