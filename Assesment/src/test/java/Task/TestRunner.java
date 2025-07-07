package Task;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/CucumberFeature/cucumber.feature",
    glue = "Task",
    dryRun = false,
    monochrome = true
    
)
public class TestRunner {
}
