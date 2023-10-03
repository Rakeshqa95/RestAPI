package session_04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class checkforvalidresponse {
	
	
	@Test 
	public void singleuserget()
	{
		RestAssured.baseURI = "https://reqres.in/api/users/2"; 		
		RequestSpecification reqspec = RestAssured.given(); 
		Response response = reqspec.get(); 
		int statuscode = response.getStatusCode(); 
        Assert.assertEquals(statuscode,200,"Correct Status code");
        
      String statusline =  response.getStatusLine();  
      Assert.assertEquals(statusline,"HTTP/1.1 200 OK", "incorrect status line is returned");     
                                                                                       
	}
}