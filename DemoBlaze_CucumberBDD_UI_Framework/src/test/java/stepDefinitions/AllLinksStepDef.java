package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllLinksStepDef {

	WebDriver driver;
	LoginPage loginpage=new LoginPage();
	HomePage homepage= new HomePage();
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page()
	{
		TestBase.initialisation();
	}
	@When("^User logs in to app$")
	public void User_logs_in_to_app() throws InterruptedException
	{
		LoginPage.clicklogin();
		Thread.sleep(2000);
		LoginPage.enterusername();
		Thread.sleep(2000);
		LoginPage.enterpassword();
		Thread.sleep(2000);
		LoginPage.clickloginbtn();
		
	}
	
	@Then("^User clicks all available links on page$")
	public void User_clicks_all_available_links_on_page() throws InterruptedException
	{
		homepage.clickprevandnext();
		Thread.sleep(1000);
		
	}
	
}
