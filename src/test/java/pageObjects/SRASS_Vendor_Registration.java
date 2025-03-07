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
	
	@FindBy(id="contact_email")
	WebElement text_contactemail;
	
	@FindBy(id="official_address")
	WebElement text_address;
	
	@FindBy(id="country")
	WebElement clk_country;

	@FindBy(id="gst_no")
	WebElement text_gstNo;
	
	@FindBy(id="pan_no")
	WebElement text_panNo;
	
	@FindBy(xpath="(//*[text()='Next Step'])[1]")
	WebElement btn_nextsteps;
	
	
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
	
	public void text_contactemail(String Vendoremail) {
		text_contactemail.sendKeys(Vendoremail);
	}
	
	public void text_address(String VendorAddress) {
		text_address.sendKeys(VendorAddress);
	}
	
	public void text_gstNo(String VendorGSTNo) {
		text_gstNo.sendKeys(VendorGSTNo);
	}
	
	public void text_panNo(String VendorPANno) {
		text_panNo.sendKeys(VendorPANno);
	}
	
	public void btn_nextsteps() {
		btn_nextsteps.click();
	}

	
}
