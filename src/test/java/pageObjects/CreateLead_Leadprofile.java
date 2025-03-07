package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLead_Leadprofile extends BasePage {

	public CreateLead_Leadprofile(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="profile_contact_name")
	WebElement leadname;
	

}
