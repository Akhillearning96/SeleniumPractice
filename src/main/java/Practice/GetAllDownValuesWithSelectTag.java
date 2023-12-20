package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDownValuesWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(country);
		List<WebElement> countryList =	select.getOptions();
		System.out.println(countryList.size());
//		int count =0;
//		for(WebElement e :countryList) {
//		
//			String text = e.getText();
//			if(count==0) {
//		
//			}else {
//			System.out.println(count + "::" +text);
//			}
//			count++;
//		}
		
		for(int i=0;i<countryList.size();i++) {
			String text = countryList.get(i).getText();
			System.out.println(i +"::" +text);
			
		}
		

	}

}

