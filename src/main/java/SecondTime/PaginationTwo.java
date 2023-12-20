package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTwo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.babynames.merschat.com/popular.cgi");
		
		List<WebElement> nameList = driver.findElements(By.xpath("//a[text()=' Amoora ']"));
		int count = 0;
		while(true) {
			if(nameList.size()==1) {
				String text = driver.findElement(By.xpath("(//a[text()=' Amoora ']/../parent::td//following-sibling::td)[2]//a")).getAttribute("title");
				System.out.println(text);
				break;
			}else {
				WebElement we = driver.findElement(By.xpath("//select[@name='page']"));
				Select select = new Select(we);
				select.selectByIndex(count);
				driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
				nameList = driver.findElements(By.xpath("//a[text()=' Amoora ']"));
				count++;
			}
			
			
		}


	}

}
