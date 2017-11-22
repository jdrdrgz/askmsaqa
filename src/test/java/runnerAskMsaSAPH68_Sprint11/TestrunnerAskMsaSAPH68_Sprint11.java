package runnerAskMsaSAPH68_Sprint11;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH68_Sprint11",
        glue={"stepDefinitionAskMsaSAPH68_Sprint11"},
        plugin = {"pretty", "html:GherkinsSAPH68_Sprint11/cucumber-html-report","json:GherkinsSAPH68_Sprint11/cucumber-report.json","junit:GherkinsSAPH68_Sprint11/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH68_Sprint11 {

}
