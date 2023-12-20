import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

	By username =	By.cssSelector("input[name='email']");
	By password =	By.xpath("//input[@name='password']");
	By btn =By.linkText("Login");
	driver.findElement(username).sendKeys("akhil.chennuru95@gmail.com");
	driver.findElement(password).sendKeys("99630351aA@1");
	driver.findElement(btn).click();
	


	}

}
