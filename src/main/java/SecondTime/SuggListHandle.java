package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggListHandle {
static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mens");
		Thread.sleep(5000);
		By shoes = By.xpath("//div[@class='left-pane-results-container']/div");
		List<WebElement> suggList = driver.findElements(shoes);
		for(WebElement e : suggList) {
			String text = e.getText();
			if(text.equals("mens shoes")) {
				e.click();
				break;
			}
		}
		
		
		
		
		

	}

}
