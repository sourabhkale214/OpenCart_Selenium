package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement txt_myAccount_loc;

	public String myAccount() {

		String AccountStatus = txt_myAccount_loc.getText();
		System.out.println("Account Status : " + AccountStatus );
		return AccountStatus;

	}

}
