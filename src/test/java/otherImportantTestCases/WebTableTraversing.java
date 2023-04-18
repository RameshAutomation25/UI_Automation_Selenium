package otherImportantTestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");

//		int columnCount = getColumnCount();
//		System.out.println(columnCount);
//		
//		
//		List<String> columnValues = getColumnValue();
//		System.out.println(columnValues);
		
//		System.out.println("Total row count is : "+getRowCount());
		
		
		//[@id="customers"]/tbody/tr[2]/td[1]
		//[@id="customers"]/tbody/tr[3]/td[1]
		
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

		System.out.println("Company Names");
		for(int row=2;row<=getRowCount();row++) {
			String fullXpath = beforeXpath + row + afterXpath;
			String text = driver.findElement(By.xpath(fullXpath)).getText();
			System.out.println(text);
		}
		
		System.out.println("=============================================");
		
		String beforeXpath1 = "//table[@id='customers']/tbody/tr[";
		String afterXpath1 = "]/td[2]";

		System.out.println("Contact Names");
		for(int row=2;row<=getRowCount();row++) {
			String fullXpath1 = beforeXpath1 + row + afterXpath1;
			String text = driver.findElement(By.xpath(fullXpath1)).getText();
			System.out.println(text);
		}
		
		System.out.println("=============================================");
		
		String beforeXpath2 = "//table[@id='customers']/tbody/tr[";
		String afterXpath2 = "]/td[3]";

		System.out.println("Country Names");
		for(int row=2;row<=getRowCount();row++) {
			String fullXpath2 = beforeXpath2 + row + afterXpath2;
			String text = driver.findElement(By.xpath(fullXpath2)).getText();
			System.out.println(text);
		}
		
		
		System.out.println("=============================================");
		
		
		System.out.println("------------------------------------------");
		Thread.sleep(30000);
		driver.quit();
	}
	
	
	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	public static List<String> getColumnValue() {
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@id='customers']//th"));
		List<String> columnValuesList = new ArrayList<String>();
		for(WebElement e : columnList) {
			String text = e.getText();
			columnValuesList.add(text);
		}
		return columnValuesList;
	}
	
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
}
