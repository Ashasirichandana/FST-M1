package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
    features = "src/test/java/Features",
            glue = {"StepDefinitions"},
            tags = "@activity5",
            publish = true
//pluigin ={"html:src/reports/HTML_Report.html"}
)

public class TestRunner {
//empty
}