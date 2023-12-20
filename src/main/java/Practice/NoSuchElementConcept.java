package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
//		By forFE = By.id("Form_getForm_Name23");
//		WebElement fe = driver.findElement(forFE);
		//NoSuchElementException--due to id locator entered wrong
//		fe.sendKeys("Akhil Chennuru");
		
		By forFES = By.className("text11");
		List<WebElement> fes = driver.findElements(forFES);
		//
		System.out.println(fes.size());//it will show 0 as locator is wrong. but it will not throw exception
		
	}

}
