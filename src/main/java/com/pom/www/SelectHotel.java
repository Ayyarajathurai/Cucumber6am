package com.pom.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	WebDriver driver;
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getContinu() {
		return continu;
	}
	
	public SelectHotel(WebDriver driver) {
		driver=this.driver;
PageFactory.initElements(driver,this);
		
		
	}
	

}
