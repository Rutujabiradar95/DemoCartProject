package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CartValuePageObject;

public class CommonMethods extends BaseClass{

	
	public static Double ProductPricedb=0d;
	public static  Double BeforeProductPricedb=0d;
	public String AfterRemoveDoller=" ";
	public static void Assertion(String Actual,String Expected) {
	SoftAssert as=new SoftAssert();
	String actualString=Actual;
	String ExpectedString=Expected;
	as.assertEquals(actualString, ExpectedString);
	as.assertAll();
	
	}
	
	public static Double GetPriceOfProduct(String productHead) {
		CartValuePageObject cmo=new CartValuePageObject(dr);
		for(WebElement w:cmo.ListofProduct()) {
			//String prHead=productHead;
			if(w.getText().contains(productHead)){
				String ProductDetails=w.getText();
				String []Productdeatils=ProductDetails.split("\n");
				String Price=Productdeatils[2];
				String AfterRemoveDoller=Price.replaceAll("[$]", "");
				ProductPricedb=Double.parseDouble(AfterRemoveDoller);
				//CommonMethods.ListOfProduct(ProductDetails);
			    }
			
		}
		return ProductPricedb;
	}
	public static Double CartValue() {
		Double d=CommonMethods.ProductPricedb+BeforeProductPricedb;
		BeforeProductPricedb=d;
		return d;
	}
}
				
	


