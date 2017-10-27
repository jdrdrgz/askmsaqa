package runnerAskMsaSAPH19;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH19_Sprint09",
        glue={"stepDefinitionAskMsaSAPH19_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH19_Sprint09/cucumber-html-report","json:GherkinsSAPH19_Sprint09/cucumber-report.json","junit:GherkinsSAPH19_Sprint09/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH19_Sprint09 {

}
