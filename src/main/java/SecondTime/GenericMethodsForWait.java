package SecondTime;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethodsForWait {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
		By nameSignUp = By.xpath("//input[@name='name'and @data-qa='signup-name']");
		By emailId =By.xpath("//input[@name='email'and @data-qa='signup-email']");
		
		doSendKeys(nameSignUp,10,"Akhil");
		doSendKeys(emailId,10,"akhilchennuru@gmail.com");
		
		

	}
	public static void doSendKeys(By locator,int timeOut,String value) {
		doPresenceOfElementLocated(locator,timeOut).sendKeys(value);
		
	}
	public static void doClick(By locator,int timeOut) {
		doPresenceOfElementLocated(locator,timeOut).click();
	}
	public static WebElement doPresenceOfElementLocated(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement doPresenceOfElementLocated(By locator,int timeOut,long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement WaitForTheElementToBeVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement WaitForTheElementToBeVisible(By locator,int timeOut,long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}public static List<WebElement> WaitForTheAllElementToBeVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	

	
}
