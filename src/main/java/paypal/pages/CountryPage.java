package paypal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CountryPage extends ProjectMethods {
	public CountryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="country")
	WebElement countryDD;
	public PasswordPage selectCountry() {
		selectDropDownUsingText(countryDD, "Argentina");
		return new PasswordPage();
	}
	
}
