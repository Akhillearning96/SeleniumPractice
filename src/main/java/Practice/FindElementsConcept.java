package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total links is :" + linksList.size());
		for(WebElement e : linksList) {
			String text = e.getText();
			if(!text.isEmpty()) {
			System.out.println(text);
			}
		}
		
				
				
				
		
	}

}
