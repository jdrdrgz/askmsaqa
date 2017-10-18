package runnerAskMsaSAPH33;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH33",
        glue={"stepDefinitionAskMsaSAPH33"},
        plugin = {"pretty", "html:GherkinsSAPH33/cucumber-html-report","json:GherkinsSAPH33/cucumber-report.json","junit:GherkinsSAPH33/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH33 {

}
