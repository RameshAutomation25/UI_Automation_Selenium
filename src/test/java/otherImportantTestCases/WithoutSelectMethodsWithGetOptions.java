package otherImportantTestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutSelectMethodsWithGetOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By day = By.id("select-demo");
		
		getAllDropDownOptions(day);
		int optionsCount = getAllOptionsCount(day);
		System.out.println(optionsCount);
		
//		doSelectDropdownOptions(day, "Friday");
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getAllOptionsCount(By locator) {
		return getAllDropDownOptions(locator).size()-1;
	}
	
	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsStringList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsStringList.add(text);
		}
		return optionsStringList;
	}
}
