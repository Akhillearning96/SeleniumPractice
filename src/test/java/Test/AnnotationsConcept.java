package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**BS--DBConnection
BT--createUser
BC--launchBrowser
BM--loginToApp
accountInfoTest
AM--logout
BM--loginToApp
userInfoTest
AM--logout
AC--closeBrowser
AT--deleteUeser
PASSED: accountInfoTest
PASSED: userInfoTest


 */
public class AnnotationsConcept {
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS--DBConnection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT--createUser");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--launchBrowser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM--loginToApp");
		
	}
	@Test
	public void userInfoTest() {
		System.out.println("userInfoTest");
		
	}
	@Test
	public void accountInfoTest() {
		System.out.println("accountInfoTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--deleteUeser");
	}
	@AfterSuite
	public void disConnectDB() {
		System.out.println("AS--disconnectDB");
	}

}
