package SecondTime;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By clickMe = By.xpath("//span[text()='right click me']");
		WebElement rightClickMe = driver.findElement(clickMe);
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickMe).build().perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		Alert  alert = driver.switchTo().alert();
		String text1 =alert.getText();
		System.out.println(text1);
		alert.dismiss();

	}

}
