package runnerAskMsaSAPH38_Sprint09;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH38_Sprint09",
        glue={"stepDefinitionAskMsaSAPH38_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH38_Sprint09/cucumber-html-report","json:GherkinsSAPH38_Sprint09/cucumber-report.json","junit:GherkinsSAPH38_Sprint09/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH38_Sprint09 {

}
