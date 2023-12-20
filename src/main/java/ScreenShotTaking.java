import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTaking {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com");
		
		//convert the web driver object to screenshot
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		//call getScreenshot method to create image file
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move img file to new destination
		File destFile = new File(".//SeleniumPractice/src/test/resources/screenshot/screenshot");
		//copy file at destination
		FileUtils.copyFile(srcFile, destFile);
	}

}
