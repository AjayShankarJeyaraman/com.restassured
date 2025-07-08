package StepDef;

import ApiCollection.LoginPage;
import Utills.logger;
import io.cucumber.java.en.Given;

public class GivenClass {

	@Given("Api get Responded")
	public void api_get_responded() {
       LoginPage.getURL();
	}

	
	
	
}
