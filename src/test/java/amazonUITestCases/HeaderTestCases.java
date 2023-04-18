package amazonUITestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

public class HeaderTestCases {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

		ElementUtil eutil = new ElementUtil(driver);

		// TC - 13 : Get the list of all categories in the amazon header
//		By headers = By.xpath("//div[@id='nav-xshop']//a[@class='nav-a  ']");
//		List<String> headersValues = getHeadersList(headers);
//		for (String e : headersValues) {
//			System.out.println(e);
//		}
		
		
		//TC - 14 : Click on the category in the amazon header
//		SelectHeaders(headers, "Mobiles");
		
		
		
		//TC - 15 : Get all the hamburger menu items links in the all menu
		
//		By hamburgerMenuBar = By.xpath("//a[@id='nav-hamburger-menu']");
//		By hamburgerMenus = 
//			By.xpath("//ul[@class='hmenu hmenu-translateX hmenu-visible']//li//a");
//		
//		
//		List<String> hamMenusList = getAllHamburgerMenus(hamburgerMenuBar, hamburgerMenus);
//		for (String e : hamMenusList) {
//			System.out.println(e);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		// ------------------------
		Thread.sleep(30000);
		brUtil.quitBrowser();
		// ------------------------
	}

	public static List<String> getHeadersList(By locator) {
		List<WebElement> headersList = driver.findElements(locator);
		List<String> headersValueList = new ArrayList<String>();
		for (WebElement e : headersList) {
			String text = e.getText();
			headersValueList.add(text);
		}
		return headersValueList;
	}
	
	
	
	public static void SelectHeaders(By locator, String headerText) {
		List<WebElement> headersList = driver.findElements(locator);
		for (WebElement e : headersList) {
			String text = e.getText();
				if(text.equals(headerText)) {
					e.click();
				}
		}
	}
	
	
	public static List<String> getAllHamburgerMenus(By hamMenuBar, By hamMenus) {
		driver.findElement(hamMenuBar).click();
		List<WebElement> hamMenuList = driver.findElements(hamMenus);
		List<String> hamMenuValuesList = new ArrayList<String>();
		for (WebElement e : hamMenuList) {
			String text = e.getText();
			hamMenuValuesList.add(text);
		}
		return hamMenuValuesList;
	}

}
