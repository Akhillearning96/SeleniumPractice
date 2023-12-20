package Practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoTestClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=17293140982303952416&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		By click = By.xpath("//select[@id='searchDropdownBox']");
		WebElement ele = driver.findElement(click);
		Select select = new Select(ele);
		List<WebElement> dropDownList = select.getOptions();
		for(WebElement e: dropDownList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Baby")) {
				e.click();
				break;
			}
		}
	}

}
