package genericUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	/**
	 * We made this driver private so that other classes cannot use this driver
	 */
	private WebDriver driver;

	/**
	 * This constructor is used to create ElementUtil object, by accepting caller
	 * class driver, to initialise ElementUtil class driver for method calling
	 * 
	 * @param driver
	 */
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method finds the element and clicks on it
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}

	/**
	 * This method finds the element and clears the element text
	 * 
	 * @param locator
	 */
	public void doClear(By locator) {
		getElement(locator).clear();
	}

	/**
	 * This method gets the element based on the locator
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {

		WebElement element = null;

		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found with the locator : " + locator);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			element = driver.findElement(locator);
		}
		return element;
	}

	/**
	 * This method finds the elements based on the locator and return the list of
	 * webelement
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	/**
	 * This method finds the elements, clears the element text and sends the keys
	 * 
	 * @param locator
	 * @param key
	 */
	public void doSendKeys(By locator, String key) {

		if (key == null) {
			System.out.println("Null values are not allowed");
			throw new CustomException("VALUECANNOTBENULL");
		}
		doClear(locator);
		getElement(locator).sendKeys(key);
	}

	/**
	 * This method gets the webelement and gets the text of that element
	 * 
	 * @param locator
	 * @return
	 */
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * This method checks whether the element is displayed
	 * 
	 * @param locator
	 * @return
	 */
	public boolean isElementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	/**
	 * This method finds the element based on locator and gets the attribute based
	 * on the attibute name
	 * 
	 * @param locator
	 * @param attrName
	 * @return
	 */
	public String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	/**
	 * This method gets the elements, find the size of the list of webelements and
	 * returns it
	 * 
	 * @param locator
	 * @return
	 */
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	/**
	 * This method returns the list of Strings of attribute values, based on the
	 * locator, attribute name and the list of webelements
	 * 
	 * @param locator
	 * @param attrName
	 * @return
	 */
	public List<String> getElementAttributeValues(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			e.getAttribute(attrName);
			eleAttrList.add(attrName);
		}
		return eleAttrList;
	}

	/**
	 * This methods gets the elements, gets the element text and return the list of
	 * element text strings
	 * 
	 * @param locator
	 * @return
	 */
	public List<String> getElementListText(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleListText = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			eleListText.add(text);
		}
		return eleListText;
	}

	/**
	 * This method finds the elements, finds the elements text and clicks on the
	 * matching element text
	 * 
	 * @param locator
	 * @param elementText
	 */
	public void clickElementFromPageSection(By locator, String elementText) {
		List<WebElement> elementsList = getElements(locator);
		for (WebElement e : elementsList) {
			String text = e.getText();
			if (text.equals(elementText)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	//**********************************Search Utilities******************************************

	/**
	 * This method gets all the search suggestions list and print them
	 * @param searchLocator
	 * @param searchText
	 * @param suggestions
	 * @return
	 * @throws InterruptedException
	 */
	public List<String> getSearchSuggestions(By searchLocator, String searchText, By suggestions)
			throws InterruptedException {

		doSendKeys(searchLocator, searchText);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggestions);
		List<String> searchSuggList = new ArrayList<String>();

		if (suggList.size() > 0) {
			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					searchSuggList.add(text);
				} 
				else {
					System.out.println("blank Value -- Not Suggestions");
				}
			}
		} 
		else {
			System.out.println("No search suggestions found");
		}
		return searchSuggList;
	}
	
	
	

	/**
	 * This method finds the search locator, enters the searchtext, loops through
	 * the search suggestions and clicks on the given matching search suggestion
	 * 
	 * @param searchLocator
	 * @param searchText
	 * @param suggName
	 * @param suggestions
	 * @throws InterruptedException
	 */
	public void search(By searchLocator, String searchText, String suggName, By suggestions) throws InterruptedException {

		doSendKeys(searchLocator, searchText);
		Thread.sleep(5000);
		List<WebElement> suggList = getElements(suggestions);
		if (suggList.size() > 0) {
			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					Thread.sleep(5000);
					if (text.equals(suggName)) {
						e.click();
						break;
					}
				} else {
					System.out.println("blank Value -- Not Suggestions");
				}
			}
		} else {
			System.out.println("No search suggestions found");
		}
	}

	
	
	/**
	 * This method checks whether the search suggestions are less than or equal to 10 and prints the result
	 * @param searchLocator
	 * @param searchText
	 * @param suggestions
	 * @throws InterruptedException
	 */
	public void getSearchSuggestionsCount(By searchLocator, String searchText, By suggestions)
			throws InterruptedException {
		doSendKeys(searchLocator, searchText);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggestions);

		if (suggList.size() <= 10) {
			System.out.println("Search suggestions count " + suggList.size() + " is correct");
		} else {
			System.out.println("Search suggestions count " + suggList.size() + " is greater than 10!");
		}
	}

	// *****************************************Drop down Utils******************************************

	
	/**
	 * This method selects the drop down value based on index using select class
	 * 
	 * @param locator
	 * @param index
	 */
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	
	
	/**
	 * This method selects the drop down value based on VisibleText using select
	 * class
	 * 
	 * @param locator
	 * @param text
	 */
	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	

	/**
	 * This method selects the drop down value based on Value using select class
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	

	/**
	 * This method selects all the drop down values using select class
	 * 
	 * @param locator
	 */
	public void doSelectAllDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.length() > 0) {
				e.click();
			}
		}
	}
	
	

	/**
	 * This method return the string list of drop down options list text using
	 * select class
	 * 
	 * @param locator
	 * @return
	 */
	public List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionsValuesList = new ArrayList<String>();
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValuesList.add(text);
		}
		return optionsValuesList;
	}

	
	
	/**
	 * This methods returns the count of all the drop down options using select
	 * class
	 * 
	 * @param locator
	 * @return
	 */
	public int getDropDownValuesCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	
	
	/**
	 * This method clicks on the matching drop down value using select class
	 * 
	 * @param locator
	 * @param dropDownValue
	 */
	public void doClickDropDownValue(By locator, String dropDownValue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(dropDownValue)) {
				flag = true;
				e.click();
				break;
			}
		}
		if (flag == false) {
			System.out.println(dropDownValue + " value is not present in the drop down");
		}
	}

	
	
	/**
	 * This method deselects the drop down option by index
	 * 
	 * @param locator
	 * @param index
	 */
	public void deSelecDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.deselectByIndex(index);
	}

	
	
	
	/**
	 * This method deselects the drop down option by VisibleText
	 * 
	 * @param locator
	 * @param text
	 */
	public void deSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(text);
	}
	
	

	/**
	 * This method deselects the drop down option by value
	 * 
	 * @param locator
	 * @param value
	 */
	public void deSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
	}

	
	
	
	/**
	 * This method deselects all the drop down options
	 * 
	 * @param locator
	 */
	public void deSelectAllDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		select.deselectAll();
	}
	
	
	

	/**
	 * This method clicks on the matching drop down value without using select class
	 * 
	 * @param locator
	 * @param value
	 * @return
	 */
	public boolean doClickDropDownValueWithoutSelect(By locator, String value) {
		boolean flag = false;
		List<WebElement> elementsList = getElements(locator);
		for (WebElement e : elementsList) {
			String text = e.getText();
			if (text.equals(value)) {
				flag = true;
				e.click();
				break;
			}
		}
		if (flag == false) {
			System.out.println(value + " not found in the drop down");
		}
		return flag;
	}
	
	
	
	

	/**
	 * This method deselects all the drop down values which are selected
	 * 
	 * @param locator
	 */
	public void deSelectAllDropDownWithoutSelect(By locator) {
		List<WebElement> elementsList = getElements(locator);
		for (WebElement e : elementsList) {
			if (e.isSelected()) {
				e.click();
			}
		}
	}
	

	
	//***********************************Header Utilities*********************************************
	
	public List<String> getHeadersList(By locator) {
		List<WebElement> headersList = driver.findElements(locator);
		List<String> headersValueList = new ArrayList<String>();
		for (WebElement e : headersList) {
			String text = e.getText();
			headersValueList.add(text);
		}
		return headersValueList;
	}
	
	
	public void SelectHeaders(By locator, String headerText) {
		List<WebElement> headersList = driver.findElements(locator);
		for (WebElement e : headersList) {
			String text = e.getText();
				if(text.equals(headerText)) {
					e.click();
				}
		}
	}
	
	
	//***********************************Footer Utilities********************************************
	
	
	public List<String> getFirstFooterHeadersLinks(By locator, String attrName) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> footerLinksList = new ArrayList<String>();
		for(WebElement e : footerLinks) {
			String value = e.getAttribute(attrName);
			footerLinksList.add(value);
		}
		return footerLinksList;
	}
	
	
	public List<String> getFooterLinksText(By locator) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> headersTextList = new ArrayList<String>();
		for(WebElement e : footerLinks) {
			String text = e.getText();
			headersTextList.add(text);
		}
		return headersTextList;
	}
	
	
	
	public void checkIfLinkTextIsPresentInFooter(By locator, String linkText) {
		List<WebElement> footerLinks = driver.findElements(locator);
		List<String> footerLinksText = new ArrayList<String>();
		for(WebElement e : footerLinks) {
			String text = e.getText();
			footerLinksText.add(text);
		}
		for(String e : footerLinksText) {
			if(e.equals(linkText)) {
				System.out.println(linkText+" is present in the footer section");
			}
		}
	}
	
	
	
	public void selectFooter(By locator, String linkText) throws InterruptedException {
		List<WebElement> footerText = driver.findElements(locator);
		for(WebElement e : footerText) {
			String text = e.getText();
				if(text.equals(linkText)) {
					e.click();
				}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//************************************OpenCart Utilities***************************************

	public void loginToOpenCart(By myAccount, By login, By email, By password, By loginBtn, String emailId, String passWord) {
		doClick(myAccount);
		doClick(login);
		doSendKeys(email, emailId);
		doSendKeys(password, passWord);
		doClick(loginBtn);
	}
	
	
	
	public void openCartSearch(By searchLocator, String searchText, By searchButton) throws InterruptedException {

		doSendKeys(searchLocator, searchText);
		doClick(searchButton);
	}
	
	
	
	public void addProductToWishList(By searchLocator, String searchText, By searchButton, By wishList) throws InterruptedException {
		openCartSearch(searchLocator, searchText, searchButton);
		driver.findElement(wishList).click();
	}
}
