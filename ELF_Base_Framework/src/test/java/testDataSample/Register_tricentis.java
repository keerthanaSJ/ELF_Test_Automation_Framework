package testDataSample;


import org.automation.base.Homepage_tricentis;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_tricentis extends Homepage_tricentis {
	public Register_tricentis(WebDriver driver) {
		super(driver);
	}
	//WebElement
	
	@FindBy(linkText="Register") 
	private WebElement Register ;
	
	
	@FindBy(id="salutation") 
	private WebElement salutation ;
	
	
	@FindBy(id="first_name") 
	private WebElement first_name  ;
	

	@FindBy(id="last_name") 
	private WebElement last_name  ;
	
	@FindBy(id="mobile") 
	private WebElement mobile ;
	
	@FindBy(id="country") 
	private WebElement country ;
	
	@FindBy(id="street") 
	private WebElement street ;
	
	@FindBy(id="city") 
	private WebElement city  ;
	
	@FindBy(id="zip") 
	private WebElement zip ;
	

	@FindBy(id="language") 
	private WebElement language ;

	@FindBy(id="timezone") 
	private WebElement timezone ;

	@FindBy(id="email") 
	private WebElement email ;

	@FindBy(id="confirm_email") 
	private WebElement confirm_email  ;
	
	@FindBy(id="password") 
	private WebElement password ;
	
	@FindBy(id="confirm_password") 
	private WebElement confirm_password ;
	
	@FindBy(id="code") 
	private WebElement code ;
	
	@FindBy(id="checkbox_agree") 
	private WebElement checkbox_agree;
	
	@FindBy(id="recaptcha-anchor") 
	private WebElement recaptcha_anchor ;
	
	@FindBy(id="//button[type='submit']") 
	private WebElement submit ;
	
	// Methods
	public WebElement getRegister() {
		return  Register;
	}
	
	public WebElement getsalutation() {
		return salutation ;
	}
	public WebElement getfirst_name () {
		return first_name  ;
	}
	public WebElement getlast_name() {
		return last_name ;
	}
	public WebElement getmobile() {
		return mobile ;
	}
	public WebElement getcountry() {
		return country ;
	}
	public WebElement getstreet() {
		return  street  ;
	}
	public WebElement getcity() {
		return  city;
	}
	public WebElement getzip() {
		return zip ;
	}
	public WebElement getlanguage() {
		return language ;
	}
	public WebElement gettimezone() {
		return  timezone;
	}
	
	public WebElement getemail() {
		return email ;
	}
	public WebElement getconfirm_email() {
		return confirm_email ;
	}
	

	public WebElement getpassword() {
		return password  ;
	}
	public WebElement getconfirm_password() {
		return confirm_password ;
	}
	
	public WebElement getcode() {
		return   code ;
	}
	public WebElement getcheckbox_agree() {
		return checkbox_agree ;
	}
	public WebElement getrecaptcha_anchor() {
		return recaptcha_anchor  ;
	}
	public WebElement getsubmit() {
		return  submit ;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////
	public void Register_Input(String val,String fname,String lname,String num,String drop,String street1,String city1,String zip1,String lan,
			String time,String mail,String cmail,String pswd,String cpswd,String cod) {
		UtilityMethods util=new UtilityMethods();
		
	
	//	Register.click();
		util.selectDropDown(salutation,val);
		first_name.sendKeys(fname);
		last_name.sendKeys(lname);
		mobile.sendKeys(num);
		 util.selectDropDown(country,drop);
		 street.sendKeys(street1);
		 city.sendKeys(city1);
		 zip.sendKeys(zip1);
		 util.selectDropDown(language, lan);
		 util.selectDropDown(timezone,time);
		 email.sendKeys(mail);
		 confirm_email.sendKeys(cmail);
		 password .sendKeys(pswd);
		 confirm_password.sendKeys(cpswd);
		 code.sendKeys(cod);
		 checkbox_agree.click();
		 recaptcha_anchor.click();
		 submit.click();
		
	}
	
}
	