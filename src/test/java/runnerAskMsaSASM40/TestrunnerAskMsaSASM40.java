package runnerAskMsaSASM40;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM40",
        glue={"stepDefinitionAskMsaSASM40"},
        plugin = {"pretty", "html:GherkinsSASM40/cucumber-html-report","json:GherkinAskMsa/cucumber-report.json","junit:GherkinAskMsa/cucumber.xml"}
        )


public class TestrunnerAskMsaSASM40 {

}
