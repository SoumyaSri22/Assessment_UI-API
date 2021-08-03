package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCredStepDefinitions {
	
	LoginPage loginpage= new LoginPage();
	HomePage homepage= new HomePage();
	CheckoutPage checkoutpage= new CheckoutPage();
	WebDriver driver;
	
	@Given("^User opens browser to login$")
	public void User_opens_browser() {
		
		TestBase.initialisation();
		
	}
	
	@When("^User is on Log in screen$")
	public void User_is_on_Login() throws InterruptedException {
		
		LoginPage.clicklogin();
		Thread.sleep(2000);
	}
	
	@Then("^User enter invalid credentials$")
	public void invalid_credentials() throws Exception {
		
		LoginPage.invalidusername();
		Thread.sleep(2000);
		LoginPage.invalidpassword();
		Thread.sleep(2000);
		LoginPage.clickloginbtn();
		
	}
	
	@Then("^Appropriate error message is seen$")
	public void error_message() throws InterruptedException {
		
		Thread.sleep(2000);
		checkoutpage.popuphandling();
		TestBase.close_Browser();
	}

}
