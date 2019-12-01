package com.basic.multipleSceanrioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/multipleScenrioFF/"},
		glue ={"com/basic/multipleSceanrioSD/"},
		plugin ={"pretty",
				  "html:target/cucumber-htmlreport2",
				   "json:target/cucumber-report2.json"},
		 monochrome = true
		
		
		
		)
public class RunMymultipleScenarioTest {

}
