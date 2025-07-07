package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Feature",
	    glue = {"stepdefinitions", "hooks"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/cucumber.html",
	        "json:target/cucumber-reports/cucumber.json"
	    },
	    monochrome = true,
	    dryRun = false,
	    tags = "@UploadMedia" // This runs only the tagged scenario
	)

public class TestRunner {
}
