package runnerAskMsaSAPH22;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH22",
        glue={"stepDefinitionAskMsaSAPH22"},
        plugin = {"pretty", "html:GherkinsSAPH22/cucumber-html-report","json:GherkinsSAPH22/cucumber-report.json","junit:GherkinsSAPH22/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH22 {

}
