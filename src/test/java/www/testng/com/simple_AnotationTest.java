package www.testng.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simple_AnotationTest {
WebDriver driver;

@BeforeSuite
	public void setup() {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\driver\\chromedriver.exe");
	  System.out.println("System setproperty");
		
			}

	@BeforeTest	
	public void browserLaunch() {

		 driver=new ChromeDriver();
System.out.println("launch browser");
	}
	
	@BeforeClass
			public void Launchurl() {
		
		driver.get(" http://adactinhotelapp.com/");
		System.out.println("launch the url");
			}
	
	@BeforeMethod
			public void Login() throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ayya1994");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ayya@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		System.out.println("Login");
					}
	@Test
			public void search_Hotel() {
		WebElement dd = driver.findElement(By.xpath("//select[@name='location']"));
		Select dd1 = new Select(dd);
		dd1.selectByIndex(2);
		WebElement dd2 = driver.findElement(By.id("hotels"));
		Select dd3 = new Select(dd2);
		dd3.selectByVisibleText("Hotel Hervey");
		WebElement dd4 = driver.findElement(By.id("room_type"));
		Select dd5 = new Select(dd4);
		dd5.selectByIndex(2);
		WebElement dd6 = driver.findElement(By.id("room_nos"));
		Select dd7 = new Select(dd6);
		dd7.selectByIndex(6);
		WebElement date=driver.findElement(By.name("datepick_in"));
		date.clear();
		date.sendKeys("14/05/2022");
		WebElement date1=driver.findElement(By.name("datepick_out"));
		date1.clear();
		date1.sendKeys("20/05/2022");
		WebElement a1 = driver.findElement(By.name("adult_room"));
		Select ar = new Select(a1);
		ar.selectByIndex(2);
//		WebElement a2 = driver.findElement(By.name("child_room"));
//		Select cr = new Select(a2);
//		cr.selectByIndex(2);
		WebElement z1 = driver.findElement(By.name("Submit"));
		z1.click();
		System.out.println("Second Page: Completed");
		
		System.out.println("search_Hotel");
					}
			@Test
			public void search_Mobile() {
				WebElement z2 = driver.findElement(By.id("radiobutton_0"));
				z2.click();
				WebElement z3 = driver.findElement(By.id("continue"));
				z3.click();
				WebElement f1 = driver.findElement(By.id("first_name"));
				f1.sendKeys("Priya");
				WebElement l1 = driver.findElement(By.id("last_name"));
				l1.sendKeys("William");
				WebElement address = driver.findElement(By.id("address"));
				address.sendKeys("chrompet,chennai");
				WebElement cn = driver.findElement(By.name("cc_num"));
				cn.sendKeys("4321 8765 1098 1234");
				WebElement cct = driver.findElement(By.id("cc_type"));
				Select cct1 = new Select(cct);
				cct1.selectByIndex(2);
				WebElement expirymonth = driver.findElement(By.name("cc_exp_month"));
				Select em = new Select(expirymonth);
				em.selectByIndex(8);
				WebElement expiryyear = driver.findElement(By.name("cc_exp_year"));
				Select ey = new Select(expiryyear);
				ey.selectByValue("2022");
				WebElement cvv = driver.findElement(By.name("cc_cvv"));
				cvv.sendKeys("143");
				WebElement book = driver.findElement(By.id("book_now"));
				book.click();
				WebElement it = driver.findElement(By.name("my_itinerary"));
				it.click();
				WebElement cb = driver.findElement(By.name("ids[]"));
				cb.click();
				WebElement cancel = driver.findElement(By.name("cancelall"));
				cancel.click();
				
				System.out.println("search_Mobile");
									}
			@AfterMethod
					public void verify() {
				
				
				System.out.println("verify");
									}
			@AfterClass
			
					public void Logout() {
				Alert alert = driver.switchTo().alert();
					alert.accept();
					WebElement logout = driver.findElement(By.name("logout"));
					logout.click();
					System.out.println("Final Page: Completed");
				System.out.println("logout");
											}
			@AfterTest
					public void closeBrowser() {
				System.out.println("closebrowser");
											}
			@AfterSuite
					public void delete_Cookies() {
				driver.manage().deleteAllCookies();
				System.out.println("Delete cookies");
					}
}
