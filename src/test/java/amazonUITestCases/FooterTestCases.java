package amazonUITestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import genericUtilities.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterTestCases {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

//		WebDriverManager.chromedriver().setup();

//		ElementUtil eutil = new ElementUtil(driver);

		// TC - 17 : get all the four headers in the first footer section

//		By fheaders = By.xpath("//div[@class='navFooterColHead']");
//		System.out.println(getFirstFooterHeadersText(fheaders));

		// TC - 18 : Get all the links under the first footer four headers
//		By footerLinks = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a[@class='nav_a']");
//		List<String> LinksText = getFirstFooterLinksText(footerLinks);
//		for(String e : LinksText) {
//			System.out.println(e);
//		}

		// TC - 19 : Get all the link text from a particular header
//		By footerHeader = By.xpath("(//div[@class='navFooterLinkCol navAccessibility']//ul)[1]");
//		List<String> footerLinks = getFooterLinksText(footerHeader);
//		for(String e : footerLinks) {
//			System.out.println(e);
//		}

		// TC - 19 : Verify that About us is present in the footer
//		By footerHeader = By.xpath("(//div[@class='navFooterLinkCol navAccessibility']//ul)[1]");
//		checkIfLinkTextIsPresentInFooter(footerHeader, "Careers");

		// TC - 20:
//		By countries = 
//		   By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//li//a[@class='nav_a']");
//		List<String> footerLinks = getFooterLinksText(countries);
//		for(String e : footerLinks) {
//			System.out.println(e);
//		}

		// TC - 21 : Get all the countries links
//		By countries = 
//				By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//li//a[@class='nav_a']");
//		List<String> footerLinks = getFirstFooterHeadersLinks(countries, "href");
//		for (String e : footerLinks) {
//			System.out.println(e);
//		}

		// TC - 22 : Click on the given country and navigate to respective amazon
		// location specific page
//		By countries = 
//				By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//a[@class='nav_a']");
//		selectFooter(countries, "China");

		// TC - 23 : Get the footer logo link
//		By footerLogo = By.xpath("//a[@aria-label='Amazon India Home']");
//		System.out.println(getFooterLogoLink(footerLogo, "href"));

		// TC : 24 : Verify that help is the last link in the upper footer section
//		By helpLink = By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']//a[@class='nav_a'])[last()]");
//		selectFooter(helpLink, "Help");

		// TC - 25 : Hover over the language dropdown in the footer section
//		By hoverElement = By.xpath("//a[@id='icp-touch-link-language']");
//		mouseOverAnElement(hoverElement);

		// TC - 26 : Get all the languages in the dropdown from the footer section
//		By langFooter = By.xpath("//a[@id='icp-touch-link-language']");
//		By languages = By.xpath("//label//span[@dir='ltr']");
//		List<String> languagesList = getAllLanguagesFromTheFooterDropdown(langFooter, languages);
//		for(String e : languagesList) {
//			System.out.println(e);
//		}

		// TC - 27 : Check if the Your Account is before Returns Centre

//		By yourAccount = By
//				.xpath("//div//a[text()='Returns Centre']/parent::li/preceding-sibling::li/a[text()='Your Account']");
//
//		checkThePrecedingElement(yourAccount, "Your Account");
		
		
		
		// TC - 28 : Check if Press Releases if the following element of Careers in the Footer
		
//		By press = 
//				By.xpath("//div//a[text()='Careers']/parent::li/following-sibling::li/a[text()='Press Releases']");
//		
//		checkIfFollowingElement(press, "Press Releases");
		
		
		
		
		
		
		
		
		// ------------------------
		Thread.sleep(30000);
		brUtil.quitBrowser();
		// ------------------------

	}

	public static List<String> getFirstFooterHeadersLinks(By locator, String attrName) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> footerLinksList = new ArrayList<String>();
		for (WebElement e : footerLinks) {
			String value = e.getAttribute(attrName);
			footerLinksList.add(value);
		}
		return footerLinksList;
	}

	public static List<String> getFooterLinksText(By locator) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> headersTextList = new ArrayList<String>();
		for (WebElement e : footerLinks) {
			String text = e.getText();
			headersTextList.add(text);
		}
		return headersTextList;
	}

	public static void checkIfLinkTextIsPresentInFooter(By locator, String linkText) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> footerLinksText = new ArrayList<String>();
		for (WebElement e : footerLinks) {
			String text = e.getText();
			footerLinksText.add(text);
		}
		for (String e : footerLinksText) {
			if (e.equals(linkText)) {
				System.out.println(linkText + " is present in the footer section");
			}
		}
	}

	public static void selectFooter(By locator, String linkText) throws InterruptedException {
		List<WebElement> footerText = driver.findElements(locator);
		for (WebElement e : footerText) {
			String text = e.getText();
			if (text.equals(linkText)) {
				e.click();
			}
		}
	}

	public static String getFooterLogoLink(By locator, String attrName) {
		return driver.findElement(locator).getAttribute(attrName);
	}

	public static void mouseOverAnElement(By locator) {
		WebElement hoverable = driver.findElement(locator);
		new Actions(driver).moveToElement(hoverable).perform();
	}

	public static List<String> getAllLanguagesFromTheFooterDropdown(By langLocator, By languages) {
		driver.findElement(langLocator).click();
		List<WebElement> langLinks = driver.findElements(languages);
		List<String> lanList = new ArrayList<String>();
		for (WebElement e : langLinks) {
			String text = e.getText();
			lanList.add(text);
		}
		return lanList;
	}

	public static void checkIfPrecedingElement(By locator, String linkText) {
		String text = driver.findElement(locator).getText();

		if (text.equals(linkText)) {
			System.out.println(linkText + " is the preceding element of Return Centre");
		}
	}
	
	
	
	public static void checkIfFollowingElement(By locator, String linkText) {
		String text = driver.findElement(locator).getText();

		if (text.equals(linkText)) {
			System.out.println(linkText + " is the following element of Return Centre");
		}
	}

}
