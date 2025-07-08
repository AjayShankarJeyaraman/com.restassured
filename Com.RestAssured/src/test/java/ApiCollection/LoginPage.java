package ApiCollection;

import org.testng.Assert;

import Constant.EndPoint;
import Constant.testData;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;

public class LoginPage {
	public static Response response;
	
	
	public static void getURL(){
		response =get(EndPoint.getPage);
	}
	
	public static void getStatusCode() {
		Assert.assertEquals(response.getStatusCode(), testData.Status_200);
	}
	
	public static void getId() {
		
		JsonPath js = response.jsonPath();
		String email = js.get("data[4].email");
		Assert.assertEquals(email, testData.Email);
		
		
	}
	
	
}