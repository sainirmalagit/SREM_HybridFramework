package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Report_Setup extends BasePage {
	
	public Report_Setup(WebDriver driver) {
		super(driver);
	}
	
	// Click on Expand menu button
	
	@FindBy(xpath="//*[@class='large icon content']")
	WebElement expand_button;
	
	// Click on Report menu button
	@FindBy(xpath="//*[text()=' Reports ']")
	WebElement Report_button;
	
	// Click on lead list Report menu button
	@FindBy(xpath="(//*[text()='Lead'])[1]")
	WebElement lead_list;
	
	// Click on pivot list Report menu button
	@FindBy(xpath="(//*[text()='Pivot'])[1]")
	WebElement pivot_list;
	
	// Click on payment list Report menu button
	@FindBy(xpath="(//*[text()='Payment'])[1]")
	WebElement payment_list;
	
	// Click on applicant list Report menu button
	@FindBy(xpath="(//*[text()='Applicant'])[1]")
	WebElement applicant_list;
	
	// Click on search button Report menu button
	@FindBy(id="filterreport")
	WebElement search_button;
	
	// Click on view report button Report menu button
	@FindBy(xpath="//*[@id=\"Leadlist\"]/div/div[1]/div/div[1]/div/div/a")
	WebElement clk_viewreport_button;
	
	// Click on export report button Report menu button
	@FindBy(xpath="//*[@id=\"Leadlist\"]/div/div[1]/div/div[1]/div/div/button[1]")
	WebElement clk_export_button;
	
	// Click on scheduler report button Report menu button
	@FindBy(xpath="//*[@id=\"Leadlist\"]/div/div[1]/div/div[1]/div/div/button[2]")
	WebElement clk_scheduler_button;
	
	// Click on setup report button Report menu button
	@FindBy(xpath="//*[@id=\"adminblock\"]/div/div[1]/a")
	WebElement clk_setupreport_button;
	
	
	
	
	
	
	
	

}
