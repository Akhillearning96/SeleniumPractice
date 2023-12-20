package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookSignInTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtili brUtil = new BrowserUtili();
		WebDriver driver =brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://www.facebook.com/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By createNewAccount = By.className ("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy");
		
		By firstName = By.className("u_b_b_wF");
		By surName = By.id("u_b_d_Ik");
		By emailId = By.id("u_b_g_jd");
		By password = By.id("password_step_input");
		By day = By.id("day");
		By mon = By.id("month");
		By yr = By.id("year");	
		eleUtil.doClick(createNewAccount);
		eleUtil.doGetText(createNewAccount);
		eleUtil.doSendKeys(firstName, "Balaji");
		eleUtil.doSendKeys(surName, "Chennuru");
		eleUtil.doSendKeys(emailId, "balaji@gmail.com");
		eleUtil.doSendKeys(password, "5100aA@");
		eleUtil.doDropDownSelectByIndex(day, 3);
		eleUtil.doDropDownSelectByIndex(mon, 10);
		eleUtil.doDropDownSelectByValue(yr, "1993");
		
		
		Thread.sleep(5000);
		driver.close();
		
		}

}
