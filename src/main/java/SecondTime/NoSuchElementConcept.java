package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		//WebElement cs = driver.findElement(By.linkText("Contact Sales"));
		//NoSuchElementException 
		//cs.click();
		List<WebElement> list = driver.findElements(By.className("text11"));
		//findElements will not throw any exception 
		int siz =list.size();
		System.out.println(siz);
		
	}

}
