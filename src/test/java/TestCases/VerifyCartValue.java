package TestCases;

import java.util.Arrays;

import org.testng.annotations.Test;

import PageObjectModel.CartValuePageObject;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyCartValue extends BaseClass {
	@Test
	public void VerifyCartVal(){
	CartValuePageObject cvo=new CartValuePageObject(dr);
	cvo.EnterValueInSearch().sendKeys(Constant.SearchTextBox);;
	cvo.ClickOnSearchBtn().click();
	String a=cvo.iphonePrice().getText();
	String []iprice=a.split(" ");
	System.out.println(Arrays.toString(iprice));
	
	
	}
}
