package runnerAskMsaSAPH30_Sprint10;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH30_Sprint10",
        glue={"stepDefinitionAskMsaSAPH30_Sprint10"},
        plugin = {"pretty", "html:GherkinsSAPH30_Sprint10/cucumber-html-report","json:GherkinsSAPH30_Sprint10/cucumber-report.json","junit:GherkinsSAPH30_Sprint10/cucumber.xml"}
        )

public class TestrunnerAskMsaSAPH30_Sprint10 {

}
