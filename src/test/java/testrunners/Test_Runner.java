package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
(features="E:\\Eclipse\\Cucumber\\src\\test\\resources\\Features\\Feature_Adactin.feature", 
glue= {"stepdefinitions"},
monochrome=true,
tags= {"@E2EBooking"},
dryRun=false,
plugin= {"pretty","html:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.html"})
	
public class Test_Runner {
	
//Reporting.jvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Output.json");
}
