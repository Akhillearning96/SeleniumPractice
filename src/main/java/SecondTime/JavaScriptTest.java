package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		//By fullName = By.id("Form_getForm_FullName");
		By comment = By.xpath("//textarea[@id='Form_getForm_Comment']");
		//WebElement firstN = driver.findElement(fullName);
		JavaScriptUtil js = new JavaScriptUtil(driver);
		//js.flash(firstN);
		//js.drawBorder(firstN);
		//firstN.sendKeys("Akhil Chennuru");
		//String text =js.getInnerPageText();
		//System.out.println(text.contains("Contact Sales"));
		js.scrollPageDown();
		driver.findElement(comment).sendKeys("Happy to see the login");
		
	}

}
