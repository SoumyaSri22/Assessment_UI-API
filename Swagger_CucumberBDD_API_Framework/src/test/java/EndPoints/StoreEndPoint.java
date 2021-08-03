package EndPoints;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import jsonReq.PetReq;
import jsonReq.StoreReq;

public class StoreEndPoint {
	
	public static String storeEndPoint = "/store/order";
    public static int storepetreqcode;
    public static int storereqcode;
    public static  Response response; 
    
    
    @Test
    //post request
    public static void postStoreReq() {
        
        try {
        	response = 
            given()
                    .header("Content-Type", "application/json")
                    .body(StoreReq.storeRequest).when().post("https://petstore.swagger.io/v2/store/order")
                    .then().extract().response();
    }
        catch(Exception e)
        {
        System.out.print("This is catch block");
    
}

    }
    
    //fetching response code
    public static int poststorecode() {
    	
    	storepetreqcode = response.statusCode();
        System.out.print("response code" + storepetreqcode);
		return storepetreqcode;
    	
    }
    
    //get request
    public static void getStoreReq() {
	try {
    	response = given()
				.header("Content-Type", "application/json")
				.header("Accept", "application/json")
				.when().get("https://petstore.swagger.io/v2/store/inventory")
				.then().extract().response();
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getBody().jsonPath().getJsonObject("id").toString());
}
    catch(Exception e)
    {
    System.out.print("This is catch block");

}

}
     //response code
     public static int verifystoregetcode() {
	
	storereqcode = response.statusCode();
    System.out.print("response code" + storereqcode);
	return storereqcode;
	
}
    }