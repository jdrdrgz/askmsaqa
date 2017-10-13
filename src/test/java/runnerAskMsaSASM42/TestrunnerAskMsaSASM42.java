package runnerAskMsaSASM42;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM42",
        glue={"stepDefinitionAskMsaSASM42"},
        plugin = {"pretty", "html:GherkinsSASM42/cucumber-html-report","json:GherkinAskMsa/cucumber-report.json","junit:GherkinAskMsa/cucumber.xml"}
        )




public class TestrunnerAskMsaSASM42 {

}
