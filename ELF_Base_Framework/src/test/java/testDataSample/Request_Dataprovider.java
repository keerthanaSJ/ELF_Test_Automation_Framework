package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Homepage_tricentis;
import org.automation.element_repository.Request_demoPage;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Request_Dataprovider  {
	public ReadTestData readData;

	@DataProvider
	public String[][] requestdata(){
		readData =new ReadTestData();
		String[][] RequestDemo=readData.readAllDataFromExcel("requestdemo");
		return RequestDemo;

	}
	@Test(dataProvider="requestdata")
	public void requestdemo(String []requestdemodata ) {
		String email=requestdemodata[0];
		String firstnaame=requestdemodata[1];
		String lastname=requestdemodata[2];
		String country=requestdemodata[3];
		String phone=requestdemodata[4];
		String company=requestdemodata[5];
		String role=requestdemodata[6];
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(readData.readDataFromPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
			 Homepage_tricentis hp=new  Homepage_tricentis(driver);
		hp.getdownloadtrial().click();
		
		//ut.switchToASpecificTitledWindow(driver, role);
		UtilityMethods ut=new UtilityMethods(); 
		String title="Tricentis Tosca Continuous Testing Platform Demo";
		ut.switchToASpecificTitledWindow(driver,title);
		
		Request_demoPage dp=new Request_demoPage(driver);
		dp.Request_Demo(email, firstnaame, lastname, country, phone, company, role);
			
		driver.close();

	}
	

}
