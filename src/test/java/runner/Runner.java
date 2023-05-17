package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
					features = "Feature", 
				  	glue = {"com.stepdefinitions","com.hooks"},
//					dryRun = true, //dry run equals true means - it will check only the corresponding step def and it will not execute.
//				  	strict=true,// it will start the execution and if there is no step def it will throw exception that particular line.
//				  	monochrome=true, // to print the console output in human readable file.
				  	plugin= {"html:report/WebReport", "json:report/jsonreport.json"},
				  	tags = "@tag",
				  	publish = true
		)

public class Runner {

}
