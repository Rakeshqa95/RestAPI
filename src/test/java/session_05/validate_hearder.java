package session_05;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class validate_hearder {
	
	@Test
	public void GetSingleUser()
	{
		RequestSpecification reqspec = RestAssured.given(); 
		
		reqspec.baseUri("https://reqres.in"); 
		reqspec.basePath("/api/users/2"); 
		Response res = reqspec.get(); 
		
		String contentType = res.getHeader("Content-Type");              
		System.out.println("contentType");    
		
	}
}

                    
                   