package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributesConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		 driver =  new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		
		By amazonDevicesLink = By.linkText("Amazon Science");
//		String hrefVal = driver.findElement(amazonDevicesLink).getAttribute("href");
//		System.out.println(hrefVal);
		String hrefVal = getAttributeValue(amazonDevicesLink,"href");
		//validation/verification
		if(hrefVal.contains("amazon.science")) {
			System.out.println("The ref link printed is correct");
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String getAttributeValue(By locator,String AttrName) {
	String attrVal = getElement(locator).getAttribute(AttrName);
	System.out.println(attrVal);
	return attrVal;
	}

}
