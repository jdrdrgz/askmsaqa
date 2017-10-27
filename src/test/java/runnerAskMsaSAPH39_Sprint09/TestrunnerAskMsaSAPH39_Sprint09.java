package runnerAskMsaSAPH39_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH39_Sprint09",
        glue={"stepDefinitionAskMsaSAPH39_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH39_Sprint09/cucumber-html-report","json:GherkinsSAPH39_Sprint09/cucumber-report.json","junit:GherkinsSAPH39_Sprint09/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH39_Sprint09 {

}
