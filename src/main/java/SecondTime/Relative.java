package SecondTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("akhil.chennuru95@gmail.com");
		driver.findElement(By.id("password")).sendKeys("5100aA@123");
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://whenwise.com/users/4273/edit");
		
		WebElement ele = driver.findElement((By.xpath("//span[text()='Email on booking confirmation?']")));
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement((with(By.className("lever")).toRightOf(By.xpath("//span[text()='Accept SMS appointment reminder?']")))).click();
		

	}

}
