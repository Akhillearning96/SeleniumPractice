package SecondTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtili {
	public WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("please pass the right browser");
		}
		return driver;
		
	}
	public void enterUrl(String url) {
		if(url==null) {
			System.out.println("url is null.....");
			return;
		}
		if(url.indexOf("http")==-1) {
			System.out.println("http missing in url....");
			return;
		}
		driver.get(url);
	}
	public String getAppCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	
}
