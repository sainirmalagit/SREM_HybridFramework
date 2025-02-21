package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentDashboard_AlltheSidebarmenu extends BasePage {

	
	public StudentDashboard_AlltheSidebarmenu(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Home Page
	@FindBy(xpath="(//*[@value='Resume'])[1]")
    WebElement clcikOn_Home_ResumeBtn;
    @FindBy(xpath="(//*[@class='col-md-12 mb-lg-0 mb-sm-4 mb-4'])[1]")
    WebElement clkOn_Verpending_btn;
    @FindBy(xpath="(//*[@class='custom-card text-left h-100'])[1]")
    WebElement ClkOn_CourseEnrollBtn;
    @FindBy(xpath="(//*[@class='custom-card text-left h-100'])[2]")
    WebElement ClkOn_ReferallBtn;
    @FindBy(xpath="(//*[@class='custom-card text-left h-100'])[3]")
    WebElement ClkOn_HostelBtn;
    @FindBy(xpath="(//*[@class='custom-card text-left h-100'])[4]")
    WebElement ClkOn_TransportaionBtn;
    @FindBy(xpath="//*[@id='v-pills-home-tab']")
    WebElement ClkOn_HomeMenu;
    @FindBy(id="v-pills-myapplications-tab")
    
    // My Application page
    WebElement ClkOn_MyapplicationMenu;
    @FindBy(xpath="(//*[@class='btn btn-outline-secondary btn-sm '])[1]")
    WebElement ClkOn_applyMoreBtn;
    @FindBy(id="programselected")
    WebElement ClkOn_progr_drp;
    @FindBy(xpath="//*[text()='UMBA']")
    WebElement select_prog;
    @FindBy(id="courseselected")
    WebElement ClkOn_cour_drp;
    @FindBy(xpath="//*[text()='Business Analytics']")
    WebElement select_course;
    @FindBy(xpath="(//*[text()=' Apply'])[1]")
    WebElement clk_applyBtn;
    @FindBy(xpath="(//*[text()=' Cancel'])[1]")
    WebElement clk_cancelBtn;
    @FindBy(xpath="(//*[@value='Resume'])[2]")
    WebElement clk_MyAppli_ResumeBtn;
    @FindBy(xpath="//*[text()=' Make Payment']")
    WebElement clk_MyPaymentBtn;
    
    // My Documents Page
    @FindBy(id="v-pills-documents-tab")
    WebElement clk_Mydoc_sec;
    @FindBy(xpath="(//*[@class='btn btn-outline-primary btn-sm'])[1]")
    WebElement doc_uploaded;
    @FindBy(xpath="(//*[@class='btn btn-outline-secondary btn-sm'])[1]")
    WebElement doc_pending;
    @FindBy(xpath="(//*[@class='btn btn-outline-success btn-sm'])[1]")
    WebElement doc_approved;
    @FindBy(xpath="(//*[@class='btn btn-outline-danger btn-sm'])[1]")
    WebElement doc_rejected;
    @FindBy(xpath="//*[text()=' Upload Documents']")
    WebElement doc_upload_doc;
    @FindBy(id="mediatype")
    WebElement click_media_type;
    @FindBy(xpath="//*[text()='Other']")
    WebElement select_doc_type;
    @FindBy(id="medianame")
    WebElement enter_medianame;
    @FindBy(id="formdocument")
    WebElement Upload_document;
    @FindBy(xpath="//*[text()=' Upload Document']")
    WebElement upload_doc_btn;
    @FindBy(xpath="(//*[text()=' Cancel'])[2]")
    WebElement clk_upl_cancel;
    
    // My Payments page
    @FindBy(id="v-pills-Payments-tab")
    WebElement clk_mypayment_sec;
    @FindBy(id="paymenthistory-tab")
    WebElement clk_history_tab;
    @FindBy(xpath="(//*[@class='btn btn-outline-primary btn-sm'])[2]")
    WebElement clk_payments_tab;
    @FindBy(xpath="(//*[@class='btn btn-outline-success btn-sm'])[2]")
    WebElement clk_success_tab;
    @FindBy(xpath="(//*[@class='btn btn-outline-danger btn-sm'])[2]")
    WebElement clk_failed_tab;
    @FindBy(id="paymentwallet-tab")
    WebElement clk_wallet_tab;
    
    // Exam Details
    @FindBy(id="v-pills-ExamResults-tab")
    WebElement clk_examdetails_sec;
    
    // Hostel Details
    @FindBy(id="v-pills-Hostel-tab")
    WebElement clk_hosteldetails_sec;
    @FindBy(xpath="//*[@class='bi bi-building-fill']")
    WebElement clk_changehostel_btn;
    @FindBy(id="roomtypeselected")
    WebElement clk_roomtype;
    @FindBy(id="acselected")
    WebElement clk_AC_NONAC;
    @FindBy(xpath="(//*[text()='Book'])[2]")
    WebElement clk_hostbook_btn;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}



