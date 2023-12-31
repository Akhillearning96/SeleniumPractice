package AppTest;



import org.openqa.selenium.By;


import org.testng.Assert;

import org.testng.annotations.Test;



public class GoogleTest extends BaseTest {
	
	
	@Test(priority =1)
	public void searchTest() {
		driver.get("https://www.google.com/");
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void googleSearchBtnTest() {
		boolean flag = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
}
