package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public String doGetText(By locator) {
		 return getElement(locator).getText();
	}
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				System.out.println(eleTextList.add(text));
			}
			
		}
		return eleTextList;
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}
	public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public  void printElementValues(List<String> eleList) {
		for(String e : eleList) {
			System.out.println(e);
		}
	}
	public  String getAttributeValue(By locator,String AttrName) {
	String attrVal = getElement(locator).getAttribute(AttrName);
	System.out.println(attrVal);
	return attrVal;
	}
		
	public  List<String> getAtrributeList(By locator , String attributeName){
		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attrValue = e.getAttribute(attributeName);
			attrList.add(attrValue);	
		}
		return attrList;
		
	}
	public  boolean isElementExist(By locator) {
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements found : " + elementCount);
		if(elementCount>=1) {
			System.out.println("element is found.."+ locator);
			return true;
		}else {
			System.out.println("elemane is not found "+ locator);
			return false;
		}
		}
	
	
	//**************************DROPDOWN UTILITES*************WITH SELECT HTML TAG**************
	
	public  void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public  void doDropDownSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public  void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);;
	}
	public  void doSelectDropDownValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	

	public void selectDropDownValueWithoutSelect(By locator , String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text =e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	

}
