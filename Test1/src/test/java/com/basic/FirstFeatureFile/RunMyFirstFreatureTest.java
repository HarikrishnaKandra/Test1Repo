package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/FirstFeatuteFileFF/"},
		glue ={"com/basic/FirstFeatureFile/"},
		plugin ={"pretty",
				  "html:target/cucumber-htmlreport1",
				   "json:target/cucumber-report1.json",
				  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				  },
		 monochrome = true
		
		
		
		)
public class RunMyFirstFreatureTest {

}
