package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	 static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		//1.approach
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mens T-shirt");
//		driver.findElement(By.id("nav-search-submit-button")).click();

		//2.approach
//		By search = By.id("twotabsearchtextbox");
//		By enter = By.id("nav-search-submit-button");
//		
//		driver.findElement(search).sendKeys("ladies dresses");
//		driver.findElement(enter).click();
		
		//3 approach
//		By search = By.id("twotabsearchtextbox");
//		By enter = By.id("nav-search-submit-button");
//		
//		WebElement sea = driver.findElement(search);
//		WebElement cli = driver.findElement(enter);
//		
//		sea.sendKeys("Track pants");
//		cli.click();
		
		//4 approach
//		  getElement(search).sendKeys("SANDLES FOR MALE");
//		  getElement(enter).click();
//		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
