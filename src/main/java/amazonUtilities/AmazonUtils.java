package amazonUtilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonUtils {

	
	
	//************************************Sign in Utilities***************************************
	
		/*public void doSignIn(By signInOption, By emailPath, By buttonContinue, By passwordPath, By buttonSignIn, String emailID, String password) throws InterruptedException {
			Thread.sleep(4000);
			doClick(signInOption);
			doSendKeys(emailPath, emailID);
			doClick(buttonContinue);
			doSendKeys(passwordPath, password);
			doClick(buttonSignIn);
		}
		
		
		
		public void signInFromHamburgerMenu(By hMenuLink, By hamburgerMenuBar, By signInOption, By emailPath, By buttonContinue, By passwordPath, By buttonSignIn, String emailID, String password) throws InterruptedException {
			driver.findElement(hamburgerMenuBar).click();
			driver.findElement(hMenuLink).click();
			Thread.sleep(4000);
			doSendKeys(emailPath, emailID);
			doClick(buttonContinue);
			Thread.sleep(4000);
			doSendKeys(passwordPath, password);
			doClick(buttonSignIn);
		}
		
		
		//*********************************Footer Utilities*****************************************

		

		public String getFooterLogoLink(By locator, String attrName) {
			return driver.findElement(locator).getAttribute(attrName);
		}
		
		
		

		public List<String> getAllLanguagesFromTheFooterDropdown(By langLocator, By languages) {
			driver.findElement(langLocator).click();
			List<WebElement> langLinks = driver.findElements(languages);
			List<String> lanList = new ArrayList<String>();
			for(WebElement e : langLinks) {
				String text = e.getText();
				lanList.add(text);
			}
			return lanList;
		}
		
		
		//*********************************Navigate to product page*****************************************


		public void selectTheSearchResult(By searchLocator, String searchText, String suggName, By suggestions, By searchResult) throws InterruptedException {
			search(searchLocator, searchText, suggName, suggestions);
			driver.findElement(searchResult).click();
		}
		
		
		
		//*********************************Filter Utilities*****************************************
		
		public void selectTheSearchResultUsingPriceFilters(By searchLocator, String searchText, String suggName, By suggestions, By searchResult, By minPrice, By maxPrice, By goButton) throws InterruptedException {
			search(searchLocator, searchText, suggName, suggestions);
			doSendKeys(minPrice, "5000");
			doSendKeys(maxPrice, "10000");
			driver.findElement(goButton).click();
			Thread.sleep(3000);
			driver.findElement(searchResult).click();
		}
		
		
		
		public void selectCheckBbox(By checkLocator) {
			doClick(checkLocator);
		}
		
		
		public void selectTheSearchResultByBrand(By searchLocator, String searchText, String suggName, By suggestions, By searchResult, By brandSeeMore, By brand) throws InterruptedException {
			search(searchLocator, searchText, suggName, suggestions);
			Thread.sleep(5000);
			driver.findElement(brandSeeMore).click();
			Thread.sleep(8000);
			selectCheckBbox(brand);
			Thread.sleep(5000);
			doClick(searchLocator);
		}*/
}
