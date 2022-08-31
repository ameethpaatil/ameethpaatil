package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifySingUpTestCase extends BaseClass {

	@Test
	public void SignUp() throws IOException, InterruptedException
	{
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClcikOnTryForClick().click();
		
		Thread.sleep(5000);
		
		SignUpPageObjects spo = new SignUpPageObjects(driver);
		spo.EnterFirstName().sendKeys(TestCaseData.firstname);
		spo.EnterLastName().sendKeys(TestCaseData.lastname);
		spo.EnterUserEmail().sendKeys(TestCaseData.useremail);
		spo.EnterCompanyName().sendKeys(TestCaseData.compamyname);
		
		Select s = new Select(spo.SelectEmployee());
		s.selectByIndex(TestCaseData.selectEmployeeIndex);
		
		
		Select s1 = new Select(spo.SelectJobTitle());
		s1.selectByIndex(TestCaseData.selectJobTitleIndex);
		
		Select s2 = new Select(spo.SelectCompanyCountry());
		s2.selectByIndex(TestCaseData.selectCountryIndex);
		
		spo.CheckAgree().click();
		//spo.EnterPhone().sendKeys(TestCaseData.phone);
		
		
		
	}
}

