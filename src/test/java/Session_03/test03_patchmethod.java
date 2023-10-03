package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class test03_patchmethod {
	
	@Test
	public void testpatch()
	{
		JSONObject jsondata = new JSONObject();
		jsondata.put("name", "patil");
        jsondata.put("job", "tester");	
        
        RestAssured.baseURI= "https://reqres.in/api/users/52";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).body(jsondata.toJSONString()).
		when().patch().
		then().statusCode(200).log().all();    
	}	
}
