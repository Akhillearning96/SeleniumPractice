package AppTest;



import org.openqa.selenium.By;


import org.testng.Assert;

import org.testng.annotations.Test;



	public class OpenCart extends BaseTest {
		
		
		
		@Test
		public void textAvailableTest() {
			driver.get("https://www.google.com/");
			boolean flag = driver.findElement(By.name("q")).isDisplayed();
			Assert.assertTrue(flag);
		}
		
		@Test
		public void googleSearchBtnTest() {
			boolean flag = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
			Assert.assertTrue(flag);
		}
		
		
	}