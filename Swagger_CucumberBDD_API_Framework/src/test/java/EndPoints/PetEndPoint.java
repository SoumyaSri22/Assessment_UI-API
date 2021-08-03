package EndPoints;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import jsonReq.PetReq;

public class PetEndPoint {

	public static String petEndPoint = "v2/pet";
    public static int petReqstatuscode;
    public static int getReqstatuscode;
    public static int delReqstatuscode;
    public static  Response response; 
    
    @Test
    //Code for post request
    public static void postPetReq() {
        
        try {
        	//RestAssured.baseURI = "https://petstore.swagger.io/";
        	response = 
            given()
                    .header("Content-Type", "application/json")
                   // .body(PetReq.petRequest).log().all().when().post("https://petstore.swagger.io/v2/pet")
                    .body(PetReq.petRequest).when().post("https://petstore.swagger.io/v2/pet")
                    .then().extract().response();
    }
        catch(Exception e)
        {
        System.out.print("This is catch block");
    }
    }
  //fetching response code
	public static int petStatuscode() {
		petReqstatuscode = response.statusCode();
        System.out.print("response code" + petReqstatuscode);
        return petReqstatuscode;
	}
	
	//get request
	public static void getPetReq() {
		try {
			response = given()
					.header("Content-Type", "application/json")
					.header("Accept", "application/json")
					.when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then().extract().response();
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody().asString());
			System.out.println(response.getBody().jsonPath().getJsonObject("id").toString());
		} catch (Exception e) {
			
		}
	}
	
	//fetching response code
	public static int getreqstatuscode()
	{ 
		getReqstatuscode=response.statusCode();
		System.out.print("response code" + getReqstatuscode);
		return getReqstatuscode;
		
	}
	
	//delete request
	public static void deletepetReq() {
		try {
        	
        	response = 
            given()
                    .header("Content-Type", "application/json")
                    .body(PetReq.petRequest).when()
                    .delete("https://petstore.swagger.io/v2/pet/9223372000001047000")
                    .then().extract().response();
    }
        catch(Exception e)
        {
        System.out.print("This is catch block");
    }
	}
		
	//fetching response code
		public static int delreqstatuscode()
		{ 
			delReqstatuscode=response.statusCode();
			System.out.print("response code" + delReqstatuscode);
			return delReqstatuscode;
			
		}
		
	
	
}
