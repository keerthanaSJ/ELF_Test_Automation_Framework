

package org.automation.element_repository;


import org.automation.base.Homepage_tricentis;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Keerthana
 *
 */

public class Automobile_Page extends Homepage_tricentis{

	public Automobile_Page(WebDriver driver) {
		super(driver);
	}

@FindBy(id = "make") 
	 WebElement select_make_dropdown;

	@FindBy(id = "engineperformance") 
	 WebElement engineperformance_textfield;

	@FindBy(id  ="dateofmanufacture") 
	 WebElement dateofmanufacture_textfield;

	@FindBy(id  ="numberofseats") 
	 WebElement numberofseats_dropdown;

	@FindBy(id  ="fuel") 
	 WebElement fuel_dropdown;

	@FindBy(id  ="listprice") 
	 WebElement listprice_textfield;

	@FindBy(id  ="licenseplatenumber") 
	 WebElement licenseplatenumber_textfield;

	@FindBy(id  ="annualmileage") 
	 WebElement annualmileage_textfield;	//8


	@FindBy(id  ="nextenterinsurantdata") 
	 WebElement nextenterinsurantdata_button;

	@FindBy(id  ="firstname") 
	 WebElement firstname_textfield;

	@FindBy(id  ="lastname") 
	 WebElement lastname_textfield;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[1]")
	 WebElement gendermale_radiobutton;

	@FindBy(id ="birthdate") 
	 WebElement birthdate_textfield;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-radio')])[2]") 
	 WebElement genderfemale_radiobutton;

	@FindBy(id  ="streetaddress") 
	 WebElement streetaddress_textfield;

	@FindBy(id  ="country") 
	 WebElement country_dropdown;		//16

	@FindBy(id  ="zipcode") 
	 WebElement zipcode_textfield;

	@FindBy(id  ="city") 
	 WebElement city_textfield;

	@FindBy(id  ="occupation") 
	 WebElement occupation_textfield;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[1]") 
	 WebElement speeding_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[2]") 
	 WebElement bungeejumping_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[3]") 
	 WebElement cliffdiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[4]") 
	 WebElement skydiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[5]") 
	 WebElement other_checkbox;			//24

	@FindBy(id  ="website") 
	 WebElement website_textfield;

	@FindBy(id  ="picture") 
	 WebElement picture_textfield;

	@FindBy(id  ="open") 
	 WebElement open_button;

	@FindBy(id  ="preventervehicledata") 
	 WebElement preventervehicledata_button;

	@FindBy(id  ="nextenterproductdata") 
	 WebElement nextenterproductdata_button;

	@FindBy(id  ="startdate") 
	 WebElement startdate_textfield;

	@FindBy(id  ="insurancesum") 
	 WebElement insurancesum_dropdown;

	@FindBy(id  ="meritrating") 
	 WebElement meritrating_dropdown;		//32

	@FindBy(id  ="damageinsurance") 
	 WebElement damageinsurance_dropdown;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[6]")
	 WebElement EuroProtection_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[7]")
	 WebElement LegalDefenseInsurance_checkbox;

	@FindBy(id = "courtesycar")
	 WebElement courtesycar_dropdown;

	@FindBy(id = "preventerinsurancedata")
	 WebElement preventerinsurancedata_button;

	@FindBy(id = "nextselectpriceoption")
	 WebElement nextselectpriceoption_button;	//38



	//================Getters or Public services================

	public WebElement getPleaseSelectDropdown() {
		return select_make_dropdown;
	}

	public WebElement getEngineperformance_textfield() {
		return engineperformance_textfield;
	}

	public WebElement getDateofmanufacture_textfield() {
		return dateofmanufacture_textfield;
	}


	public WebElement getNumberofseats_dropdown() {
		return numberofseats_dropdown;
	}

	public WebElement getFuel_dropdown() {
		return fuel_dropdown;
	}

	public WebElement getListprice_textfield() {
		return listprice_textfield;
	}												//6

	public WebElement getLicenseplatenumber_textfield() {
		return licenseplatenumber_textfield;
	}

	public WebElement getAnnualmileage_textfield() {
		return annualmileage_textfield;
	}

	public WebElement getNextenterinsurantdata_button() {
		return nextenterinsurantdata_button;
	}

	public WebElement getFirstname_textfield() {
		return firstname_textfield;
	}

	public WebElement getLastname_textfield() {
		return lastname_textfield;
	}

	public WebElement getGendermale_radiobutton() {			//12
		return gendermale_radiobutton;
	}

	public WebElement getGenderfemale_radiobutton() {
		return genderfemale_radiobutton;
	}

	public WebElement getBirthdate_textfield() {
		return birthdate_textfield;
	}

	public WebElement getStreetaddress_textfield() {
		return streetaddress_textfield;
	}

	public WebElement getCountry_dropdown() {
		return country_dropdown;
	}

	public WebElement getZipcode_textfield() {
		return zipcode_textfield;
	}

	public WebElement getCity_textfield() {
		return city_textfield;
	}

	public WebElement getOccupation_textfield() {		//18
		return occupation_textfield;
	}

	public WebElement getSpeeding_checkbox() {
		return speeding_checkbox;
	}

	public WebElement getBungeejumping_checkbox() {
		return bungeejumping_checkbox;
	}

	public WebElement getCliffdiving_checkbox() {
		return cliffdiving_checkbox;
	}

	public WebElement getSkydiving_checkbox() {
		return skydiving_checkbox;
	}

	public WebElement getOther_checkbox() {
		return other_checkbox;
	}

	public WebElement getWebsite_textfield() {			//24
		return website_textfield;
	}

	public WebElement getPicture_textfield() {
		return picture_textfield;
	}

	public WebElement getOpen_button() {
		return open_button;
	}

	public WebElement getPreventervehicledata_button() {
		return preventervehicledata_button;
	}

	public WebElement getNextenterproductdata_button() {
		return nextenterproductdata_button;
	}

	public WebElement getStartdate_textfield() {
		return startdate_textfield;
	}

	public WebElement getInsurancesum_dropdown() {			//30
		return insurancesum_dropdown;
	}

	public WebElement getMeritrating_dropdown() {
		return meritrating_dropdown;
	}

	public WebElement getDamageinsurance_dropdown() {
		return damageinsurance_dropdown;
	}

	public WebElement getEuroProtection_checkbox() {
		return EuroProtection_checkbox;
	}

	public WebElement getLegalDefenseInsurance_checkbox() {
		return LegalDefenseInsurance_checkbox;
	}

	public WebElement getCourtesycar_dropdown() {
		return courtesycar_dropdown;
	}

	public WebElement getPreventerinsurancedata_button() {		//37
		return preventerinsurancedata_button;
	}

	public WebElement getNextselectpriceoption_button() {		//38
		return nextselectpriceoption_button;
	}

	//================Business Logic or Action methods or Behavior================
	
	
	public void automobileInsurance(String selectdropdown,String engine,String date,String numberofseats,String fuel,String list_price,
			String licenseplateno,String annual_mileage,String firstName,String lastName,String DOB,String gender,String streetaddress,
			String countrydropdown,String zipcode,String city,String occupation,String website,String startdate,String insurancesumdrop,
			String meritratedrop,String damageinsuranacedrop, String courtesycardrop) {

		

		UtilityMethods util = new UtilityMethods();

		util.selectDropDown(getPleaseSelectDropdown(), selectdropdown);

		getEngineperformance_textfield().sendKeys(engine);

		getDateofmanufacture_textfield().sendKeys(date);

		util.selectDropDown(getNumberofseats_dropdown(), numberofseats);

		util.selectDropDown(getFuel_dropdown(), fuel);

		getListprice_textfield().sendKeys(list_price);

		getLicenseplatenumber_textfield().sendKeys(licenseplateno);

		getAnnualmileage_textfield().sendKeys(annual_mileage);

		getNextenterinsurantdata_button().click();

		getFirstname_textfield().sendKeys(firstName);

		getLastname_textfield().sendKeys(lastName);

		getBirthdate_textfield().sendKeys(DOB);

		if(gender.equalsIgnoreCase("MALE")) 
			gendermale_radiobutton.click();
		else 
			genderfemale_radiobutton.click();
		
		
		getStreetaddress_textfield().sendKeys(streetaddress);


		util.selectDropDown(getCountry_dropdown(), countrydropdown);

		getZipcode_textfield().sendKeys(zipcode);

		getCity_textfield().sendKeys(city);

		util.selectDropDown(getOccupation_textfield(), occupation);

		getSpeeding_checkbox().click();

		getBungeejumping_checkbox().click();

		getCliffdiving_checkbox().click();

		getSkydiving_checkbox().click();

		getOther_checkbox().click();

		getWebsite_textfield().sendKeys(website);

		//use robot class
		//getOpen_button().click();

		getNextenterproductdata_button().click();

		getStartdate_textfield().sendKeys(startdate);

		util.selectDropDown(getInsurancesum_dropdown(), insurancesumdrop);

		util.selectDropDown(getMeritrating_dropdown(), meritratedrop);

		util.selectDropDown(getDamageinsurance_dropdown(),damageinsuranacedrop);

		getEuroProtection_checkbox().click();

		getLegalDefenseInsurance_checkbox().click();

		util.selectDropDown(getCourtesycar_dropdown(), courtesycardrop);

		getNextselectpriceoption_button().click();



	}
	}