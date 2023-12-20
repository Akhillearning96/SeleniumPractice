package SecondTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofMillis(0))
//				.withMessage("Element is not found........");
//	

	}
	public static WebElement WaitForElementPresentUsingFluentWait(By locator,int timeOut,long intervalTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(intervalTime))
						.withMessage("Element is not found........");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement WaitForElementPresentUsingWebDriverWait(By locator,int timeOut,long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
				wait.pollingEvery(Duration.ofMillis(intervalTime))
						.withMessage("Element is not found........");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	

}
