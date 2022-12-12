package testDataSample;

import org.automation.base.Base_Test_tricentis;
import org.automation.base.Homepage_tricentis;
import org.testng.annotations.Test;

public class Products_click extends Base_Test_tricentis{

	@Test
	public void auto() {
	Homepage_tricentis hp= new Homepage_tricentis(driver);
	hp.getabout_products().click();
	}
	

}
