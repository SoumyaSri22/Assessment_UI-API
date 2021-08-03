package StepDefinitions;

import EndPoints.PetEndPoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class DelReqStepDef {
	
	static PetEndPoint endpoint= new PetEndPoint();
	
	@Given("^User sends a valid Delete request to delete a pet$")
	public static void delReq() {
		
		PetEndPoint.deletepetReq();	
	}
	
	@Then("^User gets a success response$")
	public void verifyDelReqcode() {
		
		PetEndPoint.delreqstatuscode();
		//assertion for response code
		Assert.assertEquals(404, endpoint.delReqstatuscode);
	}

}
