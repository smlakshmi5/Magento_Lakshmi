package org.magento_stepdef;

import javax.swing.text.Element;

import org.Magento_pom.Magento_pom;
import org.magento_baseclass.Magento_base;
import org.magento_runnerclass.Magento_runnerclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Magento_stepdef extends Magento_base {

	WebDriver driver = Magento_runnerclass.driver;
	
	Magento_pom mp = new Magento_pom(driver);
	@Given("Launch the url and maximize")
	public void launch_the_url_and_maximize() {
	    url(driver,"https://magento.softwaretestingboard.com");
	    maximize(driver);
	    
	   
	}
	@When("I enter the username")
	public void i_enter_the_username() {
		toClick(mp.getSignin());
	    toSendValues(mp.getEmail(), "smlakshmi5@gmail.com");
	    //driver.findElement(mp.sign).click();
	    
	}
	@When("I enter the password")
	public void i_enter_the_password() {
	   toSendValues(mp.getPass(), "Lakshmi123");
	}
	@Then("Click on sign in")
	public void click_on_sign_in() {
		toClick(mp.getSign());
	   
	}
	@Then("click on women and Tops")
	public void click_on_women_and_tops() {
		toClick(mp.getWomen());
		toClick(mp.getTops());
	    
	}
	@Then("Choose category Jackets")
	public void choose_category_jackets() {
	   toClick(mp.getCategory());
	   toClick(mp.getJacket());
	}
	@Then("Select require Jacket")
	public void select_require_jacket() {
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//waitUntilElementVisible(mp.getJadejack());
	//waitUntilclickable(mp.getJadejack());
		toClick(mp.getJadejack());
		toClick(mp.getJacksize());
		toClick(mp.getJackcolor());
		mp.getQty().clear();
		toSendValues(mp.getQty(), "2");
	   
	}

@Then("Add to Cart")
public void add_to_cart() {
    toClick(mp.getCart());
    //toClick(mp.getWishlist());
   // toClick(mp.getCompare());
    toClick(mp.getShoppingcart());
    
}



	
}
