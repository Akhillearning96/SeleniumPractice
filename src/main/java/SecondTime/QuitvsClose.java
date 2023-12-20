package SecondTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();//session id is same at this step but invalid
		driver.quit();// session id is null when quit the browser 

	}

}
