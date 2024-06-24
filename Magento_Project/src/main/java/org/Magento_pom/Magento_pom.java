package org.Magento_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magento_pom {



	public static WebDriver driver;
	 //public By sign = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signclick;

	@FindBy(xpath="//span[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Tops']")
	private WebElement tops;
	
	@FindBy(xpath="//div[normalize-space()='Category']")
	private WebElement category;
	
	@FindBy(xpath="//a[contains(text(),'Jackets')]")
	private WebElement Jacket;
	
	@FindBy(xpath="//a[contains(text(),'Jade Yoga Jacket')]")
	private WebElement jadejack;
	
	@FindBy(id="option-label-size-143-item-167")
	private WebElement jacksize;
	
	@FindBy(id="option-label-color-93-item-50")
	private WebElement jackcolor;
	
	@FindBy(id="qty")
	private WebElement qty;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='Add to Wish List']")
	private WebElement wishlist;
	
	@FindBy(xpath="//span[text()='Add to Compare']")
	private WebElement compare;
	
	@FindBy(xpath="//a[text()='shopping cart']")
	private WebElement shoppingcart;




public WebElement getCompare() {
		return compare;
	}


public WebElement getWishlist() {
		return wishlist;
	}


public WebElement getCart() {
		return cart;
	}


public WebElement getQty() {
		return qty;
	}


public WebElement getJacksize() {
		return jacksize;
	}


	public WebElement getJackcolor() {
		return jackcolor;
	}


public WebElement getJadejack() {
		return jadejack;
	}


public WebElement getJacket() {
		return Jacket;
	}


public WebElement getCategory() {
		return category;
	}


public WebElement getSignclick() {
		return signclick;
	}


	public WebElement getWomen() {
		return women;
	}


	public WebElement getTops() {
		return tops;
	}


public WebElement getSign() {
		return signclick;
	}


public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getSignin() {
		return signin;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


public Magento_pom(WebDriver driver1) {
 this.driver=driver1;
 PageFactory.initElements(driver, this);
}


public WebElement getShoppingcart() {
	// TODO Auto-generated method stub
	return null;
}



}


 

