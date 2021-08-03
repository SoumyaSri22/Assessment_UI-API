package StepDefinitions;

import EndPoints.PetEndPoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;



public class PostReqStepDef {
	
	PetEndPoint petpoint= new PetEndPoint();
	
	@Given("^User send a valid POST request to add a pet$")
	public void sendpost_Req()
	{
		PetEndPoint.postPetReq();
		
	}

	@Then("^user should get a success response code$")
	public void validateputrespcode() {
		
		PetEndPoint.petStatuscode();
		//Assertion for response code
		Assert.assertEquals(200, petpoint.petReqstatuscode);
	}
}
