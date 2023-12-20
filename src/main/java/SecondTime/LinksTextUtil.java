package SecondTime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By links = By.tagName("a");
//		List<WebElement> linksList = driver.findElements(links);
		System.out.println(getElementsCount(links));
		List<String> finalList = getElementsTextList(links);
		for(String e : finalList) {
			System.out.println(e);
		}
		
//		for(int i=0;i<linksList.size();i++) {
//			String elementList = linksList.get(i).getText();
//			if(!elementList.isEmpty()) {
//			System.out.println(elementList);
//			}
//		}

	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : list) {
			String eleList = e.getText();
			if(!eleList.isEmpty()) {
			eleTextList.add(eleList);
			}
		}
		return eleTextList ;
		
	}

}
