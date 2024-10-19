package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage {

	public RegisterAccountPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id=\"input-firstname\"]")
	WebElement txt_firstname_loc;
	@FindBy(xpath = "//input[@id=\"input-lastname\"]")
	WebElement txt_lastname_loc;
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement txt_email_loc;
	@FindBy(xpath = "//input[@id=\"input-telephone\"]")
	WebElement txt_telephone_loc;
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement txt_Password_loc;
	@FindBy(xpath = "//input[@id=\"input-confirm\"]")
	WebElement txt_Confirm_Password_loc;

	@FindBy(xpath = "//label[normalize-space()='Yes']")
	WebElement rdo_Yes_loc;
	@FindBy(xpath = "//label[normalize-space()='NO']")
	WebElement rdo_NO_loc;

	@FindBy(xpath = "//input[@name=\"agree\"]")
	WebElement cbx_agree_loc;
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	WebElement btn_Continue_loc;

	@FindBy(xpath = "//div//h1")
	WebElement confMassage;

	public void setFirstName(String firstname) {
		txt_firstname_loc.sendKeys(firstname);
	}

	public void setLastName(String lastname) {
		txt_lastname_loc.sendKeys(lastname);
	}

	public void setEmail(String email) {
		txt_email_loc.sendKeys(email);
	}

	public void setTelephone(String telephone) {
		txt_telephone_loc.sendKeys(telephone);
	}

	public void setPassword(String password) {
		txt_Password_loc.sendKeys(password);
	}

	public void setConfirmPassword(String confirmPassword) {
		txt_Confirm_Password_loc.sendKeys(confirmPassword);
	}

	public void clickYes() {
		rdo_Yes_loc.click();
	}

	public void clickNo() {
		rdo_NO_loc.click();
	}

	public void clickAgree() {
		cbx_agree_loc.click();
	}

	public void clickContinue() {
		btn_Continue_loc.click();
	}

	public String getConfirmationMassaage1() {
		try {
			return (confMassage.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
