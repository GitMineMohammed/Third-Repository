package testrunners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reporting.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions 
(features="E:\\Eclipse\\Cucumber\\src\\test\\resources\\Features\\Adactin.feature", 
glue= {"stepdefinitions"},
monochrome=true,
tags= {"@E2EBooking"},
dryRun=false,
plugin= {"pretty","json:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.json"})
	
public class Test_Runner {

	@AfterClass
	public static void afterClass() {
		Reporting.jvmReport("E:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.json");
	}
}