package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginNow extends BasePage {

	public LoginNow(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id='loginwith']")// Finding the element using the @FindBy annotation.
	WebElement txt_Username_locaters; // Storing the variable in the webelement.
	
	@FindBy(xpath="//*[@value='Proceed']")
	WebElement btn_Proceed_locaters;
	
	@FindBy(id="loginpassword")
	WebElement txt_Password_locaters;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	WebElement btn_Submit_locaters;
	
	public void enterusername(String user) {
		txt_Username_locaters.sendKeys(user);// Calling the Web Element and performing the actions.
	}
	public void enterusernameclear() {
		txt_Username_locaters.clear();// Calling the Web Element and performing the actions.
	}
	public void clickproceed() {
	   btn_Proceed_locaters.click();
	}
	public void enterpassword(String pwd) {
		txt_Password_locaters.sendKeys(pwd);	
	}
	public void clicksubmit() {
		btn_Submit_locaters.click();
	}
}
