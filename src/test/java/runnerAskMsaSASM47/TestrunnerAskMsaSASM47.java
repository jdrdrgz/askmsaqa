package runnerAskMsaSASM47;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM47",
        glue={"stepDefinitionAskMsaSASM47"},
        plugin = {"pretty", "html:GherkinsSASM47/cucumber-html-report","json:GherkinAskMsa/cucumber-report.json","junit:GherkinAskMsa/cucumber.xml"}
        )




public class TestrunnerAskMsaSASM47 {

}
