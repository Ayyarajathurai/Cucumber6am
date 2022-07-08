package com.Mavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	static WebDriver driver;

	
	
		public static WebDriver browser_Launch(String browser) {
			
if(browser.equalsIgnoreCase("chrome")) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\driver\\chromedriver.exe");
		
		
		 driver=new ChromeDriver();
		

	}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gekco.driver"," ");
			
		}
		else {
			
			System.out.println("invalid");
		}
driver.manage().window().maximize();
return driver;

		}
	public static WebDriver app_Lanch(String url) {
		driver.get(url);
		return driver;
	}	
public static WebDriver screenshot(String ssfiles) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\snopshot\\"+ssfiles+".png");
	FileUtils.copyFile(source, dest);
	
	return driver;
	

}
public static void sendvalue(WebElement element, String value) {
	
	element.sendKeys(value); 
	

}
public static void clickOnButton(WebElement element) {
	element.click();

}
public static void searchButton(WebElement element,String value) {
	element.sendKeys(value); 

}
public static void sleepConcept(int i) throws InterruptedException {
Thread.sleep(i);
}
public static void select_Method(WebElement element,String value,String type) {
Select s=new Select(element);
if(type.equalsIgnoreCase("Byvalue")){
	s.selectByValue(value);
}
else if(type.equalsIgnoreCase("Byvisibletext")) {
	s.selectByVisibleText(value);
}
	
}
public static void isEnabled(WebElement element) {

	boolean enabled = element.isEnabled();
	System.out.println("this is enabled      " +enabled);
}
public static void isDisplayed(WebElement element) {

	boolean displayed = element.isDisplayed();
	System.out.println("this is enabled      " +displayed);
}
public static void isSelected(WebElement element) {
	boolean selected = element.isSelected();
	System.out.println("is selected    "+ selected);
}
public static void closeDriver() {
driver.close();
}

}
