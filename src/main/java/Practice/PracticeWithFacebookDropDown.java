
package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeWithFacebookDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//launch facebook
		//select date of birth drop down from create account page
		
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=15461201666&extra_1=s%7Cc%7C589521732875%7Cb%7Cfacebook%20%27%7C&placement=&creative=589521732875&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D15461201666%26adgroupid%3D130924380175%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9302457%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwn_OlBhDhARIsAG2y6zNzY7xeBdKo8yJHpOSD8en423d2xLjEgmyrbUMgpZE2S-61Ya20gi8aAizwEALw_wcB");
		Thread.sleep(5000);
		
		
		By date = By.xpath("//*[@id=\"day\"]");
		By month = By.xpath("//*[@id=\"month\"]");
		By year = By.xpath("//*[@id=\"year\"]");
		doClickAndSelect(date,"19");
		doClickAndSelect(month,"Nov");
		doClickAndSelect(year,"1996");
	}
	public static WebElement getFindElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClickAndSelect(By locator, String value) {
	
		Select select = new Select(getFindElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)){
				e.click();
				break;
				
			}
		}
	}

}
