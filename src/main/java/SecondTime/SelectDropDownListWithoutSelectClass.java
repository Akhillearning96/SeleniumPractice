package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownListWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/en/contact-sales/");
		 By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		 
		 doSelectDropDownValue(countryOptions,"India");
		 
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void doSelectDropDownValue(By locator,String value) {
		List<WebElement> optionsList =  getElements(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}

		
	}

}
