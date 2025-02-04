package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;


import Utilities.DataProvider;
import pageObjects.HomePage;
import pageObjects.LoginNow;
import pageObjects.MyAccount_Dashboard;
import testBase.BaseClass;

public class TC_LoginTest_DDT extends BaseClass {

	// Need to mention data provider class because we need to fetch email password data through data providers.
	// The second parameter will mention when the Data provider class in different class and different packages.

	@Test(dataProvider="LoginData", dataProviderClass=DataProvider.class,groups="DataDriven")
	public void Verify_LoginTest(String email, String Pwd, String Exp) throws InterruptedException {

		logger.info("***********Starting Tc_Login_Test***************");
		try {
			// Home page
			HomePage hp=new HomePage(driver);

			hp.Registernow();
			Thread.sleep(1000);
			hp.Loginnow();
			Thread.sleep(1000);

			// LoginNow Page

			LoginNow lp=new LoginNow(driver);
			Thread.sleep(2000);
			lp.enterusernameclear();
			Thread.sleep(500);
			lp.enterusername(email);
			Thread.sleep(1000);
			lp.clickproceed();
			Thread.sleep(1000);
			lp.enterpassword(Pwd);
			Thread.sleep(1000);
			lp.clicksubmit();
			Thread.sleep(1000);

			// MyAccount Page

			MyAccount_Dashboard MAD=new MyAccount_Dashboard(driver);
			boolean target=MAD.isMyAccountExists();

			// Need to add validations. valid and invalid data.

			/* If Data is Valid-- Login Successful-- Test Passed-- Logout 
			 * If Data is Valid-- Login UnSuccessful-- Test Failed

			 * If Data is InValid-- Login Successful-- Test Failed--Logout
			 * If Data is InValid-- Login UnSuccessful-- Test Passed   */

			if(Exp.equalsIgnoreCase("Valid")) {

				if(target==true) {
					MAD.clickdroplogout();
					Thread.sleep(1000);
					MAD.clicklogout();
					Thread.sleep(1000);
					Assert.assertTrue(true);

				}
				else {
					Assert.assertTrue(false);

				}
				if(Exp.equalsIgnoreCase("Invalid")) {
					if(target==true) {
						MAD.clickdroplogout();
						Thread.sleep(1000);
						MAD.clicklogout();
						Thread.sleep(1000);
						Assert.assertTrue(false);

					}
					else {
						Assert.assertTrue(true);
					}
				}
			}


		}catch(Exception e){
			Assert.fail("Test Failed");

		}
		
		Thread.sleep(4000);


	}
}
