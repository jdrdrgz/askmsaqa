package runnerAskMsaSASM41;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM41",
        glue={"stepDefinitionAskMsaSASM41"},
        plugin = {"pretty", "html:GherkinsSASM41/cucumber-html-report","json:GherkinAskMsa/cucumber-report.json","junit:GherkinAskMsa/cucumber.xml"}
        )



public class TestrunnerAskMsaSASM41 {

}
