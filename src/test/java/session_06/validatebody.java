package session_06;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class validatebody {
	
	
	@Test
	public void body()
	{
	
		RequestSpecification reqspec = RestAssured.given();  
        reqspec.baseUri("https://reqres.in/");
        reqspec.basePath("api/users?page=2");
        
        Response res = reqspec.get();      
            
        ResponseBody resbody = res.getBody(); 
                              
        String resstring = resbody.asString(); 
                       
       // System.out.println("Response Body" + resstring); 
         
        //get json path view
       JsonPath jsonview = resbody.jsonPath(); 
        
      String firstname = jsonview.get("data[0].first_name"); 
      
      Assert.assertEquals(firstname,"George","Check for presense of Firstname as George");    
       
	}
}
