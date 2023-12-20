package SecondTime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElement {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
//		By nameSignUp = By.xpath("//input[@name='name'and @data-qa='signup-name']");
//		By emailId =By.xpath("//input[@name='email'and @data-qa='signup-email']");

	}
	public static String doGetTitle(String urlFraction , int timeOut) {
		if( waitForURLToContain(urlFraction , timeOut) ) {
			return driver.getCurrentUrl();
		}
		return null;
	}
	
	
	public static boolean waitForURLToContain(String urlFraction , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
	public static boolean waitForURLToBe(String url , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlToBe(url));
	}
	
	

}
