package www.testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSimpleAn {
	
	@BeforeSuite
	public void setup() {
		System.out.println("System setproperty");
			}
			
	@BeforeTest
			public void LaunchBrowser() {
		System.out.println("browser launch");
			}
	@BeforeClass
	public void launchUrl() {
System.out.println("url launch");
	}
	
	
	@BeforeMethod
			public void Login() {
		System.out.println("Login");
					}
	
	@Test
			public void search_Laptop() {
		System.out.println("search_Laptop");
					}
	
	@Test
			public void search_Mobile() {
		System.out.println("search_Mobile");
							}
	
	@AfterMethod
			public void verify() {
		System.out.println("verify");
							}
	
	@AfterClass
			public void Logout() {
		System.out.println("logout");
									}
	
	@AfterTest
			public void closeBrowser() {
		System.out.println("closebrowser");
									}
	
	@AfterSuite
			public void delete_Cookies() {
		System.out.println("Delete cookies");
			}
			
			
	}


