package Test;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority =0)
	public void loginTest() {
		System.out.println("login to app");
		//int a = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("search Test");
	}
//TestNg is a unit testing frame work
	//Never create any dependency because it is unit testing 
	//Every test should have its own pre conditions ,test steps,assertion,status.

}
