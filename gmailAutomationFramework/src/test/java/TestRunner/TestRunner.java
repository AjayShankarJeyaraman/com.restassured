package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature",   // This points to all your .feature files
    glue = {"stepdefinitions", "hooks"},       // Your step defs and hooks
    tags = "@UploadMedia",                     // <<<<<< THIS filters to only one scenario
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty.html",
        "json:target/cucumber-reports/CucumberTestReport.json"
    },
    monochrome = true,
    dryRun = false
)
public class TestRunner {
}
