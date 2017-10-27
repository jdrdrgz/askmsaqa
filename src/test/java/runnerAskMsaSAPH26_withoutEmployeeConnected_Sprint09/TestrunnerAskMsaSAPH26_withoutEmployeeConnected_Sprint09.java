package runnerAskMsaSAPH26_withoutEmployeeConnected_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH26_withoutEmployeeConnected_Sprint09",
        glue={"stepDefinitionAskMsaSAPH26_withoutEmployeeConnected_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH26_withoutEmployeeConnected_Sprint09/cucumber-html-report","json:GherkinsSAPH26_withoutEmployeeConnected_Sprint09/cucumber-report.json","junit:GherkinsSAPH26_withoutEmployeeConnected_Sprint09/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH26_withoutEmployeeConnected_Sprint09 {

}
