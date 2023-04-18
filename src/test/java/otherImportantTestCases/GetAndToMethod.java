package otherImportantTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndToMethod {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		
//		driver.get("https://www.google.com");
		
//		driver.navigate().to("https://www.google.com");
		
		try {
			driver.navigate().to(new URL("https://www.google.com"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.get("https://www.amazon.com");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
	}
}
