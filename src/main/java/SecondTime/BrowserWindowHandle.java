package SecondTime;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/blog/opencart-4-0-is-officially-released-here-s-what-s-new");
		By xpathWindow = By.xpath("//img[@title='Facebook Marketing Partner']");
		
		driver.findElement(xpathWindow).click();
		
		Set<String> windowHandleList = driver.getWindowHandles();
		Iterator<String> it = windowHandleList.iterator();
		String parentWindow = it.next();
		System.out.println("parent window Id is :"+parentWindow);
		String childWindow = it.next();
		System.out.println("child window Id is :"+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		}

}
