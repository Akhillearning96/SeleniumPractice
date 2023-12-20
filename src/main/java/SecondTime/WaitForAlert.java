package SecondTime;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {
	
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By submit = By.cssSelector("input[type='submit']");
		driver.findElement(submit).click();
		//driver.switchTo().alert();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert aler = wait.until(ExpectedConditions.alertIsPresent());
//		String text =aler.getText();
//		System.out.println(text);
		Alert aler =waitForAlert(10);
		String text = aler.getText();
		System.out.println(text);
		
		

	}
	public static Alert waitForAlert(int timeOut) {
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeOut) {
		return waitForAlert(timeOut).getText();
	}
	public static void doAlertAccept(int timeOut) {
		
		waitForAlert(timeOut).accept();
	}
	public static void doAlertDismiss(int timeOut) {
		
		waitForAlert(timeOut).dismiss();
	}

}
