package Resources;

import org.testng.asserts.SoftAssert;

public class CommonMethods {

	
	public static void Assertion(String Actual,String Expected) {
	SoftAssert as=new SoftAssert();
	String actualString=Actual;
	String ExpectedString=Expected;
	as.assertEquals(actualString, ExpectedString);
	as.assertAll();
	
	}
}
