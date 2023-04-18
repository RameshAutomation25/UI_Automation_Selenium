package otherImportantTestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
//		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.get("https://classic.freecrm.com/");
		
//		clickCheckBox("Garry.White");
//		List<String> userDetails = getUserDetails("Garry.White");
//		System.out.println(userDetails);
		
		By username = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@name='password']");
		By login = By.xpath("//input[@value='Login']");
//		By contact = By.xpath("//div[@id='navmenu']//a[text()='Contacts']/parent::li/ul");
//		By checkbox = By.xpath(null);
		
		clickCheckBoxContactName(username, password, login, "Ali khan");
		
		
		
		System.out.println("-------------------------------------------------");
		
		Thread.sleep(30000);
		driver.quit();
	}
	
	
	public static void clickCheckBox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static void clickCheckBoxContactName(By username, By password, By login, String userName) throws InterruptedException {
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(username).sendKeys("newautomation");
		driver.findElement(password).sendKeys("Selenium@12345");
		driver.findElement(login).click();
		Thread.sleep(5000);
		driver.navigate().to("https://classic.freecrm.com/index.cfm?CFID=690357&CFTOKEN=98647170&jsessionid=b6307458c490393bd7902a6c6b2e346f1e35");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getUserDetails(String userName) {
		List<WebElement> userInfo = 
				driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userInfoList = new ArrayList<String>();
		for(WebElement e : userInfo) {
			String text = e.getText();
			userInfoList.add(text);
		}
		return userInfoList;
	}
}
