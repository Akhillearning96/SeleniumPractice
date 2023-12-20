package SecondTime;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorTest {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele =driver.findElement(By.xpath("((//tbody//tr)[3]//td)[1]"));
		
		//String  text =driver.findElement(with(By.tagName("a")).toLeftOf(ele)).getText();
		String  text1 =driver.findElement(with(By.tagName("td")).below(ele)).getText();
		System.out.println(text1);
		
		
		
		
		
	}

}
