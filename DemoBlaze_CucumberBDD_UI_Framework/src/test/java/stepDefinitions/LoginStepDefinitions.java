package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions extends TestBase{
	
	LoginPage loginpage= new LoginPage();
	HomePage homepage= new HomePage();
	WebDriver driver;

@Given("^User opens browser$")
public void User_opens_browser()
{
	TestBase.initialisation();
}

@When("^User is on Login page$")	
public void User_is_on_Log_in_page() throws InterruptedException
{
LoginPage.clicklogin();
Thread.sleep(2000);

}
	
@Then("^User logs into app$")
public void User_logs_into_app() throws InterruptedException
{
	LoginPage.enterusername();
	Thread.sleep(2000);
	LoginPage.enterpassword();
	Thread.sleep(2000);
	LoginPage.clickloginbtn();
}

 @Then("^Validate user is logged in$")
 public void validateusername() throws InterruptedException {
	 
	 //homepage.correctUserName();
	 Thread.sleep(2000);
	 boolean userflag= HomePage.checklogouttext();
	 Assert.assertTrue(userflag);
	 TestBase.close_Browser();
 }

}
