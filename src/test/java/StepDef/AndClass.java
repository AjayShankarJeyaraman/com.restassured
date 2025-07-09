package StepDef;

import ApiCollection.LoginPage;
import Utills.logger;
import io.cucumber.java.en.And;

public class AndClass{
	
	@And("Verify the Status Code")
	public void verify_the_status_code() {
	   logger.Log.info("To check the Status Code");
		LoginPage.getStatusCode();
	}

	@And("Verify the id")
	public void verify_the_id() {
	   
		LoginPage.getId();

}
	
}