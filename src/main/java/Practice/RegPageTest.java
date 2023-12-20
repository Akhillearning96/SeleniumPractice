package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.LaunchBrowser("edge");
		bUtil.enterUrl("https://classic.freecrm.com/register/");
		String title = bUtil.getPageTitle();
		System.out.println(title);
		System.out.println(bUtil.getAppCurrentUrl());
		
		 By firstName = By.name("first_name");
		 By lastName = By.name("surname");
		 By emailId = By.name("email");
		 By emailConfirm = By.name("email_confirm");
		 By userName = By.name("username");
		 By passWord = By.name("password");
		 By confirmPassword =By.name("passwordconfirm");
		 
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Akhil");
		eleUtil.doSendKeys(lastName, "Chennuru");
		eleUtil.doSendKeys(emailId, "akhil.chennuru@gmail.com");
		eleUtil.doSendKeys(emailConfirm, "akhil.chennuru@gmail.com");
		eleUtil.doSendKeys(userName, "CARS143");
		eleUtil.doSendKeys(passWord, "cars@143");
		eleUtil.doSendKeys(confirmPassword, "cars@143");
		
		
		

	}

}
