package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SRASS_Vendor_Registration extends BasePage {

	public SRASS_Vendor_Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Vendor Registration(Register Now)
	@FindBy(xpath="(//*[text()='Register Now'])[1]")
	WebElement clk_regi_Btn;
	
	@FindBy(id="company_name")
	WebElement text_companyname;
	
	@FindBy(id="utm_creation_source")
	WebElement text_UtmSource;
	
	@FindBy(id="spoc_name")
	WebElement text_Spocname;
	
	@FindBy(id="contact_no")
	WebElement text_contactno;
	
	@FindBy(id="alternet_contact_no")
	WebElement clk_alternatenumber;
	
	@FindBy(id="contact_email")
	WebElement clk_contactemail;
	
	@FindBy(id="country")
	WebElement clk_country;

	@FindBy(id="state")
	WebElement clk_state;
	
	@FindBy(id="district")
	WebElement clk_district;
	
	@FindBy(xpath="(//*[text()='Next Step'])[1]")
	WebElement clk_nextstep_btn;
	
	
	public void clk_regi_Btn() {
		clk_regi_Btn.click();
		
	}
	
	public void text_companyname(String CompanyName) {
		text_companyname.sendKeys(CompanyName);
		
	}
	
	public void text_UtmSource(String UTMSource) {
		text_UtmSource.sendKeys(UTMSource);	
	}
	
	public void text_Spocname(String Spocname) {
		text_Spocname.sendKeys(Spocname);	
	}
	
	public void text_contactno(String vendormobile) {
		text_contactno.sendKeys(vendormobile);
	}
	
	public void clk_contactemail(String Vendoremail) {
		clk_contactemail.sendKeys(Vendoremail);
	}

}
