package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		By imagesCount = By.tagName("img");
		int count = getElementsCount(imagesCount);
		System.out.println("Total images on web page :" + count);

		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static void printElementValues(List<String> eleList) {
		for(String e : eleList) {
			System.out.println(e);
		}
	}
		
	public static List<String> getAtrributeList(By locator , String attributeName){
		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attrValue = e.getAttribute(attributeName);
			attrList.add(attrValue);	
		}
		return attrList;
		
	}
	

}
