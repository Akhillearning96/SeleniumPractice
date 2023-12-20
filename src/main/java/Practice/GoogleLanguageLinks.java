package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		By langList = By.xpath("//div[@id='SIvCob']/a");
		
		List<String> actLangList = getLinksTextList(langList);
		if(actLangList.contains("తెలుగు")) {
			System.out.println("తెలుగు is present on page");
		}
		clickOnElement(langList,"తెలుగు");
		
		}
		
 	
	public static List<String> getLinksTextList(By locator) {
		List<WebElement> linksList = driver.findElements(locator);
		List<String> linksTextList = new ArrayList<String>();
		System.out.println(linksList.size());
		for(WebElement e : linksList) {
			String text = e.getText().trim();
			linksTextList.add(text);		
		}
		return linksTextList;
	
	}
	public static void clickOnElement(By locator,String linkText) {
		List<WebElement> linksList = driver.findElements(locator);
		System.out.println(linksList.size());
		for(WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(linkText)) {
				e.click();
				break;
			}
		}
	}

}
