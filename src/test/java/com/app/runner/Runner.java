package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/app/feature",
		glue = "com.app.stepdefinition",
		dryRun = false,
		tags="@tag1_mobile",
		publish = true,
		monochrome = true,
		plugin = {
		        "pretty",
		        "html:target/cucumber-reports.html",
		        "json:target/cucumber.json",
		        "rerun:target/rerun.txt",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // <- Important
		    })

public class Runner {

}
