package amazonUITestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;
import genericUtilities.ElementUtil;

public class SignIn {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://www.amazon.in/");

		ElementUtil eutil = new ElementUtil(driver);

		// TC - 10 : Verify the user is able to sign into the application
//		By signInOption = By.xpath("//a[@id='nav-link-accountList']");
//		By emailPath = By.xpath("//input[@id='ap_email']");
//		By buttonContinue = By.xpath("//input[@id='continue']");
//		By passwordPath = By.xpath("//input[@id='ap_password']");
//		By buttonSignIn = By.xpath("//input[@id='signInSubmit']");

//		eutil.doClick(signInOption);
//		eutil.doSendKeys(emailPath, "test@gmail.com");
//		eutil.doClick(buttonContinue);
//		eutil.doSendKeys(passwordPath, "test123");
//		eutil.doClick(buttonSignIn);
//
//		eutil.doSignIn(signInOption, emailPath, buttonContinue, passwordPath, buttonSignIn, "test@gmail.com", "test123");

		
		
		
		// TC - 11 : Verify the error message is shown in entering the wrong emailid

//		By alert = By.xpath("//h4");
//		By errorMessage = By.xpath("//div/ul/li/span");
//		String expectedError = "There was a problem\r\n" + "We cannot find an account with that email address";
//		String errorMesg = eutil.invalidEmailIdError(signInOption, emailPath, buttonContinue,
//				"test@gmail.com", alert, errorMessage);
//
//		brUtil.validateValues(errorMesg, expectedError);

		
		
	
		// TC - 12 : Verify the error message is shown in entering the wrong password
		
		
		//TC - 16 : Verify the user is able to sign in from the hamburger
		
//		By hMenuLink = By.xpath("//a[@id='hmenu-customer-profile-link']");
//		By hamburgerMenuBar = By.xpath("//a[@id='nav-hamburger-menu']");
//		
//		eutil.signInFromHamburgerMenu(hMenuLink, hamburgerMenuBar, signInOption, emailPath, buttonContinue, passwordPath, buttonSignIn, "test@gmail.com", "test@123");
		
		
		// TC - 29 : Sign in from the signin link at the bottom of the page
//		By signInOption = By.xpath("//div//a[@class='action-button']/span[text()='Sign in']");
//		By emailPath = By.xpath("//input[@id='ap_email']");
//		By buttonContinue = By.xpath("//input[@id='continue']");
//		By passwordPath = By.xpath("//input[@id='ap_password']");
//		By buttonSignIn = By.xpath("//input[@id='signInSubmit']");
//		eutil.doSignIn(signInOption, emailPath, buttonContinue, passwordPath, buttonSignIn, "test@gmail.com", "test");

	}
	

}
