package SecondTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		By userName = By.id("input-username");
		By firstName = By.xpath("//input[@id='input-firstname']");
		By lastName = By.cssSelector("#input-lastname");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement userName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(userName));
		userName_ele.sendKeys("Akhilchennuru");
		WebElement firstName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
		firstName_ele.sendKeys("Akhil");
		driver.findElement(lastName).sendKeys("Chennuru");
		
		driver.close();
		
		
		

	}

}
