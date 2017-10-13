package runnerAskMsaSASM29;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinAskMsa",
        glue={"stepDefinitionAskMsaSASM29"},
        plugin = {"pretty", "html:GherkinAskMsa/cucumber-html-report","json:GherkinAskMsa/cucumber-report.json","junit:GherkinAskMsa/cucumber.xml"}
        )

public class TestrunnerAskMsaSASM29 {

}
