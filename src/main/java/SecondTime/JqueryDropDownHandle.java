package SecondTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.Jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By input =By.cssSelector("#justAnInputBox.comboTreeInputBox");
		driver.findElement(input).click();
		Thread.sleep(3000);
		By selectCh = By.xpath("//div[@class='comboTreeDropDownContainer' and @style='display: block;']//ul/li/span");
		//Test case-1 : single choice selection
		//selectChoice(selectCh,"choice 1");
		
		//Test case-2 : multiple choice selection
		//selectChoice(selectCh,"choice 2","choice 3");
		
		//Test casee-3 : multiple choice selection
		selectChoice(selectCh,"all");
	}
	public static void selectChoice(By locator ,String...value) {
	List<WebElement> choiceList =  driver.findElements(locator);
	if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement e : choiceList) {
			String text =e.getText();
			//System.out.println(text);
			for(int i=0;i<value.length;i++) {
				if(text.equals(value[i])) {
					e.click();
					break;
				}
			}
		}
	}else {
		try {
		for(WebElement e:choiceList) {
			e.click();
		}
	}
	catch(ElementClickInterceptedException e){
		
	}
	}
		
		
		
	}

}
