package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement Myaccount;
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Register;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement Login;

	public void ClickMyAccount() {
		Myaccount.click();
	}

	public void ClickRegister() {
		Register.click();
	}

	public void clickLogin() {
		Login.click();
	}
}
