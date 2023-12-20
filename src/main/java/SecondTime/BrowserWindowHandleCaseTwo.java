package SecondTime;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCaseTwo {

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
		List<String> list = new ArrayList<String>(handles);
		String parentLink = list.get(0);
		String fbLink = list.get(1);
		String linkedinLink = list.get(2);
		String fb = list.get(3);
		String twitterLink = list.get(4);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(fbLink);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentLink);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(linkedinLink);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentLink);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(fb);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentLink);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(twitterLink);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentLink);
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
