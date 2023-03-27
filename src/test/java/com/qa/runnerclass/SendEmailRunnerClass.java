package com.qa.runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features= {"C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.twitter.mail\\src\\test\\resources\\features\\Example1.feature"},
		
		glue= {"com.qa.stepdef"},
		
		tags= "@smoketest",
		
		monochrome=true,
		
		plugin= {"pretty","html:target/results"}
		)

public class SendEmailRunnerClass extends AbstractTestNGCucumberTests {

}
