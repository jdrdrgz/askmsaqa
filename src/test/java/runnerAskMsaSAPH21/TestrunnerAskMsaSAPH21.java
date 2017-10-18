package runnerAskMsaSAPH21;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH21",
        glue={"stepDefinitionAskMsaSAPH21"},
        plugin = {"pretty", "html:GherkinsSAPH21/cucumber-html-report","json:GherkinsSAPH21/cucumber-report.json","junit:GherkinsSAPH21/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH21 {

}
