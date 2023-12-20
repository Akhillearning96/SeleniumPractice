package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) {
		//drop down -- html tag --> select
		// using select class in selenium (only for select html tag)
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		
//		Select select = new Select(driver.findElement(By.id("Form_getForm_Country")));
//		select.selectByIndex(28);
//		select.selectByVisibleText("India");
//		select.selectByValue("Australia");
		By country = By.id("Form_getForm_Country");
		doDropDownSelectByIndex(country,5);
		doDropDownSelectByVisibleText(country,"India");
		doDropDownSelectByValue(country,"Cuba");
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doDropDownSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);;
	}

}
