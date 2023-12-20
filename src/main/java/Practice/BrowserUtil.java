package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public WebDriver driver;
	/*
	 * This method is used launch the browser on the basis of given browser name
	 * return the driver
	 */
	
	public WebDriver LaunchBrowser(String browser) {
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else {
			System.out.println("Please pass the right browser :"+ browser);
		}
		return driver;
	}
		/*
		 * This method is used to enter the url
		 * 
		 */
	  public void enterUrl(String url) {
		if (url==null) {
			System.out.println("url is null");
			return;
			
		}
		if(url.indexOf("http")==-1) {
			System.out.println("http is missing in url");
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


