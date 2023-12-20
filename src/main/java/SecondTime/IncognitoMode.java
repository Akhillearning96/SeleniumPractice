package SecondTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoMode {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(fo);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
