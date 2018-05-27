package paypal.testcases;

import org.testng.annotations.Test;

import paypal.pages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_SignUp extends ProjectMethods {
	public void setValue() {
		dataSheetName= "TC001_Paypal";
		testCaseName="TC001_SignUp";
		testDescription="SignUp as a new user in Paypal";
		testNodes="Leads";
		category="Smoke";
		authors="Deepika";
		browserName="chrome";
	}
	
	@Test(dataProvider ="fetchData")
	public void signUp(String country, String email, 
			String password, String confPassword) {
		new HomePage()
		.clickSignUp()
		.selectRadio()
		.clickNext()
		.selectCountry()
		.enterEmail(email)
		.enterPassword(password)
		.enterConfirmPassword(confPassword)
		.clickContinue();
	}

}
