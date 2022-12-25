package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageObject {

	public WebDriver driver;
	
	By EditAccountInfo=By.xpath("//a[contains(text(),'Edit your account information')]");
	
	By Telephone=By.xpath("//input[@id='input-telephone']");
	
	By ContinueBtn=By.xpath("//input[@value='Continue']");
	By UpdateMsg=By.xpath("//div[contains(text(), 'Success: Your account has been successfully updated.')]");
	
	public MyAccountPageObject(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.driver=dr;
	}
	public WebElement ClickOnEditAccountDetails() {
		return driver.findElement(EditAccountInfo);
	}
	public WebElement EnterTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement ClickOnContinue() {
		return driver.findElement(ContinueBtn);
	}
	public WebElement GetSuccessfulMsg() {
		return driver.findElement(UpdateMsg);
	}
}


