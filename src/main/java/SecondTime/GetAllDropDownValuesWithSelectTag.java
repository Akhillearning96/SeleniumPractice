package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownValuesWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/contact-sales/");
			By country = By.id("Form_getForm_Country");
			
			WebElement dropDown =driver.findElement(country);
			Select select = new Select(dropDown);
			List<WebElement> list =  select.getOptions();
			System.out.println(list.size());
			int count = 0 ;
			for(WebElement e : list) {
				
				String text = e.getText();
				if(!text.equals("Country")) {
				System.out.println(count +"::" +text);
				}
				count++;
			
			
			}
			
	}
	
}
