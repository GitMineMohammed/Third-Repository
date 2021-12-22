package rerunners;

	import org.junit.AfterClass;
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	import reporting.Reporting;

	@RunWith(Cucumber.class)
	@CucumberOptions 
	(features="@rerun:E:\\Eclipse\\Cucumber\\src\\test\\resources\\Re-Run\\failed_scenarios.txt", 
	glue= {"stepdefinitions"},
	monochrome=true,
	dryRun=false)
		
	public class Re_Runner {

		@AfterClass
		public static void afterClass() {
			Reporting.jvmReport("E:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports\\Output.json");
		}
	}