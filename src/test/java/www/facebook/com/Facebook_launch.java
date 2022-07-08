package www.facebook.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Mavenproject.Base;

public class Facebook_launch extends Base {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\driver\\chromedriver.exe");
		
		driver=browser_Launch("chrome");
		
		driver=app_Lanch("https://www.facebook.com/login");
		WebElement email = driver.findElement(By.id("email"));
	Thread.sleep(2000);
	sendvalue(email,"ayya@gmail");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		sendvalue(pwd,"ayya@1234");
		
		//driver.get("https://www.facebook.com/");
		
		//clickOnButton();
		
		screenshot("snp2");
		//driver.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
