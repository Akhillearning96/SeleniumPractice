package SecondTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http:/londonfreelance.org/course/frames/index.html");
		//By frame = By.cssSelector("frame[name='main']");
		
		By titlexpath = By.xpath("//body[@bgcolor='red' and @background='top.gif']/h2");
		
//		waitForFrameByLocator(frame,5);
//		String text = driver.findElement(titlexpath).getText();
//		System.out.println(text);
		
		waitForFrameByNameorId("main",5);
		String text = driver.findElement(titlexpath).getText();
		System.out.println(text);
		

	}
	public static void waitForFrameByLocator(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	public static void waitForFrameByNameorId(String nameOrId,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}
	

}
