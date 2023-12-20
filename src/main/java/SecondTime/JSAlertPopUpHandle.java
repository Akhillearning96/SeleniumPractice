package SecondTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopUpHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ElementUtil elUtil = new ElementUtil(driver);
		By submit = By.name("proceed");
		elUtil.doClick(submit);
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		//al.accept();
		al.dismiss();
		
	}

}
