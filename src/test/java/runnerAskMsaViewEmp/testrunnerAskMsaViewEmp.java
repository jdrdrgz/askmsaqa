package runnerAskMsaViewEmp;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsEmp01",
		glue={"stepDefinitionAskMsaAskMsaViewEmp"},
		plugin = {"pretty", "html:GherkinsEmp01/cucumber-html-report","json:GherkinsEmp01/cucumber-report.json","junit:GherkinsEmp01/cucumber.xml"}
)

public class testrunnerAskMsaViewEmp {

}
