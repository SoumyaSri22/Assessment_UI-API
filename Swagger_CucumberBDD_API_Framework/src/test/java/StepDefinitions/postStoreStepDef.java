package StepDefinitions;
import EndPoints.StoreEndPoint;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class postStoreStepDef {

	StoreEndPoint storeendpoint= new StoreEndPoint();
	
	@Given("^User sends a POST Request to make a purchase$")
	public void sendpostreq() {
		
		StoreEndPoint.postStoreReq();
		
	}
	
    @Then("^user should get a valid response code$")
    public void verifystorecode() {
    	
    	StoreEndPoint.poststorecode();
    	Assert.assertEquals(200, storeendpoint.storepetreqcode);
    }
}
