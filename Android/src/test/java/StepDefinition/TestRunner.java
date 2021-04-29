package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/androidfeature", glue = {
		"StepDefinition" }, tags = "@smoketest8", monochrome = true, plugin = { "json:target/cucumber.json" }

)

public class TestRunner {

}

