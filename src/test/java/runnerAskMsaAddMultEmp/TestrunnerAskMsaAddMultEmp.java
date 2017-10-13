package runnerAskMsaAddMultEmp;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsAddEmpMult",
        glue={"stepDefinitionAskMsaAddMultEmp"},
        plugin = {"pretty", "html:GherkinsAddEmpMult/cucumber-html-report","json:GherkinsAddEmpMult/cucumber-report.json","junit:GherkinsAddEmpMult/cucumber.xml"}
        )

public class TestrunnerAskMsaAddMultEmp {

}
