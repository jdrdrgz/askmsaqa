package runnerAskMsaSAPH66_Sprint10;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH66_Sprint10",
        glue={"stepDefinitionAskMsaSAPH66_Sprint10"},
        plugin = {"pretty", "html:GherkinsSAPH66_Sprint10/cucumber-html-report","json:GherkinsSAPH66_Sprint10/cucumber-report.json","junit:GherkinsSAPH66_Sprint10/cucumber.xml"}
        )
public class TestrunnerAskMsaSAPH66_Sprint10 {

}
