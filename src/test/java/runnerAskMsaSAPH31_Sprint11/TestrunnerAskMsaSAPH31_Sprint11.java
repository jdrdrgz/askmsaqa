package runnerAskMsaSAPH31_Sprint11;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH31_Sprint11",
        glue={"stepDefinitionAskMsaSAPH31_Sprint11"},
        plugin = {"pretty", "html:GherkinsSAPH31_Sprint11/cucumber-html-report","json:GherkinsSAPH31_Sprint11/cucumber-report.json","junit:GherkinsSAPH31_Sprint11/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH31_Sprint11 {

}
