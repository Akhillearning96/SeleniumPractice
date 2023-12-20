package SecondTime;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//By frame = By.xpath("//frame[@name='main']");
		//WebDriver frame1 =driver.switchTo().frame(driver.findElement(frame));
    	
	    
	
		
				

	}

}
