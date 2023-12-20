package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelectorExercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Inner Wear");
		
		Thread.sleep(5000);
		By searchBar = By.cssSelector("div.s-suggestion.s-suggestion-ellipsis-direction[role='button']");
		
		List<WebElement> list = driver.findElements(searchBar);
		for(WebElement e : list) {
			String text = e.getText();
			if(text.contains("kids")) {
				e.click();
				break;
			}
			
		}
	}

}
