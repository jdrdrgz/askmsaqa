package runnerAskMsaSAPH69_Sprint10;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH69_Sprint10",
        glue={"stepDefinitionAskMsaSAPH69_Sprint10"},
        plugin = {"pretty", "html:GherkinsSAPH69_Sprint10/cucumber-html-report","json:GherkinsSAPH69_Sprint10/cucumber-report.json","junit:GherkinsSAPH69_Sprint10/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH69_Sprint10 {

}
