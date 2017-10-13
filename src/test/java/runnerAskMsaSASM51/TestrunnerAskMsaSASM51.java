package runnerAskMsaSASM51;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM51",
        glue={"stepDefinitionAskMsaSASM51"},
        plugin = {"pretty", "html:GherkinsSASM51/cucumber-html-report","json:GherkinsSASM51/cucumber-report.json","junit:GherkinsSASM51/cucumber.xml"}
        )

public class TestrunnerAskMsaSASM51 {

}
