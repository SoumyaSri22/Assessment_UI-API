package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.SignUp;
import com.qa.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class SignUpStepDefinitions extends TestBase{
	
	WebDriver driver;
	SignUp signup= new SignUp();
	@Given("^User opens the browser$")
	public void opens_browser() {
		
		TestBase.initialisation();
	}
	
	@When("^User clicks on Sign up link$")
	public void sign_up() throws Exception {
		
		signup.signuplink();
		Thread.sleep(1000);
	}
	@Then("^User enters unique username and password$")
	public void enters_username_password() throws Exception {
		
		signup.newusername();
		Thread.sleep(1000);
		signup.newpassword();
		Thread.sleep(1000);
		signup.signup();
		Thread.sleep(1000);
		signup.popupsignup();
		
	}
	
	@Then("^validate user is on homepage$")
	public void verify_Title() {
		 
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals("STORE", title);
		TestBase.close_Browser();
	}

}
