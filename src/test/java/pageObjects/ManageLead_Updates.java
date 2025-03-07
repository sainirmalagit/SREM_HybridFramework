package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageLead_Updates extends BasePage{

	public ManageLead_Updates(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//
	
	@FindBy(xpath="(//*[@class='dx-checkbox-container'])[1]")
	WebElement Select_allBtn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-plus']")
	WebElement Create_plusBtn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-check']")
	WebElement Clik_enableBtn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-close']")
	WebElement Clik_disableBtn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-trash']")
	WebElement Clik_deleteBtn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-columnproperties']")
	WebElement Clik_mass_update_Btn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-export']")
	WebElement Clik_export_Btn;
	
	@FindBy(xpath="//*[@class='dx-icon dx-icon-columnchooser']")
	WebElement Clik_columns_chooser_Btn;
	
	@FindBy(xpath="//*[text()='Update Course']")
	WebElement mass_update_Course;
	
	@FindBy(xpath="//*[text()='Update Followup']")
	WebElement mass_update_followup;
	
	@FindBy(xpath="//*[text()='Update Councellor']")
	WebElement mass_update_councellor;
	
	@FindBy(xpath="//*[text()='Change Councellor']")
	WebElement mass_update_Change_councellor;
	
	@FindBy(xpath="//*[text()='Update Walkin']")
	WebElement mass_update_walkin;
	
	@FindBy(xpath="//*[text()='Update Lead Status']")
	WebElement mass_update_leadstatus;
	
	@FindBy(xpath="//*[text()='Update Multiple Fields']")
	WebElement mass_update_multifields;
	
	@FindBy(xpath="//*[text()='Update Lead Priority']")
	WebElement mass_update_leadpriority;
	
	@FindBy(xpath="//*[text()='Send to third party']")
	WebElement mass_update_third_party;
	
	@FindBy(xpath="//*[text()='Send SMS']")
	WebElement mass_update_sendSMS;
	
	@FindBy(xpath="//*[text()='Send WhatsApp']")
	WebElement mass_update_sendWhatsUP;
	
	@FindBy(xpath="Send Email")
	WebElement mass_update_sendEmail;
	
	@FindBy(xpath="//*[text()='Auto Dialer Call']")
	WebElement mass_update_autodialercall;
	
	@FindBy(xpath="//*[text()='Send Walkin QR Code']")
	WebElement mass_update_sendQRCODE;
	
	public void Select_allBtn() {
		Select_allBtn.click();
	}
	
	public void Create_plusBtn() {
		Create_plusBtn.click();
	}
	
	public void Clik_enableBtn() {
		Clik_enableBtn.click();
	}
	
	public void Clik_disableBtn() {
		Clik_disableBtn.click();
	}
	
	public void Clik_deleteBtn() {
		Clik_deleteBtn.click();
	}
	
	public void Clik_mass_update_Btn() {
		Clik_mass_update_Btn.click();
	}
	
	public void Clik_export_Btn() {
		Clik_export_Btn.click();
	}
	
	public void Clik_columns_chooser_Btn() {
		Clik_columns_chooser_Btn.click();
	}
	
	public void mass_update_Course() {
		mass_update_Course.click();
	}
	
	public void mass_update_followup() {
		mass_update_followup.click();
	}
	
	public void mass_update_councellor() {
		mass_update_councellor.click();
	}
	
	public void mass_update_Change_councellor() {
		mass_update_Change_councellor.click();
	}
	
	public void mass_update_walkin() {
		mass_update_walkin.click();
	}
	
	public void mass_update_leadstatus() {
		mass_update_leadstatus.click();
	}
	
	public void mass_update_multifields() {
		mass_update_multifields.click();
	}
	
	public void mass_update_leadpriority() {
		mass_update_leadpriority.click();
	}
	
	public void mass_update_third_party() {
		mass_update_third_party.click();
	}
	
	public void mass_update_sendSMS() {
		mass_update_sendSMS.click();
	}
	
	public void mass_update_sendWhatsUP() {
		mass_update_sendWhatsUP.click();
	}
	
	public void mass_update_sendEmail() {
		mass_update_sendEmail.click();
	}
	
	public void mass_update_autodialercall() {
		mass_update_autodialercall.click();
	}
	
	public void mass_update_sendQRCODE() {
		mass_update_sendQRCODE.click();
	}
	

}
