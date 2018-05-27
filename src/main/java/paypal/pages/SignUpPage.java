package paypal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpPage extends ProjectMethods {
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using="radio-personal")
	WebElement radioButton;
	public SignUpPage selectRadio() {
		if (!verifySelected(radioButton))
			click(radioButton);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT, using="Next")
	WebElement nextButton;
	public CountryPage clickNext() {
		click(nextButton);
		return new CountryPage();
	}
}
