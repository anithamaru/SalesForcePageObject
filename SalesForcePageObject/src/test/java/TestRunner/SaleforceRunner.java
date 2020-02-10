package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Java_Anitha\\SalesForcePageObject\\src\\test\\java\\Feature\\Salesforce.Feature",
		glue= "StepDefinition",
		monochrome = false,
				format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
				//tags= {"@SmokeTest"},
		dryRun=false
		)


public class SaleforceRunner extends AbstractTestNGCucumberTests{

}
