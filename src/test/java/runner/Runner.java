package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/login.feature", glue = {"src/test/java/stepDefinitions"}, monochrome=true)
public class Runner {

}
