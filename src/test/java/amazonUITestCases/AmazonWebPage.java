package amazonUITestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

public class AmazonWebPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

		ElementUtil eutil = new ElementUtil(driver);

		// TC - 1 : Checking whether is logo is displayed
//		By logoimg = By.xpath("//div[@id='nav-logo']/a");
//
//		boolean displayed = eutil.isElementDisplayed(logoimg);
//		System.out.println(displayed+" Logo is displayed");

		// TC - 2 : Verify the location icon is displayed in the header section
//		By locimg = By.id("nav-packard-glow-loc-icon");
//
//		boolean locIcon = eutil.isElementDisplayed(locimg);
//		System.out.println(locIcon+" Global location icon is displayed");
		
		//TC - 3 : Verify the default search drop down text is id
//		By searchDropDown = By.xpath("//div//span[@id='nav-search-label-id']");
//		String elementText = eutil.doGetElementText(searchDropDown);
//		brUtil.validateValues(elementText, "All");
		
		//TC - 4 : Get all the All Drop down Values in the header
//		By dropdownValues = By.id("searchDropdownBox");
//		List<String> dropdownOptions = eutil.getAllDropDownOptions(dropdownValues);
//		int count = 1;
//		for(String e : dropdownOptions) {
//			System.out.println(count +" : "+ e);
//			count++;
//		}
		
		
		//TC - 5 : Get the All drop down values count
//		By dropdownValues = By.id("searchDropdownBox");
//		int valuesCount = eutil.getDropDownValuesCount(dropdownValues);
//		System.out.println(valuesCount);

		
		//TC - 6 : Verify search bar is displayed on webpage
//		By search = By.id("twotabsearchtextbox");
//		eutil.isElementDisplayed(search);
//		System.out.println(search+" Search bar is displayed");
		
		
		//TC - 7 : verify 11 or less search suggestions are shown on searching for any product
//		By search = By.id("twotabsearchtextbox");
//		By suggestions = 
//				By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']");
//		
//		eutil.getSearchSuggestionsCount(search, "table", suggestions);
		
		
		//TC - 8 : Verify the user is able to search and click on asus rog phone
		
//		By search = By.id("twotabsearchtextbox");
//		By phone = 
//					By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']");
		
//		List<String> searchSuggList = eutil.getSearchSuggestions(search, "asus", phone);
//		for(String e : searchSuggList) {
//			System.out.println(e);
//		}
		
		
		
		//TC - 9 : Verify the user is able to search and click on the search suggestions
//		By search = By.id("twotabsearchtextbox");
//		By phone = 
//					By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']");
//		eutil.search(search, "asus", "asus rog phone", phone);
		
		
		
		
		
		
		
		
		
		//------------------------
		Thread.sleep(30000);
		brUtil.quitBrowser();
		//------------------------

	}

}
