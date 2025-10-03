package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="@target/rerun.txt",
		glue = "com.app.stepdefinition",
		dryRun = false,
		publish = true,
		monochrome = true,
		plugin = {
		        "pretty",
		        "html:target/cucumber-reports.html",
		        "json:target/cucumber.json"
		    //    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // <- Important
		    })
public class ReRunner {

}
