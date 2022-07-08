package www.adactintestrunner.com;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Mavenproject.Base;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src\\test\\java\\www\\adactinfeatures\\com\\AdactinFeature.feature",glue = "www.adactinstepdefinition.com")


public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_launch() {
		driver=Base.browser_Launch("chrome");

	}
	
	
@AfterClass
	public static void close_browser() {

		Base.closeDriver();
		
	
		
	}
	
	
}
