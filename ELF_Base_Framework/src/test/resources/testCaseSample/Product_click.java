import org.automation.base.Base_Test_tricentis;
import org.automation.base.Homepage_tricentis;
import org.testng.annotations.Test;

public class Product_click extends Base_Test_tricentis  {

	@Test
	public void sample() throws InterruptedException {
		Homepage_tricentis home =new Homepage_tricentis();
		home.getautomobile().click();
	
	}

}
