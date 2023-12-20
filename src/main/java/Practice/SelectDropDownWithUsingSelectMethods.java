package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithUsingSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		By list = By.id("Form_getForm_Country");
		
		doSelectDropDownValue(list,"India");

	}
	public static WebElement getElements(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownValue(By locator,String value) {
		Select select = new Select(getElements(locator));
		
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

}
