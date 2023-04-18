package amazonUITestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ProductPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

		ElementUtil eutil = new ElementUtil(driver);

		// Tc - 29 : Search for a product, select the price range and select the search
		// result
		// And navigate to the product page

		// div//span[@data-component-type='s-search-results']/div//h2//a//span[contains(text(),'Asus
		// Zenfone Max Pro M2')]
//		By search = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.cssSelector("div[aria-label$='redmi smartphone'][role='button']");
//		By searchResult = By.xpath("//div//span[@data-component-type='s-search-results']/div//h2//a//span[contains(text(),'Redmi 11 Prime 5G')]");
//		eutil.search(search, "redmi smartphone", "redmi smartphone", suggs);
//		driver.findElement(searchResult).click();
		
		
		
		
		// TC - 32 : Check whether a searched product is in stock
		
//		By search = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.cssSelector("div[aria-label$='redmi 11 prime 5g'][role='button']");
//		By searchResult = By.xpath("//span[contains(text(),'Redmi 11 Prime 5G (Thunder Black, 4GB ')]/parent::a");
//		By stock = By.xpath("//span[@class='a-size-medium a-color-success']");
//		eutil.search(search, "redmi 11 prime 5g", "redmi 11 prime 5g", suggs);
//		Thread.sleep(5000);
//		driver.findElement(searchResult).click();
//		Thread.sleep(15000);
//		String stockStatus = driver.findElement(stock).getText();
//		Thread.sleep(15000);
//		if(stockStatus.equals("In stock")) {
//			System.out.println("The product is in stock");
//		}
//		else {
//			System.out.println("The product is NOT in stock");
//		}
		
		
		
		// TC - 33 : Get the product price from the product detail page
		
//		By title = By.xpath("//span[@id=\"productTitle\"]");
//		By price = By.xpath("(//div[@id='centerCol']//span[@aria-hidden=\"true\"])[1]");
//		
//		By search = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.cssSelector("div[aria-label$='redmi 11 prime 5g'][role='button']");
//		By searchResult = By.xpath("//span[contains(text(),'Redmi 11 Prime 5G (Thunder Black, 4GB ')]/parent::a");
//		By stock = By.xpath("//span[@class='a-size-medium a-color-success']");
//		eutil.search(search, "redmi 11 prime 5g", "redmi 11 prime 5g", suggs);
//		Thread.sleep(5000);
//		driver.findElement(searchResult).click();
//		Thread.sleep(15000);
//		String actualPrice = driver.findElement(price).getText();
//		Thread.sleep(15000);
//		System.out.println(actualPrice);
		
		
		// TC - 34 : Click on the with Exchange button in the product details page
		
		
//		By withoutExc = By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-active']");
////		By withExc = By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']");
//		
//		By search = By.xpath("//input[@id='twotabsearchtextbox']");
//		By suggs = By.cssSelector("div[aria-label$='redmi 11 prime 5g'][role='button']");
//		By searchResult = By.xpath("//span[contains(text(),'Redmi 11 Prime 5G (Thunder Black, 4GB ')]/parent::a");
//		By stock = By.xpath("//span[@class='a-size-medium a-color-success']");
//		eutil.search(search, "redmi 11 prime 5g", "redmi 11 prime 5g", suggs);
//		Thread.sleep(10000);
//		driver.findElement(searchResult).click();
//		Thread.sleep(15000);
//		WebElement without = driver.findElement(withoutExc);
//		WebElement with = driver.findElement(with(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).above(withoutExc));
//		with.click();

		// ------------------------
		Thread.sleep(30000);
		brUtil.quitBrowser();
		// ------------------------
	}

}
