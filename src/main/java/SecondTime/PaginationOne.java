package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.babynames.merschat.com/popular.cgi");
		
		List<WebElement> nameList = driver.findElements(By.xpath("//a[text()=' Ediz ']"));
		
		while(true) {
			if(nameList.size()==1) {
				String text = driver.findElement(By.xpath("(//a[text()=' Ediz ']/../parent::td//following-sibling::td)[2]//a")).getAttribute("title");
				System.out.println(text);
				break;
			}else {
				driver.findElement(By.xpath("//font[text()='Next']")).click();
				nameList = driver.findElements(By.xpath("//a[text()=' Ediz ']"));
				
			}
			
		}

	}

}
