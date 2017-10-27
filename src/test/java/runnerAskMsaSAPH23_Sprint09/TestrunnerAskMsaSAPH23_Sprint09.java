package runnerAskMsaSAPH23_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH23_Sprint09",
        glue={"stepDefinitionAskMsaSAPH23_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH23_Sprint09/cucumber-html-report","json:GherkinsSAPH23_Sprint09/cucumber-report.json","junit:GherkinsSAPH23_Sprint09/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH23_Sprint09 {

}
