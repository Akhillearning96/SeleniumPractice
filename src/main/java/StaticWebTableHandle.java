import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		By username = By.name("username");
		By password = By.name("password");
		By btn = By.xpath("//input[@type='submit']");
		By contacts = By.xpath("//a[@title='Contacts']");
		//By select  =By.xpath("//a[text()='Mahendra KanchamReddy']/parent::td/preceding-sibling::td");
		By remainingValue = By.xpath("//a[text()='Mahendra KanchamReddy']/parent::td/following-sibling::td");
		driver.findElement(username).sendKeys("akhilch90");
		driver.findElement(password).sendKeys("5100aA@123");
		driver.findElement(btn).click();
		
		driver.switchTo().frame(1);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(contacts)).click();
		
		//String locator = "//a[text()='Raj Kiran Gorantla']/parent::td/preceding-sibling::td";
		
		//driver.findElement(select).click();
		
//		selectContact("Mahendra KanchamReddy");
//		selectContact("Raj Kiran Gorantla");
//		String mailId = getMailId("akhil chennuru");
//		System.out.println(mailId);
		
		printTable();
		
		
	}
	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td";
		driver.findElement(By.xpath(xpath)).click();
		}
	public static String getMailId(String Name) {
		String xpath ="(//a[text()='"+Name+"']/parent::td//following-sibling::td)[5]/a";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public static void printTable() {
		String part1 = "(((//form[@id='vContactsForm']//tbody)[1]/tr)[";
		String part2 = "]/td)[";
	
		
		for(int i=3;i<=6;i++) {
			for(int j=1;j<=8;j++) {
				String xpath = part1 +i+part2 +j+"]";
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.print("  "+text);
			}
			System.out.println();
			
		}
		
	}

}
