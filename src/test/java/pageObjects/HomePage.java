package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Locators
	@FindBy(xpath="(//*[text()='Register Now'])[1]") 
	WebElement btn_registernow;
	
	@FindBy(xpath="(//*[text()='Login Now'])[1]")
	WebElement btn_loginnow_locaters;
	
	
	// Action Methods
	Actions a=new Actions(driver);
	public void Registernow() {
		btn_registernow.click();
	}
	public void Loginnow() {
		btn_loginnow_locaters.click();
	}
	
}
