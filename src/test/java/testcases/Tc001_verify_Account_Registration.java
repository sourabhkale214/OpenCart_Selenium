package testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.RegisterAccountPage;
import testbase.BaseClass;

public class Tc001_verify_Account_Registration extends BaseClass {

	@Test(groups = {"Regression","Master"})
	public void verify_Account_Registration() throws InterruptedException {

		logger.info("*** Start Test :  verify_Account_Registration ***");
		try {
			HomePage HP = new HomePage(driver);
			Thread.sleep(500);
			HP.ClickMyAccount();
			logger.info("* Clicked On MyAccount Link..*");
			Thread.sleep(500);
			HP.ClickRegister();
			logger.info("* Clicked On Register Link..*");

			RegisterAccountPage regAcc = new RegisterAccountPage(driver);
			Thread.sleep(500);
			logger.info("Providing Customer Info..");
			regAcc.setFirstName(randomString().toLowerCase());
			Thread.sleep(500);
			regAcc.setLastName(randomString().toLowerCase());
			String email = (randomAlphaNumberic().toLowerCase() + "@gmail.com");
			regAcc.setEmail(email);
			regAcc.setTelephone(randomNumber());
			Thread.sleep(500);
			String Password = randomAlphaNumberic().toLowerCase();
			regAcc.setPassword(Password);
			regAcc.setConfirmPassword(Password);
			Thread.sleep(500);
			regAcc.clickYes();
			Thread.sleep(500);
			regAcc.clickAgree();
			Thread.sleep(500);
			regAcc.clickContinue();

			Thread.sleep(500);
			logger.info("Validation Expected Massage..");
			String expectedResult = "Your Account Has Been Created!!!!!";
			String ActualResult = regAcc.getConfirmationMassaage1();
			System.out.println("ActualResult : " + ActualResult);

			if (ActualResult.equals(expectedResult)) {
				AssertJUnit.assertTrue(true);

			} else {
				logger.error("Test Fail..");
				logger.debug("Debug logs..");
				AssertJUnit.assertTrue(false);
			}

			//Assert.assertEquals(ActualResult, expectedResult);
		} catch (Exception e) {

			AssertJUnit.fail();
		}
		
		logger.info("*** End Of Test : verify_Account_Registration ***");

	}

}
