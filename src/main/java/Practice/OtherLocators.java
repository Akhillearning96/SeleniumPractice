package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//2.name : --II
//		driver.findElement(By.name("username")).sendKeys("sudha@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("akhil123");
		
//		By emailId = By.name("username");
//		By Pwd = By.name("password");
//		ElementUtil elUtil = new ElementUtil(driver);
//		elUtil.doSendKeys(emailId, "akhil@gmail.com");
//		elUtil.doSendKeys(Pwd, "CARS");
 
		
		//3. className : --III
		//it is not unique
		//we can have same class name for different elements
//		driver.findElement(By.className("form-control")).sendKeys("raga");
//		driver.findElement(By.className("form-control")).sendKeys("sudha");
		
		//4.xpath : it is not an attribute
		//it refers the address of the element inside the HTML DOM
		//we have to use attributes to create the xpath
		//we will use relative path but not absolute path
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("cars143@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("cars143");
		
//		By username = By.xpath("//*[@id=\"loginForm\"]/div/input[1]");
//		By password = By.xpath("//*[@id=\"loginForm\"]/div/input[2]");
//		
//		elUtil.doSendKeys(username, "akhil@gmail.com");
//		elUtil.doSendKeys(password, "akhil@123");
		
		//5.cssSelector : it is not an attribute
		//we have to use the attributes to select the css selector
//		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("akhil@gmail.com");
//		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys("akhil@123");
		
		//6. LinkText : only for links, but it is not an attribute
		//uses text of the link for locating the link
		//html tag = a
//		driver.findElement(By.linkText("Sign Up")).click();
		
		//7.partialLinkText : only for links,but it is not for attributes
		//partial text of the link
		//html tag =a
//		driver.findElement(By.partialLinkText("Custom")).click();
		//Custom is the partial name of customer link
	    
		//8.tagName : html tag
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		if(text.contains("Power up your sales, customer service, and marketing")) {
			System.out.println("data is correct");
		}
		
		
		
		
		
		
		
		
	}

}
