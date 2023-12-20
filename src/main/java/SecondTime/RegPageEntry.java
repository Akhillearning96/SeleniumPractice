package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageEntry {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtili brUtil = new BrowserUtili();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		ElementUtil eu = new ElementUtil(driver);
		By firstNameId = By.id("input-firstname");
		By lastNameId = By.id("input-lastname");
		By emailId = By.id("input-email");
		By password = By.id("input-password");

		
		eu.doSendKeys(firstNameId, "Akhil");
		eu.doSendKeys(lastNameId, "Chennuru");
		eu.doSendKeys(emailId, "akhil.chennuru@gmail.com");
		eu.doSendKeys(password,"akhil12345");

		
		Thread.sleep(5000);
		brUtil.closeBrowser();
		
		

		
		
		
		
		
	}
	

}
