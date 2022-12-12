package testDataSample;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.automation.element_repository.Register_Page;

import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class REGISTER_DATAPROVIDER {
public ReadTestData readData;
	
@DataProvider
public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
	readData = new ReadTestData();
	String[][ ] registerationData = readData.readAllDataFromExcel("Register");
	return registerationData;
}
@Test(dataProvider="multipleNewUsersData")
public void registerUser(String [] registrationData) {
	
	String sal = registrationData[0];
	String Firstname = registrationData[1];
	String Lastname = registrationData[2];
	String Mobile= registrationData[3];
	String Country= registrationData[4];
	String StreetNo=registrationData[5];
	String City=registrationData[6];
	String zipcode=registrationData[7];
	String Language=registrationData[8];
	String TimeZone=registrationData[9];
	String BussniessEmail=registrationData[10];
	String ConfrmEmail=registrationData[11];
	String Password=registrationData[12];
	String Confrimpassword=registrationData[13];
	String Reg_code=registrationData[14];
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(readData.readDataFromPropertyFile("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Login_Page loginPage = new Login_Page(driver);
	//loginPage.getRegisterLink().click();
	 String parent_Window=driver.getWindowHandle();
	 System.out.println(parent_Window);
	 
	 driver.findElement(By.id("visitsupport")).click();
	Set<String> total_Window=driver.getWindowHandles();
	System.out.println(total_Window);
	for(String child_window:total_Window){
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
	
	Register_Page vir = new Register_Page(driver);
	vir.registerUser(parent_Window, Firstname, Lastname, ConfrmEmail, Confrimpassword);
	driver.quit();


}
}
}

