package SecondTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//*[@id="countries"]/tbody/tr[2]/td[2]
		//*[@id="countries"]/tbody/tr[3]/td[2]
		//*[@id="countries"]/tbody/tr[2]/td[2]
		
	String beforeXpath ="//*[@id=\"countries\"]/tbody/tr[";
	String middleXpath ="]/td[";
	String lastXpath = "]";
	int rowCount = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr")).size();
	int colCount = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td")).size();
	
	Thread.sleep(5000);
	for(int row=2;row<=rowCount;row++) {
		for(int col=2;col<=colCount;col++) {
			String xPath = beforeXpath + row + middleXpath + col + lastXpath;
			//System.out.println(xPath);
			String text = driver.findElement(By.xpath(xPath)).getText();
			System.out.print(text+"   : ");
			
		}
		System.out.println();
	}

	}

}
