package SecondTime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		
		List<String> langList = getLinksTextList(langLinks);
		for(String e : langList) {
			 System.out.println(e);  
		
		}
		
		}
	
	

	public static List<String> getLinksTextList(By locator) {
		List<WebElement> linksList =driver.findElements(locator);
		List<String> list = new ArrayList<String>();
		
		for(WebElement e : linksList) {
			String text = e.getText().trim();
			
			list.add(text);
			
	}
		return list;
	

	}
}
