package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue={"stepDefinitions"},
        monochrome = true,
        plugin={"pretty",
                "junit:target/JUnitReports/report.xml","html:target/HTMLReports",
                "json:target/jsonReports/cucumber-report.json"},
        tags="@NegativeTest"
                )

public class TestRunner {
//tags={"@DeletePlace"} compile test verify

}
