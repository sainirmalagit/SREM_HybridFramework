package testCases;

import org.testng.annotations.Test;

import pageObjects.SRASS_Vendor_Registration;
import testBase.BaseClass;

public class VendorAccount_Creation extends BaseClass {
	@Test
	public void TC_VendorAccount_Creation() {
       try {
    	 logger.info("*******************driver is initiating***************");
    	 
    	 SRASS_Vendor_Registration SVR= new SRASS_Vendor_Registration(driver);
    	 logger.info("*******************driver is initiating***************");
    	 
    	 SVR.clk_regi_Btn();
    	 SVR.text_companyname(generatingrandomemail().toUpperCase());
    	 SVR.text_UtmSource(generatingrandomemail().toLowerCase());
    	 SVR.text_Spocname(generatingrandomemail().toString());
    	 
    	 
       }catch(Exception e){
    	   
    	   logger.info("*******************Registration is Failed***************");
       }
	}

}
