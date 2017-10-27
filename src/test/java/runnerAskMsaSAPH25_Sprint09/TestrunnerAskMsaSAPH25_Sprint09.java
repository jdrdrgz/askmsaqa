package runnerAskMsaSAPH25_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH25_Sprint09",
        glue={"stepDefinitionAskMsaSAPH25_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH25_Sprint09/cucumber-html-report","json:GherkinsSAPH25_Sprint09/cucumber-report.json","junit:GherkinsSAPH25_Sprint09/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH25_Sprint09 {

}
