package otherImportantTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.BrowserUtil;

public class AlertHandlingTestCases {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://the-internet.herokuapp.com/javascript_alerts");

//		ElementUtil eutil = new ElementUtil(driver);
		
		
		//1 . Handling Alert
		
		/*
		By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
		By result = By.xpath("//p[@id='result']");

		driver.findElement(jsAlert).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		String resultText = driver.findElement(result).getText();
		System.out.println(resultText);
		
		if(resultText.equals("You successfully clicked an alert")) {
			System.out.println("The alert test case has passed");
		}
		*/
		
		
		
		//2 . Handling Confirm popup
		
		/*
		By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
		By result = By.xpath("//p[@id='result']");
		
		driver.findElement(jsConfirm).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
//		alert.accept();
		alert.dismiss();
		
		String resultText = driver.findElement(result).getText();
		System.out.println(resultText);
		
		if(resultText.equals("You clicked: Ok")) {
			System.out.println("The confirm test case has passed");
		}else if(resultText.equals("You clicked: Cancel")){
			System.out.println("The confirm test case has passed");
		}
		*/
		
		
		
		
		//3 . Handling Confirm popup
		
		By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
		By result = By.xpath("//p[@id='result']");
		
		driver.findElement(jsPrompt).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		String textEnter = "Hi all!!!";
		alert.sendKeys(textEnter);
		alert.accept();
//		alert.dismiss();
		
		String resultText = driver.findElement(result).getText();
		System.out.println(resultText);
		
		if(resultText.equals("You entered: "+textEnter)) {
			System.out.println("The Prompt test case has passed");
		}else if(resultText.equals("You clicked: null")){
			System.out.println("The Prompt test case has passed");
		}
		
		
		//--------------------------
		Thread.sleep(30000);
		driver.quit();
		//--------------------------
	}

}
