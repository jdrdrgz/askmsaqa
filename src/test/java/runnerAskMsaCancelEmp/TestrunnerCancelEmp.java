package runnerAskMsaCancelEmp;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsCancelEmp",
        glue={"stepDefinitionAskMsaCancelEmp"},
        plugin = {"pretty", "html:GherkinsCancelEmp/cucumber-html-report","json:GherkinsCancelEmp/cucumber-report.json","junit:GherkinsCancelEmp/cucumber.xml"}
        )

public class TestrunnerCancelEmp {

}
