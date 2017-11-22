package runnerAskMsaSAPH67_Sprint11;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH67_Sprint11",
        glue={"stepDefinitionAskMsaSAPH67_Sprint11"},
        plugin = {"pretty", "html:GherkinsSAPH67_Sprint11/cucumber-html-report","json:GherkinsSAPH67_Sprint11/cucumber-report.json","junit:GherkinsSAPH67_Sprint11/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH67_Sprint11 {

}
