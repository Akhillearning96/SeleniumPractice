package SecondTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());//1
		
		driver.navigate().to("https://www.amazon.com/");//2
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//3
		System.out.println(driver.getTitle());
		 driver.navigate().forward();//4
		 System.out.println(driver.getTitle());
		 driver.navigate().to("https://www.flipkart.com/");//5
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().back();//6
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().back();//7
		 System.out.println(driver.getTitle());
		 
		
		  
		  driver.quit();
		

	}

}
