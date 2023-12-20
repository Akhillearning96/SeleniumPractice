package SecondTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithArrayList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/blog/opencart-4-0-is-officially-released-here-s-what-s-new");
		By xpathWindow = By.xpath("//img[@title='Facebook Marketing Partner']");
		
		driver.findElement(xpathWindow).click();
		
		Set<String> windowHandleList = driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>(windowHandleList);
		String parentWindow = list.get(0);
		String childWindow = list.get(1);
		System.out.println(parentWindow); 
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
