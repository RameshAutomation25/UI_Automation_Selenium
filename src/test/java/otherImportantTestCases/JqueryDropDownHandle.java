package otherImportantTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);

		By dropDownID = By.id("justAnInputBox");
		driver.findElement(dropDownID).click();
		Thread.sleep(3000);

		By choice = By
	.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//ul/li/span[@class='comboTreeItemTitle']");

		By checkBox = 
	By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//ul/li/span[@class='comboTreeItemTitle']/input");
		// 1. Single Selection
//		selectChoice(choice, "choice 1");

		// 2. Multiple Selection
		selectChoice(choice, "choice 1", "choice 2", "choice 6");
		
		Thread.sleep(5000);
		
		deselectDropDownOptions(checkBox);
		
		// 3. All Selection
//		selectChoice(choice, "all");

	}

	// varArg - Variable arguments
	public static void selectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());
		boolean flag = false;
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag = true;
						e.click();
						break;
					}
				}
			}
		} else {
			// All selection logic
			for (WebElement e : choiceList) {
				flag = true;
				e.click();
			}
		}
		if (flag == false) {
			System.out.println(value +" : is not present in the drop down");
		}
	}
	
	
	public static void deselectDropDownOptions(By locator) {
		List<WebElement> choiceValueList = driver.findElements(locator);
		for(WebElement e : choiceValueList) {
			if(e.isSelected()) {
				e.click();
			}
		}
	}
}
