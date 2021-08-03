package StepDefinitions;

import EndPoints.StoreEndPoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class GetStoreStepDef {

	StoreEndPoint storepoint= new StoreEndPoint();
	@Given("^User sends a GET request to get purchase order by ID$")
	public void storegetReq() {
		
		StoreEndPoint.getStoreReq();
	}
	
    @Then("^User should get a valid response code$")
    public void storesttatuscode() {
    	
    	StoreEndPoint.verifystoregetcode();
    	//Assertion for response code
    	Assert.assertEquals(200, storepoint.storereqcode);
    	
    }
    
}
