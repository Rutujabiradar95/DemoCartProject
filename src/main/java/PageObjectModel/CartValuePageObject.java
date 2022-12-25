package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartValuePageObject {

	public WebDriver driver;
	By SearchTextBox=By.xpath("//input[@name='search']");
	By SearchButton=By.xpath("//i[@class='fa fa-search']");
	By Price=By.xpath("//p[@class='price']");
	By BtnAddToCart=By.xpath("//span[contains(text(),'Add to Cart')]");
	By SamBtnAddToCart=By.xpath("(//span[contains(text(),'Add to Cart')])[2]");
	
	By ListProduct=By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']");
	By CartValue=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");      
	By TotalValue=By.xpath("(//td[@class='text-right'])[12]");
	public CartValuePageObject(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.driver=dr;
	}
	public WebElement GetTotalvalue() {
		return driver.findElement(TotalValue);
	}

	
	public WebElement ClickOnCart() {
		return driver.findElement(CartValue);
	}

	public WebElement EnterValueInSearch() {
		return driver.findElement(SearchTextBox);
	}
	public WebElement ClickOnSearchBtn() {
		return driver.findElement(SearchButton);
	}
	public WebElement Price() {
		return driver.findElement(Price);
	}
	public WebElement ClickOnAddToCart() {
		return driver.findElement(BtnAddToCart);
	}
	public List<WebElement> ListofProduct() {
		return driver.findElements(ListProduct);
	}
	public WebElement ClickOnSamAddToCart() {
		return driver.findElement(SamBtnAddToCart);
	}
}
