package testrunners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reporting.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions 
(features="E:\\Eclipse\\Cucumber\\src\\test\\resources\\Features", 
glue= {"stepdefinitions"},
monochrome=true,
tags= {"@E2EBooking"},
strict=true,
dryRun=false,
plugin= {"pretty","json:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.json",
		"rerun:E:\\Eclipse\\Cucumber\\src\\test\\resources\\Re-Run\\failed_scenarios.txt"})
	
public class Test_Runner {

	@AfterClass
	public static void afterClass() {
		Reporting.jvmReport("E:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.json");
	}
}