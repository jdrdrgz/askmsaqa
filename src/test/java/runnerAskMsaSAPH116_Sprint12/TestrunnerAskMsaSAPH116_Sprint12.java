package runnerAskMsaSAPH116_Sprint12;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH116_Sprint12",
        glue={"stepDefinitionAskMsaSAPH116_Sprint12"},
        plugin = {"pretty", "html:GherkinsSAPH116_Sprint12/cucumber-html-report","json:GherkinsSAPH116_Sprint12/cucumber-report.json","junit:GherkinsSAPH116_Sprint12/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH116_Sprint12 {

}
