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

	public class Grouping {
		
		@Test(groups = "smoketest1")
		public void setup() {
			System.out.println("System setproperty");
				}
				
		@Test(groups = "smoketest1")
				public void LaunchBrowser() {
			System.out.println("browser launch");
				}
		@Test(groups = "smoketest1")
		public void launchUrl() {
	System.out.println("url launch");
		}
		
		
		@Test(groups = "smoketest1")
				public void Login() {
			System.out.println("Login");
						}
		
		@Test(groups = "smoketest1")
				public void search_Laptop() {
			System.out.println("search_Laptop");
						}
		
		@Test(groups = "smoketest2")
				public void search_Mobile() {
			System.out.println("search_Mobile");
								}
		
		@Test(groups = "smoketest2")
				public void verify() {
			System.out.println("verify");
								}
		
		@Test(groups = "smoketest2")
				public void Logout() {
			System.out.println("logout");
										}
		
		@Test(groups = "smoketest2")
				public void closeBrowser() {
			System.out.println("closebrowser");
										}
		
		@Test(groups = {"smoketest1", "smoketest2"})
				public void delete_Cookies() {
			System.out.println("Delete cookies");
				}
				
				
		}





