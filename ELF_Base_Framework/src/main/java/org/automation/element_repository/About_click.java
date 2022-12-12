package org.automation.element_repository;

import org.automation.base.Homepage_tricentis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class About_click extends Homepage_tricentis {

	public About_click(WebDriver driver) {
		super(driver);
	}
		@FindBy(id = "tricentis_about")
		private WebElement about_click;
		
		public WebElement about_click() {
			return about_click;
		}
	}


