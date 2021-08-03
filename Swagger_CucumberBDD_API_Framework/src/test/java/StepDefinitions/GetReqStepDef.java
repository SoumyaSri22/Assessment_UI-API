package StepDefinitions;

import EndPoints.PetEndPoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class GetReqStepDef {

	PetEndPoint endpoint= new PetEndPoint();
	@Given("^User send a valid GET request with given status$")
	public void getresponse() {
		
		PetEndPoint.getPetReq();
	}
	
	@Then("^Verify User should get a success response$")
	public void verify_getresponsecode() {
		
		PetEndPoint.getreqstatuscode();
		//Assertion for response code
		Assert.assertEquals(200, endpoint.getReqstatuscode);
	}
}
