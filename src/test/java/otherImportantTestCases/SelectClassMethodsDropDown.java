package otherImportantTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethodsDropDown {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By dropdownId = By.id("select-demo");
		
		WebElement daysList = driver.findElement(dropdownId);

		Select select = new Select(daysList);
		
		select.selectByIndex(1);
		//If we select the title value in the drop down which is disabled, selenium thows
		//UnsupportedOperationException: You may not select a disabled option

		select.selectByValue("Monday");
		
		select.selectByVisibleText("Tuesday");

}
}
