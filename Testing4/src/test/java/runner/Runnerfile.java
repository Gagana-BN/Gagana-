package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = "src/test/java/Logiin.feature",
glue= {"Stepdefinitions"},
tags = "@SmokeTest"

)


public class Runnerfile extends AbstractTestNGCucumberTests {
	
}
	
  