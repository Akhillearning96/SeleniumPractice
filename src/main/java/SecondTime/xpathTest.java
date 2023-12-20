package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By signInLink = By.xpath("//a[@id='nav-link-accountList']");
	By createAccountLink = By.xpath("//a[@id='createAccountSubmit' and @class='a-button-text']");
	By firstName = By.xpath("//input[@id='ap_customer_name']");
	By emailId = By.xpath("//input[@id='ap_email']");
	By password = By.xpath("//input[@id='ap_password']");
	By reCheck = By.xpath("//input[@id='ap_password_check']");
	By continueClick = By.xpath("//input[contains(@id,'continue')]");
	
	ElementUtil elUtil = new ElementUtil(driver);
	elUtil.doClick(signInLink);
	elUtil.doClick(createAccountLink);
	elUtil.doSendKeys(firstName, "Akhil");
	elUtil.doSendKeys(emailId, "akhiltester@gmail.com");
	elUtil.doSendKeys(password, "5100aA@");
	elUtil.doSendKeys(reCheck, "5100aA@");
	elUtil.doClick(continueClick);

	}

}
