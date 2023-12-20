import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	public static WebDriver driver;
public static void main(String[] args)  {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Thread.sleep(5000);
	//WebElement element = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title"));
	
	

	

	
}	
public static void generateAlert(String message) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('"+message+"')");
}
public static void drawBorder(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'", element);
}
public static void flash(WebElement element) {
	String bgcolor = element.getCssValue("backgroundColor");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	for(int i=0;i<80;i++) {
		js.executeScript("arguments[0].style.backgroundColor ='rgb(0,200,0)'", element);
		js.executeScript("arguments[0].style.backgroundColor= bgcolor",element);
	}
	
}
	
	
}

