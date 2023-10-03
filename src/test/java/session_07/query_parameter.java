package session_07;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class query_parameter {
	
	@Test
	public void queryvalidate()
	{
		RequestSpecification reqspec = RestAssured.given();
		
		reqspec.baseUri("https://reqres.in/");
		reqspec.basePath("/api/users");
        reqspec.queryParam("page", 2).queryParam("id", 10);		
		Response res = reqspec.get();
		        
		String responsebody = res.getBody().asString();       
		System.out.println("Response Body :" + responsebody);     
		                  
		JsonPath jsonpathview = res.jsonPath();   
		                                                              
		//get first_name   
		String fistname=jsonpathview.get("data.first_name");                 		             
		Assert.assertEquals(fistname,"Byron","Verify firstname");                 
	                                                                             	       
	}	
}
