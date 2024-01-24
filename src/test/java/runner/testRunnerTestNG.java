package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/LoginFiles/HerokuLogin.feature"},glue = "stepDefinition")

public class testRunnerTestNG extends AbstractTestNGCucumberTests{
	

}
