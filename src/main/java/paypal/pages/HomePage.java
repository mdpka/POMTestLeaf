package paypal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="signup-button")
	WebElement signUpButton;
	public SignUpPage clickSignUp() {
		click(signUpButton);
		return new SignUpPage();		
	}
}
