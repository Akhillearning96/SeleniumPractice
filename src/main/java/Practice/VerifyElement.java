package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		By formFields = By.className("text");
		
		int fieldsCount = driver.findElements(formFields).size();
		if(fieldsCount == 0) {
			System.out.println("form fields are not available");
		}else {
			System.out.println("form fields are available");
		}
		//to verify the single element :
		By ContactSalesLink = By.linkText("Contact Sales");
		boolean flag =driver.findElement(ContactSalesLink).isDisplayed();
		System.out.println(flag);
		if(driver.findElements(ContactSalesLink).size()>=1) {
			System.out.println("Contact Sales link is present on the page");
		}

	}
	public static boolean isElementExist(By locator) {
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements found : " + elementCount);
		if(elementCount>=1) {
			System.out.println("element is found.."+ locator);
			return true;
		}else {
			System.out.println("elemane is not found "+ locator);
			return false;
		}
		}

}
