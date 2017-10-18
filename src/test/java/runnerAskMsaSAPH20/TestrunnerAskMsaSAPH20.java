package runnerAskMsaSAPH20;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH20",
        glue={"stepDefinitionAskMsaSAPH20"},
        plugin = {"pretty", "html:GherkinsSAPH20/cucumber-html-report","json:GherkinsSAPH20/cucumber-report.json","junit:GherkinsSAPH20/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH20 {

}
