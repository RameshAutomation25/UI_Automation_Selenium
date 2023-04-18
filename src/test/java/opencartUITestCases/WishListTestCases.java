package opencartUITestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

public class WishListTestCases {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");

		ElementUtil eutil = new ElementUtil(driver);
		
		
		// TC - 34 : Login to the page
		
//		By myAccount = By.xpath("//a[@title='My Account']");
//		By login = By.xpath("//a[text()='Login']");
//		By email = By.xpath("//input[@id='input-email']");
//		By password = By.xpath("//input[@id='input-password']");
//		By loginBtn = By.xpath("//input[@value='Login']");
//		
//		eutil.loginToOpenCart(myAccount, login, email, password, loginBtn, "Automation@gmail.com", "te$t@123");
		
		
		
		
		// TC - 35 : Add a product to the wishlist
		
//		By myAccount = By.xpath("//a[@title='My Account']");
//		By login = By.xpath("//a[text()='Login']");
//		By email = By.xpath("//input[@id='input-email']");
//		By password = By.xpath("//input[@id='input-password']");
//		By loginBtn = By.xpath("//input[@value='Login']");
//		By search = By.xpath("//input[@placeholder='Search']");
//		By searchBtn = By.xpath("//span[@class='input-group-btn']/button[@type='button']");
//		By wishList = By.xpath("//button[@data-original-title='Add to Wish List']");
//		
//		eutil.loginToOpenCart(myAccount, login, email, password, loginBtn, "Automation@gmail.com", "te$t@123");
//		eutil.addProductToWishList(search, "Canon EOS 5D", searchBtn, wishList);
		
		
		
		// TC - 36 : get the number of products in WishList
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//---------------------------------
		Thread.sleep(30000);
		driver.quit();
		//--------------------------------
	}

}
