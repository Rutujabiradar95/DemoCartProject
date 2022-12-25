package TestCases;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.CartValuePageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class VerifyCartValue extends BaseClass {
	@Test
	public void VerifyCartVal() throws InterruptedException{
	CartValuePageObject cvo=new CartValuePageObject(dr);
	cvo.EnterValueInSearch().sendKeys(Constant.Samsung);
	cvo.ClickOnSearchBtn().click();
	CommonMethods.GetPriceOfProduct(Constant.SamsungProductString);
	System.out.println("Value of "+Constant.SamsungProductString+" is :"+CommonMethods.ProductPricedb);
	CommonMethods.CartValue().doubleValue();
	cvo.ClickOnSamAddToCart().click();
	cvo.EnterValueInSearch().clear();
	cvo.EnterValueInSearch().sendKeys(Constant.iphone);;
	cvo.ClickOnSearchBtn().click();
	CommonMethods.GetPriceOfProduct(Constant.iphone);
	System.out.println("Value of "+Constant.iphone+" is :"+CommonMethods.ProductPricedb);
	cvo.ClickOnAddToCart().click();
	Double d=CommonMethods.CartValue().doubleValue();
	System.out.println("Cart Value is:"+d);
	String s=("$"+d.toString());
	Thread.sleep(5000);
	cvo.ClickOnCart().click();
	String TotalValue=cvo.GetTotalvalue().getText();
	if(s.equals(TotalValue)) {
		System.out.println("Value Matched");
	}
			
	}
	
}
