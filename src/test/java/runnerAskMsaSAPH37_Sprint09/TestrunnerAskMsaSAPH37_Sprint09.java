package runnerAskMsaSAPH37_Sprint09;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH37_Sprint09",
        glue={"stepDefinitionAskMsaSAPH37_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH37_Sprint09/cucumber-html-report","json:GherkinsSAPH37_Sprint09/cucumber-report.json","junit:GherkinsSAPH37_Sprint09/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH37_Sprint09 {

}
