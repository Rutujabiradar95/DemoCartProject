package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;
	By MyAccount=By.xpath("//span[contains(text(),'My Account')]");
	By Login=By.xpath("//a[contains(text(),'Login')]");
	By Email=By.xpath("//input[@id='input-email']");
	By Password=By.xpath("//input[@id='input-password']");
	By LoginButton=By.xpath("//input[@value='Login']");
	public LoginPageObject(WebDriver dr) {
		this.driver=dr;
	}
	public WebElement ClickMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement ClickLogin() {
		return driver.findElement(Login);
	}
	public WebElement EnterEmailId() {
		return driver.findElement(Email);
	}
	public WebElement EnterPassword() {
		return driver.findElement(Password);
	}
	public WebElement ClickLoginBtn() {
		return driver.findElement(LoginButton);
	}
}
