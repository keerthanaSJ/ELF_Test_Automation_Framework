package testDataSample;

import org.automation.base.Base_Test_tricentis;
import org.automation.base.Homepage_tricentis;
import org.testng.annotations.Test;

public class Auto_function_camper {

	public class Auto_function_camp extends Base_Test_tricentis {
		@Test
		public void auto() {
		Homepage_tricentis hp= new Homepage_tricentis(driver);
		hp.getcamper().click();
		}
	}
}
