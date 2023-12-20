package AppTest;



import org.openqa.selenium.By;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Orangehrm extends BaseTest{
	
	

		
	
	@Test(priority = 1)
	public void enterYourEmailTest() {
		driver.get("https://www.orangehrm.com/");
		boolean flag = driver.findElement(By.id("Form_submitForm_EmailHomePage")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void contactBtnTest() {
		boolean flag = driver.findElement(By.xpath("//button[text()='CONTACT SALES']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
}
