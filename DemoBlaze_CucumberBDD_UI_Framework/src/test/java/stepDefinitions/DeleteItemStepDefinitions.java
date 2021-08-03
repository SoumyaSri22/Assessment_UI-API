package stepDefinitions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import com.qa.pages.CartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DeleteItemStepDefinitions {

	WebDriver driver;
	HomePage homepage=new HomePage();
	CheckoutPage checkout= new CheckoutPage();
	CartPage cartpage=new CartPage(TestBase.driver);
	
	@Given("^User has some items in cart present$")
	public void User_has_items() throws InterruptedException {
		
		TestBase.initialisation();
		homepage.addlaptopitem();
		Thread.sleep(1000);
}
	
    @When("^User navigates to cart page$")
    public void User_navigates_to_cart_page() throws InterruptedException {
    	checkout.addtocartclick();
    	Thread.sleep(1000);
    	checkout.popuphandling();
    	Thread.sleep(1000);
    }
    
    @Then("^User clicks on Delete button for an item$")
    public void User_clicks_on_Delete() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	cartpage.cartlink();
    	Thread.sleep(1000);
    	cartpage.deleteItemPresent();
    	Thread.sleep(1000);
    	
    
    }
    @SuppressWarnings("deprecation")
	@Then("^Validate user is on cart page$")

	public void verify_Title() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	String titlenew=cartpage.verifyTitle();
		Assert.assertEquals(titlenew, "STORE"); 
        TestBase.close_Browser();
		
}
}