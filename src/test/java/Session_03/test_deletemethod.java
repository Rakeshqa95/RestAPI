package Session_03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class test_deletemethod {
	
	@Test
	public void delete()
	{
		RestAssured.baseURI = "https://reqres.in/api/users/52"; 
		RestAssured.given(). 
		when().delete().  
		then().statusCode(204).log().all();     
	}
}



