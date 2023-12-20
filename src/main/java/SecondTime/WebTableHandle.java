package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		//td[text()='Functional']/preceding-sibling::td/child::input
		//td[text()='Functional']/preceding-sibling::td/input
		
		//By select = By.xpath("//td[text()='Functional']/preceding-sibling::td/child::input");
		//driver.findElement(select).click();
		By elements =By.xpath("//table[@id='table01']//tbody/tr/td");
		List<WebElement> firstRow = driver.findElements(elements);
		for(WebElement e : firstRow) {
			String text = e.getText();
			System.out.println(text);
		}
		

	}

}
