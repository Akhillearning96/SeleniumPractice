package SecondTime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imagesListUtil {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		By images = By.tagName("img");
		
//		List<WebElement> imag = driver.findElements(images);
//		
//		int sizeOfImages = imag.size();
//		System.out.println(sizeOfImages);
//		for(WebElement e : imag) {
//			System.out.println(e.getAttribute("alt")+"----->"+e.getAttribute("src"));
//			
//		}
//		 Thread.sleep(5000);
//		 driver.close();
		
		int num = getElementsCount(images);
		System.out.println(num);
		List<String> altList = getAttributeList(images,"alt");
		List<String> srcList = getAttributeList(images,"src");
		
		for(String e : altList) {
			System.out.println(e);
		}
		for(String e : srcList) {
			System.out.println(e); 
	
		}

	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getAttributeList(By locator,String attributeName) {
		List<WebElement> al = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e : al) {
		String attrValue =	e.getAttribute(attributeName);
		attrList.add(attrValue);
		
		}
		return attrList;
	}

}
