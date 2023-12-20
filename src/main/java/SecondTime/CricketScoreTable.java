package SecondTime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/75525/aus-vs-ned-24th-match-icc-cricket-world-cup-2023");
		
		
		//*[@id="innings_1"]/div[1]/div[3]/div
		//*[@id="innings_1"]/div[1]/div[4]
		Thread.sleep(3000);
		//getWicketTaker("Maxwell");
		List<String> result = getPlayerPerformence("Maxwell");
		for(String e : result) {
			System.out.println(e);
		}
	}
	public static void getWicketTaker(String BatsmanName) {
		String xpath = "(//div[@id='innings_1']//a[text()=' "+BatsmanName+" ']//parent::div/following-sibling::div)[1]";
		String text = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(text);
	
	}
	public static List<String> getPlayerPerformence(String playerName) {
		String xpath = "(//a[text()=' "+playerName+" ']/parent::div)[1]/following-sibling::div";
		List<WebElement> list =driver.findElements(By.xpath(xpath));
		List<String> playerScore = new ArrayList<String>();
		for(WebElement e : list) {
			String text = e.getText();
			playerScore.add(text);
		}
		return playerScore;
		
		
	}

}
