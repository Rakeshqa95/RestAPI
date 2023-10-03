package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class test02_putmethod {

	@Test
	public void test02()
	{
		JSONObject jsondata = new JSONObject();
		jsondata.put("name", "Rakesh");
		jsondata.put("job", "Sr. QA");
		
		RestAssured.baseURI = "https://reqres.in/api/users/52";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).body(jsondata.toJSONString()).
		when().put().
		then().statusCode(200).log().all();  
		
	}
}
