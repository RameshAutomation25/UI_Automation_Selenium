package otherImportantTestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleConcept {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");

		Thread.sleep(4000);

		By username = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@name='password']");
		By login = By.xpath("//input[@value='Login']");

		driver.findElement(username).sendKeys("newautomation");
		driver.findElement(password).sendKeys("Selenium@12345");
		Thread.sleep(4000);
		driver.findElement(login).click();

		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		Thread.sleep(4000);
//		
//		selectContact("Ali khan");
//		selectContact("deepti gupta");

//		selectMultipleContacts("Ali khan");

//		String compName = getContactCompanyName("deepti gupta");
//		System.out.println(compName);
		
		
//		String company = getContactCompanyName("Abel Kainan");
//		System.out.println(company);
//		
//		String number = getContactPhone("Abel Kainan");
//		System.out.println(number);
//		
//		String homeNumber = getContactHomePhone("Abel Kainan");
//		System.out.println(homeNumber);
//		
//		
//		String email = getContactEmail("Abel Kainan");
//		System.out.println(email);
		
		
		
		List<String> contactInfo = getContactAllInfo("Abel Kainan");
		System.out.println(contactInfo);
		
		
		

		System.out.println("--------------------------------");
		Thread.sleep(30000);
		driver.quit();
	}

	public static void selectContact(String contactName) {
		driver.findElement(
				By.xpath("//a[text()='" + contactName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static void selectMultipleContacts(String contactName) {
		List<WebElement> contactsCheck = driver.findElements(
				By.xpath("//a[text()='" + contactName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : contactsCheck) {
			e.click();
		}
	}

	public static String getContactCompanyName(String contactName) {
		return driver
				.findElement(By
						.xpath("//a[text()='" + contactName + "']/parent::td/following-sibling::td/a[@context='company']"))
				.getText();
	}

	public static String getContactPhone(String contactName) {
		return driver.
			findElement(By.xpath("(//a[text()='"+contactName+"']/parent::td/following-sibling::td/span[@context='phone'])[1]"))
				.getText();
	}

	public static String getContactHomePhone(String contactName) {
		return driver.
				findElement(By.xpath("(//a[text()='"+contactName+"']/parent::td/following-sibling::td/span[@context='phone'])[2]"))
					.getText();
	}

	public static String getContactEmail(String contactName) {
		return driver.
				findElement(By.xpath("//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[text()='abel@atlassian.com']"))
					.getText();
	}
	
	public static List<String> getContactAllInfo(String contactName) {
		List<WebElement> infoList = driver.findElements(By.xpath("//a[text()='"+contactName+"']/parent::td//following-sibling::td"));
		List<String> infoValuesList = new ArrayList<String>();
		for (WebElement e : infoList) {
			String text = e.getText();
			infoValuesList.add(text);
		}
		return infoValuesList;
	}
}
