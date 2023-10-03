package Session_03;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class test01_getmethod {
	
	@Test
	public void Test01()
	{
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println("Res.code:"+res.getStatusCode());
		System.out.println("Res.Body:"+res.getBody().asString());
		System.out.println("Res.Time:"+res.getTime());
		System.out.println("Res.Header:"+res.getHeader("Content-Type"));
		
		int expectedstatuscode = 200;
	    int actualstatuscode = res.getStatusCode(); 
	    Assert.assertEquals(expectedstatuscode, actualstatuscode); 
	}
	
    @Test
	public void Test02()
	{
		baseURI = "https://reqres.in/api/";
	    given().queryParam("page", "2").when().get().then().statusCode(200);  
  }
}
