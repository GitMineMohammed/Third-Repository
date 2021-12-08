package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.BaseClass_Cucumber;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass_Cucumber {

	@Before
	public void before() {

	}

	@Before("@loginPage")
	public void initialization() {

		chromeLaunch("http://adactinhotelapp.com/HotelAppBuild2/");
		System.out.println("Launching browser from Hooks class");
		System.out.println(
				"----------------------------------------Scenario Started----------------------------------------");
	}

	@After()
	public void after(Scenario scenario) {

		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
		System.out.println(
				"----------------------------------------Scenario Ended----------------------------------------");
	}

	@After("@bookingPage")
	public void tearDown() {
		driver.close();
		System.out.println("Closing browser from Hooks class");

	}

}
