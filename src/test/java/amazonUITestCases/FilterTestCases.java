package amazonUITestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

public class FilterTestCases {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

		ElementUtil eutil = new ElementUtil(driver);
		
		// TC - 30 : Search for a product, enter the price filters and click on the search result
		//to navigate to the product page
		
//		By search = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.xpath("(//div[text()='asus zenfone max pro m2 mobile'])[1]");
//		By searchResult = By.xpath("//div//span[@data-component-type='s-search-results']/div//h2//a//span[contains(text(),'Asus Zenfone Max Pro M2')]");
//		By minPrice = By.xpath("//form//input[@id='low-price']");
//		By maxPrice = By.xpath("//form//input[@id='high-price']");
//		By go = By.xpath("//form//span//input[@class='a-button-input']");
		
		
//		eutil.search(search, "asus zenfone max pro m2 mobile", "asus zenfone max pro m2 mobile", suggs);
//		Thread.sleep(3000);
//		eutil.doSendKeys(minPrice, "5000");
//		eutil.doSendKeys(maxPrice, "10000");
//		driver.findElement(go).click();
//		Thread.sleep(3000);
//		driver.findElement(searchResult).click();
		
//		eutil.selectTheSearchResultUsingPriceFilters(search, "asus zenfone max pro m2 mobile", "asus zenfone max pro m2 mobile", suggs, searchResult, minPrice, maxPrice, go);

		
		// TC - 31 : Search for a product, select the brand filters and click on the search result
		//to navigate to the product page
		
//		By searchbar = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.xpath("//div[@aria-label='smartphone']");
//		By brandSeeMore = By.xpath("//span[text()='See more']/parent::a[@aria-label='See more, Brand']");
//		By searchResult = By.xpath("//span[contains(text(),'Redmi 11 Prime 5G (Thunder Black, 6GB RAM, 128GB Storage)')]/parent::a[@class]");
//		By brand = By.xpath("//li[@id='p_89/Redmi']//input[@type='checkbox']/following-sibling::i");
		
//		eutil.search(searchbar, "smartphone", "smartphone", suggs);
//		Thread.sleep(5000);
//		driver.findElement(brandSeeMore).click();
//		Thread.sleep(8000);
//		driver.findElement(brand).click();
//		Thread.sleep(5000);
//		driver.findElement(searchResult).click();
		
//		eutil.selectTheSearchResultByBrand(searchbar, "smartphone", "smartphone", suggs, searchResult, brandSeeMore, brand);
		
		
		
		
		
		
		// ------------------------
		Thread.sleep(30000);
		brUtil.quitBrowser();
		// ------------------------
	}

	
}
