package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Dashboard extends BasePage{

	public MyAccount_Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//*[text()='Dashboard'])[3]")
	WebElement header_message;
	
	@FindBy(xpath="//*[@id=\"topbar-container\"]/div/div[3]/i")
	WebElement btn_drop_logout;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement btn_clicklogout;
	
	public boolean isMyAccountExists() {
		try {
			return(header_message.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
		
	}
	
	public void clickdroplogout() {
		btn_drop_logout.click();
	}
	public void clicklogout() {
		btn_clicklogout.click();
	}
	
	

}
