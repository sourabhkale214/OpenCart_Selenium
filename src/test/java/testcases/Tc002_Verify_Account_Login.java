package testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.MyAccountPage;
import testbase.BaseClass;

public class Tc002_Verify_Account_Login extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void Verify_Login() {

		logger.info("** Test Start **");
		try {
			HomePage HP = new HomePage(driver);
			HP.ClickMyAccount();
			HP.clickLogin();
			logger.info("clicked On Login");

			LoginPage LP = new LoginPage(driver);
			LP.setEmail("admin123@gmail.com");
			LP.setPassword("admin@123");
			logger.info("Passed Login Detailes ..!");
			LP.clickLogin();

			MyAccountPage myacc = new MyAccountPage(driver);
			String actual = myacc.myAccount();
			String expected = "My Account";
			logger.info("Validation Using MyAccount..");

			if (actual != null) {
				Assert.assertEquals(actual, expected);
				logger.debug("Debug Info..");
				logger.info("** Test Complete **");
			} else {
				Assert.assertFalse(true);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
