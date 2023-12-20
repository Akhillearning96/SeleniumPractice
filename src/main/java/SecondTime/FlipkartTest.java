package SecondTime;

public class FlipkartTest {

	public static void main(String[] args) {
		BrowserUtili b = new BrowserUtili();
		b.launchBrowser("firefox");
		b.enterUrl("https://www.flipkart.com/");
		String url = b.getAppCurrentUrl();
		System.out.println(url);
		String title = b.getPageTitle();
		System.out.println(title);
		
	
	}

}
