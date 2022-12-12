package testDataSample;

import org.automation.base.Base_Test_tricentis;
import org.automation.base.Homepage_tricentis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class About_click extends Base_Test_tricentis {

	@Test
	public void auto() {
	Homepage_tricentis hp= new Homepage_tricentis(driver);
	hp.getabout_click().click();
	}
	
	
}
