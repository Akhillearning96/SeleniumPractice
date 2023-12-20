package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitMethod {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		By submit = By.xpath("//a[text()='Register1' and @class='btn btn-black navbar-btn']");
		
		retryElement(submit,5).click();

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement retryElement(By locator, int timeOut) {
		WebElement element  = null;
		int attempts = 0;
		while (attempts < timeOut){
			try {
			element = getElement(locator);
			}catch(Exception e){
				System.out.println("Element is not found in attempt  : " + attempts);
			}
			attempts++;
		}
		if(element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			}catch(Exception e) {
				System.out.println("Element is not found exception");
			}
		}
		return element;
	}

}
