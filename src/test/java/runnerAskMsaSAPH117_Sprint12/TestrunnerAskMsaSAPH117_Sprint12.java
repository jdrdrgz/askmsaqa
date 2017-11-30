package runnerAskMsaSAPH117_Sprint12;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH117_Sprint12",
        glue={"stepDefinitionAskMsaSAPH117_Sprint12"},
        plugin = {"pretty", "html:GherkinsSAPH117_Sprint12/cucumber-html-report","json:GherkinsSAPH117_Sprint12/cucumber-report.json","junit:GherkinsSAPH117_Sprint12/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH117_Sprint12 {

}
