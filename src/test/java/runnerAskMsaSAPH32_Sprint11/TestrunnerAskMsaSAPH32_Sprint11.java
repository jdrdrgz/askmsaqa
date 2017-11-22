package runnerAskMsaSAPH32_Sprint11;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH32_Sprint11",
        glue={"stepDefinitionAskMsaSAPH32_Sprint11"},
        plugin = {"pretty", "html:GherkinsSAPH32_Sprint11/cucumber-html-report","json:GherkinsSAPH32_Sprint11/cucumber-report.json","junit:GherkinsSAPH32_Sprint11/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH32_Sprint11 {

}
