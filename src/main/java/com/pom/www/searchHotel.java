package com.pom.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {

WebDriver driver;
//
	@FindBy(id="location")
//	private WebElement location;
//	
//	public WebElement getLocation() {
//		return location;
//	}



	@FindBy(id="Submit")
	private WebElement search;
	

	
	public WebElement getSearch() {
		return search;
	}



	public searchHotel(WebDriver searchdriver) {
		this.driver=searchdriver;
	
	PageFactory.initElements(driver, this);
	
	
	}

	
	
	
	
	
	
	
	
}
