package runnerAskMsaSAPH24_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH24_Sprint09",
        glue={"stepDefinitionAskMsaSAPH24_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH24_Sprint09/cucumber-html-report","json:GherkinsSAPH24_Sprint09/cucumber-report.json","junit:GherkinsSAPH24_Sprint09/cucumber.xml"}
        )

public class TestrunnerASkMsaSAPH24_Sprint09 {

}
