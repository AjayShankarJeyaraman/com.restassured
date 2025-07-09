package Driver;

import io.cucumber.java.Before;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import Utills.properties;


public class BaseTest{
	
	static properties prop = new properties();
	@Before()
	public static void BaseURI() throws IOException{
		baseURI = prop.getBaseURI();
	}
	
}