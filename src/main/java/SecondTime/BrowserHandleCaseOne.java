package SecondTime;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandleCaseOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/blog/opencart-4-0-is-officially-released-here-s-what-s-new");
		By facebookLink = By.xpath("//img[@title='Facebook Marketing Partner']");
		By linkedin = By.xpath("//a[text()='Linkedin']");
		By facebook = By.xpath("//a[text()='Facebook']");
		By twitter = By.xpath("//a[text()='Twitter']");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(facebookLink).click();
		driver.findElement(linkedin).click();
		driver.findElement(facebook).click();
		driver.findElement(twitter).click();
		
		
		
		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> list = handles.iterator();
//		String parentHandle = list.next();
//		String fbLinkHandle = list.next();
//		String linkedinHandle = list.next();
//		String fbHandle = list.next();		
//		String twitterHandle = list.next();
//		
		
		List<String> handleList = new ArrayList<String>(handles);
		int count = 1;
		for(String e : handleList) {
			
			//System.out.println(count + e);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			if(count<2&count>0) {
			
			System.out.println(driver.getTitle());
			
			}else {
			driver.switchTo().window(e);
			System.out.println(driver.getTitle());
			driver.close();
			}
			count ++;
			}
		
//		driver.switchTo().window(fbLinkHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(linkedinHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(fbHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(twitterHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(parentHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
		
		

	}

}
