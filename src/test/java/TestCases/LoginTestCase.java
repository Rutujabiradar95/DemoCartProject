package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class LoginTestCase extends BaseClass{

	@Test
	public void verifyLogin() {
		LoginPageObject lpo=new LoginPageObject(dr);
		lpo.ClickMyAccount().click();
		lpo.ClickLogin().click();
		lpo.EnterEmailId().sendKeys(Constant.Email);
		lpo.EnterPassword().sendKeys(Constant.Password);
		lpo.ClickLoginBtn().click();
	}
}
