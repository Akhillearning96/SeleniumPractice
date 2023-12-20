package SecondTime;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		
		Thread.sleep(5000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(WebElement e : suggList) {
			String text = e.getText();
			if(text.equals("naveen automationlabs youtube")) {
				e.click();
				break;
			}
		}
		
		
		

	}

}
