package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.PlaceOrderPage;
import com.qa.utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderForRegisterStepDefinition {
	
	WebDriver driver;
	HomePage homepage= new HomePage();
	CheckoutPage checkout= new CheckoutPage();
	PlaceOrderPage placeorderpage= new PlaceOrderPage();
	
	
	@Given("^User opens Demo Blaze app$")
	public void user_opens_browser() {
		TestBase.initialisation();
		
		
	}
	@When("^User adds one item from monitor category$")
	public void monitor_category() {
		
		homepage.addmonitoritem();
		
		
	}
	
	@Then("^User navigates to Cart page and place order$")
	public void navigates_to_cart_page() throws Exception {
		
		checkout.addtocartclick();
    	Thread.sleep(1000);
    	checkout.popuphandling();
    	Thread.sleep(1000);
	}
	
	@Then("^User enters all details in the pop up and purchase$")
	public void all_details() throws InterruptedException {
		
		homepage.clickCartlink();
		Thread.sleep(1000);
		placeorderpage.placeorderlink();
		Thread.sleep(1000);
		placeorderpage.purchasedetails();
		
		
	}
	
	@Then("^User gets an order confirmation popup$")
	public void order_confirmation() throws InterruptedException {
		
		placeorderpage.okclick();
		
		TestBase.close_Browser();
	}

}
