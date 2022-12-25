package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.MyAccountPageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class MyAccountTestCase extends BaseClass {
   @Test
	public void EditAccountDetails() throws InterruptedException {
	MyAccountPageObject mapo=new MyAccountPageObject(dr);
	Thread.sleep(5000);
	mapo.ClickOnEditAccountDetails().click();
	mapo.EnterTelephone().clear();
	mapo.EnterTelephone().sendKeys(Constant.Telephone);
	mapo.ClickOnContinue().click();
	CommonMethods.Assertion(mapo.GetSuccessfulMsg().getText(), Constant.SuccessMsg);
	}
}
