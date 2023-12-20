package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
//		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		boolean flag = emailId.isDisplayed();
		
		By flag = By.id("input-email");
		boolean result = doIsDisplayed(flag);
		if(result) {
			System.out.println("Element is displayed ......");
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
