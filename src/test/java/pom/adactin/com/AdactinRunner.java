package pom.adactin.com;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Mavenproject.Base;
import com.pom.www.Login;

import wwwmpageobjectmanager.com.PageObjectManager;

public class AdactinRunner extends Base {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=browser_Launch("chrome");
		app_Lanch("http://adactinhotelapp.com/");
		
		//Login login=new Login(driver);
		PageObjectManager pom=new PageObjectManager(driver);
	sendvalue(pom.getLogin().getUsername(), "ayya1994");
	sendvalue(pom.getLogin().getPassword(), "Ayya@123");
	clickOnButton(pom.getLogin().getLoginBtn());
	sleepConcept(2000);
	//clickOnButton(pom.getSearchHotel().getLocation());
	//select_Method();
	WebElement location = driver.findElement(By.id("location"));
	location.click();
	Select s1=new Select( location);
	s1.selectByVisibleText("Sydney");
	clickOnButton(pom.getSearchHotel().getSearch());
	
	System.out.println("success");
		
		
		
	}
	
	
	

}
