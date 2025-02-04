package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginNow;
import pageObjects.MyAccount_Dashboard;
import testBase.BaseClass;

public class TC_Login_Test extends BaseClass {
	
	   @Test(groups= {"Regression", "Master"})
	   public void Verify_login() throws InterruptedException {
		
		logger.info("***********Starting Tc_Login_Test***************");
		// Home page
		HomePage hp=new HomePage(driver);
		hp.Registernow();
		Thread.sleep(1000);
		hp.Loginnow();
		Thread.sleep(1000);
		// Login Now Page
		LoginNow lp=new LoginNow(driver);
		Thread.sleep(2000);
		lp.enterusername(p.getProperty("Email"));
		Thread.sleep(1000);
		lp.clickproceed();
		Thread.sleep(1000);
		lp.enterpassword(p.getProperty("Password"));
		Thread.sleep(1000);
		lp.clicksubmit();
		Thread.sleep(1000);
		
		// My account page.
		// need to validate the header message that is existed or not on the account dashboard page.
		
		MyAccount_Dashboard MAD=new MyAccount_Dashboard(driver);
		boolean target=MAD.isMyAccountExists();
		try {
	    Assert.assertTrue(target);//  Assert.assertEquals(target, true);
	   
	    logger.info("*********Account logined successfully.************");
		
		}catch(Exception e) {
			Assert.fail("Dashboard page is not visible.");
		}
		
		
	}

}
