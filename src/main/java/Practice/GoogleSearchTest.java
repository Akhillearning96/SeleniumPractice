package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.id("APjFqb")).sendKeys("kavali");
//		Thread.sleep(5000);
//		By searchContext = By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span");
//		
//		List<WebElement> suggList = driver.findElements(searchContext);
//		System.out.println(suggList.size());
//		
//		for(WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("kavali weather")) {
//				e.click();
//				break;
//			}
//			
//		}
		By search = By.id("APjFqb");
		doSendKeys(search,"kavali");
		Thread.sleep(5000);
		By searchContext = By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span");
		clickOnOption(searchContext,"kavali weather");
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	public static void clickOnOption(By locator , String value) {
		List<WebElement> optionsList = getElements(locator);
		
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
			
		}
	}

}
