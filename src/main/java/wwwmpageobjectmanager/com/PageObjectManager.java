package wwwmpageobjectmanager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.www.Login;
import com.pom.www.searchHotel;

public class PageObjectManager {

	WebDriver driver;
	private Login login;

	public Login getLogin() {
		
		login=new Login(driver);
		return login;
	}
	private searchHotel searchhotel;
		
 public searchHotel getSearchHotel() {
	 searchhotel=new searchHotel(driver);
		return searchhotel;
	}






public PageObjectManager(WebDriver pomfinal) {
	 driver=pomfinal;
	 PageFactory.initElements(driver, this);
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
}
