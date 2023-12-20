package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		//Approach : 1
//		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//Approach : 2
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test123@gmail.com");
//		password.sendKeys("test@123");
		
		//Approach : 3
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		WebElement emailId = driver.findElement(username);
//		WebElement password = driver.findElement(pwd);
//		
//		emailId.sendKeys("test123@gmail.com");
//		password.sendKeys("test@123");
		
		//Approach : 4
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(username).sendKeys("testrock@gmail.com");
//		getElement(password).sendKeys("test@123");

		//Approach : 5 : By locator with generic methods	
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		doSendKeys(username,"test123@gmail.com");
		doSendKeys(password,"test@123");
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}

}
