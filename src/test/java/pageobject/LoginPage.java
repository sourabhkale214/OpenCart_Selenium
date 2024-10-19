package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement txt_email_loc;
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement txt_password_loc;
	@FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement lnk_Forgot_Password_loc;
	@FindBy(xpath = "//input[@type=\"submit\"][@value=\"Login\"]")
	WebElement btn_Login_loc;

	public void setEmail(String email) {
		txt_email_loc.sendKeys(email);
	}

	public void setPassword(String password) {
		txt_password_loc.sendKeys(password);
	}

	public void clickForgottenPassword() {
		lnk_Forgot_Password_loc.click();
	}

	public void clickLogin() {
		btn_Login_loc.click();
	}

}
