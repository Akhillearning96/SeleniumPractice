package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("akhil.chennuru95@gmail.com");
		driver.findElement(By.cssSelector("input[id='input-password']")).sendKeys("99630351aA@1");
		driver.findElement(By.xpath("(//button[text()='Login' and @type='submit'])[1]")).click();
		

	}

}
