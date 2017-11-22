package runnerAskMsaSAPH70_Sprint11;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH70_Sprint11",
        glue={"stepDefinitionAskMsaSAPH70_Sprint11"},
        plugin = {"pretty", "html:GherkinsSAPH70_Sprint11/cucumber-html-report","json:GherkinsSAPH70_Sprint11/cucumber-report.json","junit:GherkinsSAPH70_Sprint11/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH70_Sprint11 {

}
