package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ConceptLocator {
	static WebDriver driver;


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		//6 Approach
//		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(email,"akhil@gmail.com");
//		doSendKeys(password,"akhil@123");
//		
		
		//7 Approach
		String email = "input-email";
		String password = "input-password";
		
		doSendKeys("id",email,"akhil123@gmail.com");
		doSendKeys("id",password,"akhil123450");
		
	}
	
	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		if (locatorType.toLowerCase()== "id") {
			locator = By.id(locatorValue);
		}
		return locator;
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType,locatorValue));
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doSendKeys(String locatorType,String locatorValue,String Value) {
		getElement(locatorType, locatorValue).sendKeys(Value);
	}
	
	


}
