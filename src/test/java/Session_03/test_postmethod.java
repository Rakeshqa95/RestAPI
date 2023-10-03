package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class test_postmethod {

	@Test
	public void Post()
	{
		JSONObject jsondata = new JSONObject();
		jsondata.put("name", "morpheus");
		jsondata.put("job", "leader");
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).body(jsondata.toJSONString()).
		when().post().
		then().statusCode(201).log().all(); 		
	}	
}




