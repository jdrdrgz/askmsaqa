package runnerAskMsaSASM58;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="GherkinsSASM58",
        glue={"stepDefinitionAskMsaSASM58"},
        plugin = {"pretty", "html:GherkinsSASM58/cucumber-html-report","json:GherkinsSASM58/cucumber-report.json","junit:GherkinsSASM58/cucumber.xml"}
        )

public class TestrunnerAskMsaSASM58 {

}
