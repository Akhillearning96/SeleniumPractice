package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownListWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");	
		By list = By.xpath("//*[@id=\"Form_getForm_Country\"]/option");
		selectDropDownValueWithoutSelect(list,"India");
	}
	
	public static void selectDropDownValueWithoutSelect(By locator , String value) {
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
