	package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass{
	@Test
	public void Login() throws IOException
	{		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.LoginClick().click();
		
	}
	

}
