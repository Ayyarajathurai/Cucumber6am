package www.adactinstepdefinition.com;
import org.openqa.selenium.WebDriver;

import com.Mavenproject.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import www.adactintestrunner.com.TestRunner;
import wwwmpageobjectmanager.com.PageObjectManager;

public class StepDef extends Base {
	
	
	WebDriver driver=TestRunner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	@Given("user Lanuch The Adactin Application")
	public void user_lanuch_the_adactin_application() {
		app_Lanch("http://adactinhotelapp.com/");
		
	}
	@When("user Enter The Username In Inputbx")
	public void user_enter_the_username_in_inputbx() {
		sendvalue(pom.getLogin().getUsername(), "ayya1994");
		
	}
	@When("user Enter The Password In Inputbx")
	public void user_enter_the_password_in_inputbx() {
	 
		sendvalue(pom.getLogin().getPassword(), "Ayya@123");
	}
	@Then("user ClickOn The LoginBtn Its Navigate To SearchHotel")
	public void user_click_on_the_login_btn_its_navigate_to_search_hotel() {
	   
		clickOnButton(pom.getSearchHotel().getSearch());
	}



	
		
	
	    
		
		
	}



	



