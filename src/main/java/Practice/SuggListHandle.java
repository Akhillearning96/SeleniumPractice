package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggListHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropDownList = driver.findElement(By.id("searchDropdownBox"));
		dropDownList.click();
		Thread.sleep(5000);
		
		Select select = new Select(dropDownList);
		//select.selectByIndex(5);
		//select.selectByVisibleText("Electronics");
		//select.selectByValue("Electronics");
		List<WebElement> dropList = select.getOptions();
		System.out.println(dropList.size());
		for(WebElement e : dropList) {
			String text = e.getText();	
			System.out.println(text);
			if(text.equals("Gift Cards")) {
				e.click();
				break;
			}
			}
		
		
		
	

	}

}
