package runnerAskMsaSAPH26_withEmp_Sprint09;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSAPH26_withEmployeeConnected_Sprint09",
        glue={"stepDefinitionAskMsaSAPH26_withEmployeeConnected_Sprint09"},
        plugin = {"pretty", "html:GherkinsSAPH26_withEmployeeConnected_Sprint09/cucumber-html-report","json:GherkinsSAPH26_withEmployeeConnected_Sprint09/cucumber-report.json","junit:GherkinsSAPH26_withEmployeeConnected_Sprint09/cucumber.xml"}
        )


public class TestrunnerAskMsaSAPH26_withEmp_Sprint09 {

}


