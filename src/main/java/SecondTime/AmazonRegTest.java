package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonRegTest {

	public static void main(String[] args)  {
		BrowserUtili brUtil = new BrowserUtili(); 
				WebDriver driver = brUtil.launchBrowser("chrome");
				brUtil.enterUrl("https://www.amazon.com/");
				
				String  url =brUtil.getAppCurrentUrl();
				if(url.contains("amazon.com")) {
					System.out.println(url);
				}else {
					System.out.println("please check the correct url");
				}
				
				ElementUtil elUtil = new  ElementUtil(driver);
			By signIn =	By.id("nav-link-accountList-nav-line-1");
			By createAccount = By.id("createAccountSubmit");
			By userName = By.id("ap_customer_name");
			By emailId = By.id("ap_email");
			By pwd = By.id("ap_password");
			By confirmPwd = By.id("ap_password_check");
			By Cont = By.id("continue");
			
			elUtil.doClick(signIn);
			elUtil.doClick(createAccount);
			elUtil.doSendKeys(userName, "Chennuru VenkataRamana");
			elUtil.doSendKeys(emailId,"akhiltester96@gmail.com");
			elUtil.doSendKeys(pwd, "5100aA@123");
			elUtil.doSendKeys(confirmPwd, "5100aA@123");
			elUtil.doClick(Cont);
	
				
		
		
		

	}

}
