package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		//alert
		//confirmation popup
		//warning/error popup
		//submission popup
		//modal dialog
		//JS popup
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//writing validation point
		if(text.equals("please enter a valid user name")){
			System.out.println("correct validation message");
		}
		alert.accept();//click on ok (accepting the popup)
		alert.dismiss();//press escape/click on cancel/dismiss the alert

	}

}
