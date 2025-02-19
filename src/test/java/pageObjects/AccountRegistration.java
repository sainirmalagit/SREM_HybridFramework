package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {
    // Constructor
	public AccountRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// Locators for Register an account
	
	@FindBy(id="name")
	WebElement StudentName;
	@FindBy(id="mobile_number")
	WebElement StudentMobile;
	@FindBy(id="email") 
	WebElement StudentEmail;
	@FindBy(css="#select2-state-container")
	WebElement clickStateDropdown;
	@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input") 
	WebElement clickStateSearch;
	@FindBy(xpath="(//*[text()='Andhra Pradesh'])[2]") 
	WebElement selectState;
	@FindBy(id="select2-district-container") 
	WebElement clickDistrictDropdown;
	@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input") 
	WebElement clickDistrictSearch;
	@FindBy(xpath="(//*[text()='Prakasam'])[2]") 
	WebElement selectDistrict;
	@FindBy(id="select2-programid-container") 
	WebElement clickProgramDropdown;
	@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input") 
	WebElement clickProgramSearch;
	@FindBy(xpath="(//*[text()='Engineering'])[2]") 
	WebElement selectProgram;
	@FindBy(id="select2-courseid-container") 
	WebElement clickCourseDropdown;
	@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input") 
	WebElement clickCourseSearch;
	@FindBy(xpath="(//*[text()='Btech CSE- Artificial intellegence and machine learning'])[3]") 
	WebElement selectCourse;
	@FindBy(id="select2-academic_year_id-container") 
	WebElement selectacademic_session;
	@FindBy(xpath="(//*[text()='Jan 2026-2027'])[2]") 
	WebElement selectacademic_session_name;
	@FindBy(xpath="//*[text()='Yes, Confirm']")
	WebElement clickonyesconfirm;
	@FindBy(xpath="//*[text()=' I agree to receive notifications *']") 
	WebElement ClickonCheckbox;
	@FindBy(xpath="//*[@value='Sign Up']") 
	WebElement ClickonSubmit;
	@FindBy(xpath="//*[@class='nav-link dropdown-toggle']")
	WebElement click_StudentName_dropdown;
    @FindBy(xpath="//*[text()=' My DashBoard']")
    WebElement ClickOn_MyDashboard_Button;
	// Action Methons for all the locaters
	
	public void setname(String user) {
		StudentName.sendKeys(user);
	}
	public void setmobile(String mobile) {
		StudentMobile.sendKeys(mobile);
	}
	public void setemail(String email) {
		StudentEmail.sendKeys(email);
	}
	public void clickstatedropdown() {
		clickStateDropdown.click();
	}
	public void searchstatesearchbox() {
		clickStateSearch.click();
	}
		public void selectstate() {
		selectState.click();
	}
	public void clickdistrictdropdown() {
		clickDistrictDropdown.click();
	}
	public void clickdistrictsearchbox() {
		clickDistrictSearch.click();
	}
		public void selectdistrict() {
		selectDistrict.click();
	}
	public void clickprogramdropdown() {
		clickProgramDropdown.click();
		}
	public void clickprogramsearchbox() {
		clickProgramSearch.click();
		}
	public void selectprogram() {
		selectProgram.click();
	}
	public void clickcoursedropdown() {
		clickCourseDropdown.click();
	}
	public void clickcoursesearchbox() {
		clickCourseSearch.click();
	}
	public void selectcourse() {
		selectCourse.click();
	}
	public void selectacademic_session() {
		selectacademic_session.click();
	}
	public void selectacademic_session_name() {
		selectacademic_session_name.click();
	}
	public void clickonyesconfirm() {
		clickonyesconfirm.click();
	}
	public void clickonIagree() {
		ClickonCheckbox.click();
	}
	public void clickonsubmit() {
		ClickonSubmit.click();
	}
	public void click_StudentName_dropdown() {
		click_StudentName_dropdown.click();
	}
	
	public void ClickOn_MyDashboard_Button() {
		ClickOn_MyDashboard_Button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
