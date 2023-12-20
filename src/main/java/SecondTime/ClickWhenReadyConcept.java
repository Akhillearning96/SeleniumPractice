package SecondTime;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickWhenReadyConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By button = By.xpath("//input[@class='signinbtn']");
//		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		clickElementWhenReady(button,5);
		
	
	

	}
	public static void clickElementWhenReady(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public static void clickElementWhenReady(By locator,int timeOut,long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

}
