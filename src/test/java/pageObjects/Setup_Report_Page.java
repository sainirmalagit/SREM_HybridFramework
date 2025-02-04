package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Setup_Report_Page extends BasePage{

	public Setup_Report_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Click on select all button on setup report page
	// @FindBy(xpath="//*[@id=\"gridTable\"]/div/div[5]/div[1]/table/tbody/tr[1]/td[1]/div/div/span")
	@FindBy(xpath="(//*[@class='dx-checkbox-icon'])[1]")
	WebElement clk_selectall_button;
	
	// Click on '+' Create button on setup report page
	@FindBy(xpath="(//*[@class='dx-button-content'])[1]")
	WebElement clk_create_button;
	
	// Click on Enable button on setup report page
	@FindBy(xpath="(//*[@class='dx-button-content'])[2]")
	WebElement clk_enable_button;
	
	// Click on Disable button on setup report page
	@FindBy(xpath="(//*[@class='dx-button-content'])[3]")
	WebElement clk_disable_button;
	
	// Click on Column chooser button on setup report page
	@FindBy(xpath="(//*[@class='dx-button-content'])[4]")
	WebElement clk_ColumnChooser_button;
	
	// Click on Columnchooser-Checkbox button on setup report page
	@FindBy(xpath="(//*[@class='dx-checkbox-icon'])[23]")
	WebElement clk_columnchoose_checkbox_button;
	
	
	
	
	
	
	
	

}
