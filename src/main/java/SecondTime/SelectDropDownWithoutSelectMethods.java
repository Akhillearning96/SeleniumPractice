package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithoutSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/en/contact-sales/");
		 By country = By.id("Form_getForm_Country");
		 doSelectDropDownValue(country,"India");
			
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();			
				}
		}
	}

}
