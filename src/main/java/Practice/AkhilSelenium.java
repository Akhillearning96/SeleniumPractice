package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class AkhilSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\akhil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://collegedunia.com/university/54852-vel-tech-rangarajan-dr-sagunthala-r-and-d-institute-of-science-and-technology-vel-tech-chennai");
	
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}

}
