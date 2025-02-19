package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistration_Test extends BaseClass {

	@Test(groups= {"Sanity", "Master"})
	public void Verify_AccountRegistration() throws InterruptedException {
    try {
    
	    logger.info("********** driver is initiating *********");
		HomePage hp= new HomePage(driver);
		hp.Registernow();
		logger.info("********** driver is initiating *********");
		AccountRegistration reg=new AccountRegistration(driver);
		reg.setname(generatingrandomemail().toUpperCase());
		reg.setmobile(generatingrandomNumber());
		reg.setemail(generatingrandomemail()+"@ctpl.io");
		Thread.sleep(1000);
		reg.clickstatedropdown();
		Thread.sleep(1000);
		reg.searchstatesearchbox();
		Thread.sleep(1000);
		reg.selectstate();
		Thread.sleep(1000);
		reg.clickdistrictdropdown();
		Thread.sleep(1000);
		reg.clickdistrictsearchbox();
		Thread.sleep(1000);
		reg.selectdistrict();
		reg.clickprogramdropdown();
		Thread.sleep(1000);
		reg.clickprogramsearchbox();
		Thread.sleep(1000);
		reg.selectprogram();
		Thread.sleep(1000);
		reg.clickcoursedropdown();
		Thread.sleep(1000);
		reg.clickcoursesearchbox();
		Thread.sleep(1000);
		reg.selectcourse();
		Thread.sleep(1000);
		reg.selectacademic_session();
		Thread.sleep(1000);
		reg.selectacademic_session_name();
		Thread.sleep(1000);
		reg.clickonyesconfirm();
		Thread.sleep(1000);
		reg.clickonIagree();
		Thread.sleep(1000);
		reg.clickonsubmit();
		Thread.sleep(1000);
		logger.info("********** Student Registred successfully.*********");
		reg.click_StudentName_dropdown();
		Thread.sleep(2000);
		reg.ClickOn_MyDashboard_Button();
		Thread.sleep(2000);

	
	} catch(Exception e){
		
		logger.error("******** Test Failed*********");
	}
	}
	
}
