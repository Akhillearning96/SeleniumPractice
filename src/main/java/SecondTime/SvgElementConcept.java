package SecondTime;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		By statesList = By.xpath("//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @id='features']/*[name()='g']//*[name()='path']");
		List<WebElement> listOfStates = driver.findElements(statesList);
		
		Actions act = new Actions(driver);
		
		for(WebElement e : listOfStates) {
			act.moveToElement(e).build().perform();
			String text = e.getAttribute("name");
			System.out.println(text);
			if(text.equals("MISSOURI")) {
				e.click();
				break;
			}
		}
	}

}
