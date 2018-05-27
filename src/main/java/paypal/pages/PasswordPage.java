package paypal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PasswordPage extends ProjectMethods{

	public PasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	public PasswordPage enterEmail(String data) {
		type(email, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="password")
	WebElement password;
	public PasswordPage enterPassword(String data) {
		type(password, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="confirmPassword")
	WebElement confPassword;
	public PasswordPage enterConfirmPassword(String data) {
		type(confPassword, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="_eventId_personal")
	WebElement continueButton;
	public PasswordPage clickContinue() {
		click(continueButton);
		return this;
	}
}
