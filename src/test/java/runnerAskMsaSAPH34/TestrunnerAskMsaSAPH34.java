package runnerAskMsaSAPH34;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH34",
        glue={"stepDefinitionAskMsaSAPH34"},
        plugin = {"pretty", "html:GherkinsSAPH34/cucumber-html-report","json:GherkinsSAPH34/cucumber-report.json","junit:GherkinsSAPH34/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH34 {

}
