package com.automation.steps;

import com.automation.config.ConfigManager;
import com.automation.pages.BasePage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ContentManagement extends BasePage {
	
	
	private final ConfigManager configManager;
	
	public ContentManagement() {
		this.configManager = ConfigManager.getInstance();
	}
	
	@Then("User should be navigated to the Dashboard page")
	public void user_should_be_navigated_to_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User clicks the Content Management button")
	public void user_clicks_the_content_management_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enters values in the New Content form")
	public void user_enters_values_in_the_new_content_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User uploads the file")
	public void user_uploads_the_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User selects the Landscape radio button")
	public void user_selects_the_landscape_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User clicks the Upload button")
	public void user_clicks_the_upload_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should see the new content created successfully")
	public void user_should_see_the_new_content_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
