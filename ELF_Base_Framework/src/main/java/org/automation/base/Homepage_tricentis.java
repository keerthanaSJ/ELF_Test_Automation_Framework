package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_tricentis {

	//CONSTRUCTOR
	public WebDriver driver;
	public Homepage_tricentis (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	//WebElement 
	@FindBy(id = "nav_automobile")
	private WebElement automobile;

	@FindBy(id = "nav_truck")
	private WebElement Truck;

	@FindBy(id = "nav_motorcycle")
	private WebElement motor;

	@FindBy(id = "nav_camper")
	private WebElement camper;

	@FindBy(id = "search_form")
	private WebElement searchsupport;

	@FindBy(id = "downloadtrial")
	private WebElement requestdemo;

	@FindBy(id = "visitsupport")
	private WebElement register;

	@FindBy(id = "tricentis_products")
	private WebElement product_click;

	@FindBy(id = "tricentis_about")
	private WebElement about_click;
	
	@FindBy(id = "tricentis_products")
	private WebElement about_products;

	@FindBy(id = "tricentis_events")
	private WebElement tricentis_events;
	
	@FindBy(id = "tricentis_resources")
	private WebElement tricentis_resources;

	// methods

	public WebElement getautomobile() {
		return automobile;
	}
	public WebElement getTruck() {
		return Truck;
	}
	public WebElement getmotorcycle() {
		return motor;
	}
	public WebElement getcamper() {
		return camper;
	}
	public WebElement getsearchform() {
		return searchsupport;
	}
	public WebElement getdownloadtrial() {
		return requestdemo;
	}

	public WebElement getvisitsupport() {
		return register;
	}

	public WebElement getproduct() {
		return product_click;
	}

	public WebElement getabout_click() {
		return about_click;
	}
	
	public WebElement getabout_products() {
		return about_products;
	}
	
	public WebElement getevent_webinars() {
		return tricentis_events;
	}
	
	public WebElement gettricentis_resources() {
		return tricentis_resources;
	}

}



